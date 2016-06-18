<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
       <div class="panel panel-default">
           <div class="panel-heading" style="color: red">
               <h2>电影列表</h2>
           </div>
           <div class="panel-body">
               <table class="table">
                   <thead>
                        <tr>
                            <th>影片名称</th>
                            <th>上映时间</th>
                            <th>导演</th>
                            <th>评分</th>
                            <th>发行时间</th>
                        </tr>
                   </thead>
                   <tbody>
                        <c:forEach items="${requestScope.movieList}" var="movie">
                            <tr>
                                <td width="350">${movie.title}</td>
                                <td>${movie.sendtime}</td>
                                <td>${movie.daoyan}</td>
                                <td>${movie.rate}</td>
                                <td>${movie.releaseyear}</td>
                            </tr>
                        </c:forEach>
                   </tbody>
               </table>
           </div>
       </div>
    </div>
</body>
</html>
