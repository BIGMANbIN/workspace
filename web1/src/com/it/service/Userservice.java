package com.it.service;

import com.it.dao.UserDao;
import com.it.entity.User;
import com.it.util.EmailUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.x509.SubjectAlternativeNameExtension;


//如何根据账号和密码验证是否登陆成功

public class Userservice {

    private final String SALT = "sadhjsk343fs@!#$#@%$#^#$%#$%@#$!FSDFWE$@#%";

    private Logger logger = LoggerFactory.getLogger(Userservice.class);
    private UserDao userdao = new UserDao();


    /**
     *登陆
     * @param username  用户名
     * @param password  密码
     * @return 登陆成功返回一个user对象，失败返回null
     */
    public User login(String username, String password){


        User user = UserDao.findByUsername(username);
        //password = DigestUtils.md5Hex(password);

        if (user != null && user.getPassword().equals(password)){

            logger.debug("{}登陆成功",user);

            EmailUtil.HtmlEmail(user.getAddress(),"账号登陆提示","您的账号"+username+"登陆了系统");

            return user;
        }

        return null;
    }

}


