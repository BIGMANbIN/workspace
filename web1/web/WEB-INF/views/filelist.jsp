<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/js/jquery-2.2.3.min.js">
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h3>File Lsit</h3>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                文件列表<a href="/upload" class="btn btn-xs btn-success pull-right">上传文件</a>
            </div>
            <div class="panel-body">
                <table class="table">
                    <thead>
                        <tr>
                            <th>文件名称</th>
                            <th>文件大小</th>
                            <th>md5</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${documentList}">
                            <tr>
                                <td>${doc.filename}</td>
                                <td>${doc.dispalysize}</td>
                                <td>${doc.md5}</td>
                                <td>
                                    <a href="/preview?file=${doc.md5}&down=true">下载</a>
                                    <c:if test="${doc.preview}">
                                        <a target="_blank" href="/preview?file=${doc.md5}">预览</a>
                                    </c:if>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
