<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css" class="">
</head>
<body>
    <div class="container">
        <form action="/servlet/upload" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label>文件描述</label>
                <input type="text" class="form-control" name="fileDesc">
                <lable>请选择文件</lable>
                <input type="text" name="doc" class="form-control">
                <button class="btn btn-primary">保存</button>
            </div>
        </form>
    </div>
</body>
</html>
