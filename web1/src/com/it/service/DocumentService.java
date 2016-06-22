package com.it.service;


import com.it.dao.DocumentDao;
import com.it.util.Document;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;
import java.util.UUID;

public class DocumentService {

    private DocumentDao documentDao = new DocumentDao();

    public void updateFlie(String fileName, Long size, InputStream inputStream) throws IOException {

        //为了支持inputstream的reset方法，将inputstream转换为ByteArrayInputStream
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.toByteArray(inputStream));
        //计算MD5值
        String md5 = DigestUtils.md5Hex(byteArrayInputStream);

        //根据MD5查找数据库中是否存在文件
        Document document = documentDao.findByMd5(md5);
        if (document == null) {
            //保存
            String saveFilename = saveFile(fileName, byteArrayInputStream);

            document = new Document();
            document.setFilename(fileName);
            document.setSavename(saveFilename);
            document.setExtname(fileName.substring(fileName.indexOf(".")));
            document.setMd5(md5);
            document.setSize(size);
            document.setDisplaysize(FileUtils.byteCountToDisplaySize(size));

            documentDao.save(document);
        }

    }

    private String saveFile(String fileName, InputStream inputStream) throws IOException {

        inputStream.reset();

        File dir = new File("E:/upload");
        if (!dir.exists()) {
            dir.mkdir();
        }


        String extName = fileName.substring(fileName.indexOf("."));
        String uuid = UUID.randomUUID().toString();
        fileName = uuid + extName;
        FileOutputStream output = new FileOutputStream(new File(dir, fileName));
        IOUtils.copy(inputStream, output);

        output.flush();
        output.close();
        inputStream.close();

        return fileName;
    }

    public List<Document> findAllDocument() {
        return documentDao.findAll();
    }

    public Document findDocumentByMd5(String md5) {
        return documentDao.findByMd5(md5);
    }


}