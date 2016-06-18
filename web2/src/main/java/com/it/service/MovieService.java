package com.it.service;


import com.it.dao.MovieDao;
import com.it.entity.Movie;
import com.it.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class MovieService {

    private MovieDao movieDao = new MovieDao();

    public List<Movie> findAllMovie(){
        return movieDao.findAll();

    }

    Logger logger = LoggerFactory.getLogger(MovieService.class);
    public Page<Movie> findByPageNo(int pageNo){

        int totalSize = movieDao.count().intValue();//获取数据库中数据的总数


        Page<Movie> page = new Page<>(totalSize,10,pageNo);

        List<Movie> movieList = movieDao.findByPage(page.getStart(),10);
        page.setItems(movieList);
        logger.debug("movieList:{},start:{}",movieList);
        return page;

        /*
        int totalsize = movieDao.count().intValue();//获取数据库中数据的总数
        int size = 10;//每页的数量
        int totalpagesize = totalsize / size; //总页数
        //判断如果总页数余每页的数量不等于0 则总页数++
        if(totalsize % size != 0){
            totalpagesize++;
        }
        //判断如果当前页数大于总页数，则显示总页数
        if (pageNo > totalpagesize){
            pageNo = totalpagesize;
        }

        int start = (pageNo - 1) * size;//当前页面的起始行数
        return movieDao.findByPage(start,size);
        **/

    }
}
