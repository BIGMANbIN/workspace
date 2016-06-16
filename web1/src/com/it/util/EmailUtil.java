package com.it.util;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmailUtil {

    private static Logger logger = LoggerFactory.getLogger(EmailUtil.class);

    /**
     * HTML邮件
     * @param address 收件人地址
     * @param subject 主题
     * @param html    格式HTML
     */
    public static void HtmlEmail(String address,String subject,String html){
        HtmlEmail email = new HtmlEmail();

        email.setHostName(Config.get("email.hostname"));
        email.setSmtpPort(Integer.parseInt(Config.get("email.port","25")));
        email.setAuthentication(Config.get("email.username"),Config.get("email.password"));
        email.setCharset(Config.get("email.charset"));


        try {
            email.setFrom(Config.get("email.fromemail"));
            email.setSubject(Config.get("email.subject"));
            email.setHtmlMsg(html);
            email.addTo(address);

            email.send();

            logger.debug("{}发邮件成功",address);
        } catch (EmailException e) {
            logger.debug("{}发邮件失败",address);
            throw new RuntimeException("发送邮件异常",e);
        }




    }


}
