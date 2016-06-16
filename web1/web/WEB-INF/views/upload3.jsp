<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

    <div class="container">
        <div class="col-xs-4">

            <form action="/file/upload" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <lalbe><h3>文件描述</h3></lalbe>
                    <input type="text" class="form-control" name="fileDesc">
                    <lable><h3>请选择文件</h3></lable>
                    <input type="file" class="form-control" name="doc">
                    <button class="btn btn-primary">保存</button>
                </div>
             </form>
        </div>
    </div>

</body>
</html>
