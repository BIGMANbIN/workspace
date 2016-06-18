package com.it.dao;


import com.it.entity.Movie;
import com.it.util.DbHelp;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.util.List;

public class MovieDao {

    public List<Movie> findAll(){
        String sql = "SELECT * FROM movie";
        return DbHelp.query(sql,new BeanListHandler<>(Movie.class));
    }

    public List<Movie> findByPage(int start, int size){
        String sql = "select * from movie limit ?,?";
        return DbHelp.query(sql,new BeanListHandler<>(Movie.class),start,size);
    }

    public Long count(){
        String sql = "SELECT count(*) from movie";
        return DbHelp.query(sql,new ScalarHandler<Long>());
    }
}
