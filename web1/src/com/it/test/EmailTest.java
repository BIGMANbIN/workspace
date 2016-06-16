package com.it.test;



import com.it.util.EmailUtil;
import org.apache.commons.mail.*;
import org.junit.Test;



public class EmailTest {

    //纯文本文件

    @Test
    public void TextEmail() {

        SimpleEmail email = new SimpleEmail();
        email.setAuthentication("hb_1026","HB920926");
        email.setHostName("smtp.163.com");
        email.setSmtpPort(25);
        email.setCharset("UTF-8");


        try {
            email.setFrom("hb_1026@163.com");
            email.setSubject("会议内容");
            email.setMsg("明天召集大家进行一次重要会议,务必让大家准时参会");
            email.addTo("576237121@qq.com");
            email.send();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //HTML邮件


    @Test
    public void HtmlEmail(){

        HtmlEmail email = new HtmlEmail();
        email.setAuthentication("hb_1026","HB920926");
        email.setHostName("smtp.163.com");
        email.setSmtpPort(25);
        email.setCharset("UTF-8");

        try {
            email.setFrom("hb_1026@163.com");
            email.setSubject("学习表");
            email.setHtmlMsg("<h1 style='color:red'>以图片形式发给你下</h1><img src='http://ww4.sinaimg.cn/mw690/3bb47245jw1eqnm3gh0t9j21kw2dckdp.jpg'/>");
            email.addTo("185869614@qq.com");
            email.send();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void AttachEmail(){

        MultiPartEmail email = new MultiPartEmail();
        email.setAuthentication("hb_1026","HB920926");
        email.setHostName("smtp.163.com");
        email.setSmtpPort(25);
        email.setCharset("UTF-8");


        try {
            email.setFrom("hb_1026@163.com");
            email.setSubject("人事变动通知");
            email.setMsg("你被调到了人事部");
            email.addTo("185869614@qq.com");

            EmailAttachment ea = new EmailAttachment();
            ea.setPath("E:/log4j.log");

            email.attach(ea);
            email.send();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    @Test
    public void testHtmlEmail(){

        EmailUtil.HtmlEmail("185869614@qq.com","到我办公室来","<h2>带上学习资料</h2>");

    }
}



