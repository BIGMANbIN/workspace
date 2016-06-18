package com.it.web;

import com.it.entity.Movie;
import com.it.service.MovieService;
import com.it.util.Page;
import org.apache.commons.lang3.StringUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/moviehome")
public class MovieHomeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pageNo = req.getParameter("p");
        int p = 1;
        if (StringUtils.isNumeric(pageNo)) {
            p = Integer.parseInt(pageNo);
        }

        MovieService movieService = new MovieService();
       List<Movie> movieList = movieService.findByPageNo(p);
        req.setAttribute("movieList",movieList);

        //Page<Movie> page = movieService.findByPageNo(p);
        //req.setAttribute("page",page);
        req.getRequestDispatcher("/WEB-INF/views/moviehome.jsp").forward(req,resp);
    }
}
