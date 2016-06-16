package com.it.web;

import com.it.entity.User;
import com.it.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")//给控制器起名
public class LoginServlet extends HttpServlet{

    private Logger logger = LoggerFactory.getLogger(LoginServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //先看验证码对不对

        //1.把验证码放入到session

        String captcha = req.getParameter("captcha");//2.获取表单中的验证码

        //3.获取session中的验证码
        String sessionCaptcha = (String) req.getSession().getAttribute("captcha");

        if(captcha != null && captcha.equalsIgnoreCase(sessionCaptcha)){

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            logger.debug("{}登陆成功",username);


            //根据账号密码判断是否登陆成功

            Userservice userservice = new Userservice();

            User user = userservice.login(username,password);

            if (user != null){
                logger.debug("登录成功，显示主页");
            }else{
                resp.sendRedirect("/login?code=1002");
            }



        }else{

            logger.warn("验证码错误");
            resp.sendRedirect("/login?code=1001");
        }



    }
}
