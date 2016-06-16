package com.it.web;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.Buffer;
import java.util.UUID;

@WebServlet("/file/upload")
@MultipartConfig //上传文件时提交表单的注解servlet3专用

public class Servlet3FileuploadServlet extends HttpServlet{

    private Logger logger = LoggerFactory.getLogger(Servlet3FileuploadServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/upload3.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        //获取元素的值
        String fielDesc = req.getParameter("fileDesc");
        logger.debug("文件的描述为：{}",fielDesc);

        //获取文件元素的值
        Part part = req.getPart("doc");

        //获取文件的大小，按字节算
        logger.debug("size:{}",part.getSize());
        InputStream input = part.getInputStream();

        //获取文件的MIME头,指定被下载文件的文件类型
        String contentType = part.getContentType();
        logger.debug("文件的ContentType:{}",contentType);

        //获取文件的初始名
        String fileName = getfileName(part);
        logger.debug("文件的初始名为：{}",fileName);

        saveFile(part);

    }

    private void saveFile(Part part) throws IOException {

        File dir = new File("E:/upload");
        if (!dir.exists()){
            dir.mkdir();
        }

        String fileName = getfileName(part);
        String extName = fileName.substring(fileName.indexOf("."));
        String uuid = UUID.randomUUID().toString();
        fileName = uuid + extName;

        InputStream input  = part.getInputStream();
        FileOutputStream output = new FileOutputStream(new File(dir,getfileName(part)));

        IOUtils.copy(input,output);

        output.flush();
        output.close();
        input.close();


        /*
        BufferedInputStream bufferInput = new BufferedInputStream(input);
        BufferedOutputStream bufferOutput = new BufferedOutputStream(output);

        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = bufferInput.read(buffer)) != -1){
            bufferOutput.write(buffer,0,len);
        }

        **/
    }


    private String getfileName(Part part){
        //截取值
        String headerValue = part.getHeader("Content-Disposition");
        headerValue = headerValue.substring(headerValue.indexOf("filename=\""));
        headerValue = headerValue.substring(headerValue.indexOf("\"")+1,headerValue.length()-1);
        return headerValue;
    }
}
