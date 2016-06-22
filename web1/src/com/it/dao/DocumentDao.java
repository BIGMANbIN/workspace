package com.it.dao;


import com.it.util.DbHelp;
import com.it.util.Document;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class DocumentDao {

    public void save(Document document){
        String sql = "insert into document(filename,savename,extname,md5,size,displaysize) values (?,?,?,?,?,?)";
        DbHelp.update(sql,document.getFilename(),document.getSavename(),document.getExtname(),document.getMd5(),document.getSize(),document.getDisplaysize());
    }

    public Document findByMd5(String md5){
        String sql = "select * from document where md5 = ?";
        return DbHelp.query(sql,new BeanHandler<>(Document.class),md5);
    }

    public List<Document> findAll(){
        String sql = "select * from document where order by id desc";
        return DbHelp.query(sql,new BeanListHandler<>(Document.class));
    }

}
