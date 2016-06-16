package com.it.test;


import org.junit.Test;
import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.font.FontFactory;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.patchca.word.RandomWordFactory;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import static java.awt.Font.*;


public class MyTestCase {

    @Test
    public void TestUUID() {


        UUID uuid = UUID.randomUUID();

        String key = uuid.toString();

        System.out.println(key);

    }

    @Test
    public void TestCaptcha() throws Exception {

        ConfigurableCaptchaService service = new ConfigurableCaptchaService();
        service.setColorFactory(new SingleColorFactory(new Color(60, 80, 170)));
        service.setFilterFactory(new CurvesRippleFilterFactory(service.getColorFactory()));


        //修改验证码长度和内容
        RandomWordFactory factory = new RandomWordFactory();
        factory.setMaxLength(8);
        factory.setMinLength(4);
        factory.setCharacters("UTF-8");
        service.setWordFactory(factory);

        //service.setFontFactory(new FontFactory() {
           //@Override
           //public Font getFont(int i) {
             //return new Font("微软雅黑", Font.ITALIC,24);
           //}
        //});

        FileOutputStream outputStream = new FileOutputStream("E:/pic.png");
        EncoderHelper.getChallangeAndWriteImage(service,"png",outputStream);
        outputStream.flush();
        outputStream.close();

        //

    }
}
