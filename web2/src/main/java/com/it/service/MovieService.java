package com.it.service;


import com.it.dao.MovieDao;
import com.it.entity.Movie;

import java.util.List;

public class MovieService {

    private MovieDao movieDao = new MovieDao();

    public List<Movie> findAllMovie(){
        return movieDao.findAll();

    }

    public List<Movie> findByPageNo(int pageNo){
        int totalsize = movieDao.count().intValue();//获取数据库中数据的总数

        int size = 10;//每页的数量
        int start = (pageNo - 1) * size;//当前页面的起始行数
        int totalpagesize = totalsize / size; //总页数
        //判断如果总页数余每页的数量不等于0 则总页数++
        if(totalsize % size != 0){
            totalpagesize++;
        }
        //判断如果当前页数大于总页数，则显示总页数
        if (pageNo > totalpagesize){
            pageNo = totalpagesize;
        }

        start = (pageNo - 1) * size;
        return movieDao.findByPage(start,size);

    }
}
