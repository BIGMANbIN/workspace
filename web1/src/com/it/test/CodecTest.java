package com.it.test;


import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.io.FileInputStream;

public class CodecTest {

    @Test
    public void Md5(){

        String password = "123";

        String salt = "sadhjsk343fs@!#$#@%$#^#$%#$%@#$!FSDFWE$@#%";
        //password = DigestUtils.md5Hex(password+salt);
        //System.out.println(password);

        password = DigestUtils.md5Hex(password);
        System.out.println(password);

    }

    @Test
    public void sha(){
        String password = "123";
        String salt = "asdhjk@#$%&($^%#!#%%%#^$%%#@@!FDSF#%$^%TFFFDTY%$";
        password = DigestUtils.sha1Hex(password+salt);
        System.out.println(password);

    }


    //判断两个文件是否相同
    @Test
    public void file() throws Exception {


        //c9b21ccbaa7daaf9e1bf93e5333ef5be
        //32178da9aea5034efd2d750228d3a998
        FileInputStream inputStream = new FileInputStream("E:/logback.log");

        String md5 = DigestUtils.md5Hex(inputStream);
        System.out.println(md5);
    }


}
