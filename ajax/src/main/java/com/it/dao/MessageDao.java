package com.it.dao;

import com.it.entity.Message;
import com.it.util.DbHelp;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class MessageDao {

    public List<Message> findAll(){
        String sql = "select * from message order by id desc";
        return DbHelp.query(sql,new BeanListHandler<>(Message.class));

    }

    public List<Message> findByMaxId(String maxId){
        String sql = "select * from message where id > ? order by id desc";
        return DbHelp.query(sql,new BeanListHandler<>(Message.class),maxId);
    }

}
