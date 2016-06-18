package com.it.web;

import com.it.entity.Movie;
import com.it.service.MovieService;
import com.it.util.Page;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/moviehome")
public class MovieHomeServlet extends HttpServlet{


    Logger logger= LoggerFactory.getLogger(MovieHomeServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pageNo = req.getParameter("p");
        int p = 1;
        if (StringUtils.isNumeric(pageNo)) {
            p = Integer.parseInt(pageNo);
        }

        MovieService movieService = new MovieService();
        Page<Movie> page = movieService.findByPageNo(p);

        req.setAttribute("page",page);

        logger.debug("page:{},movieList:{}",page,page.getItems());

        req.getRequestDispatcher("/WEB-INF/views/moviehome.jsp").forward(req,resp);
    }
}
