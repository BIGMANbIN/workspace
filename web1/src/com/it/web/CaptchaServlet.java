package com.it.web;

import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.service.Captcha;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;


//把验证码输出到网页上面


@WebServlet("/Captcha.png")
public class CaptchaServlet extends HttpServlet {


    private Logger logger = LoggerFactory.getLogger(CaptchaServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ConfigurableCaptchaService service = new ConfigurableCaptchaService();
        service.setColorFactory(new SingleColorFactory(new Color(60, 80, 170)));
        service.setFilterFactory(new CurvesRippleFilterFactory(service.getColorFactory()));

        OutputStream outputStream = resp.getOutputStream();//相应输出流

        String captcha = EncoderHelper.getChallangeAndWriteImage(service,"png",outputStream);

        //把验证码放到sesison

        HttpSession session = req.getSession();

        session.setAttribute("captcha",captcha);

        logger.debug("captcha:{}",captcha);

        outputStream.flush();
        outputStream.close();
    }


}
