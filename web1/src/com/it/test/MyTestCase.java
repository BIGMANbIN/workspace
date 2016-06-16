package com.it.test;


import org.joda.time.DateTime;
import org.junit.Test;
import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;

import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.patchca.word.RandomWordFactory;

import java.awt.*;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Test
    public void testDate() {
        Date date = new Date(); //现在的时间
        long timeStamp = date.getTime(); //1970年
        System.out.println(timeStamp);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = simpleDateFormat.format(date);
        System.out.println(now);

    }

    @Test
    public void testJodaTime() {
        DateTime dateTime = DateTime.now();
        dateTime = dateTime.plusDays(25);
        dateTime = dateTime.plusHours(35);
        String now = dateTime.toString("yyyy-MM-dd HH:mm:ss");
        System.out.println(now);
    }

    @Test
    public void testFileupload(){
        String headerValue = "form-data; name=\"doc\"; filename=\"苹果 001.JPG\"";
        headerValue = headerValue.substring(headerValue.indexOf("fi"));
        headerValue = headerValue.substring(headerValue.indexOf("\"")+1,headerValue.length()-1);
        System.out.println(headerValue);

    }
}
