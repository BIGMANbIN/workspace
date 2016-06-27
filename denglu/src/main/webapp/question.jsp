<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户提交问题页面</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-3">

            <form id="regForm">
                <h2 style="color: red">用户提交问题界面</h2>
                <div class="form-group">
                    <label><strong>作者</strong></label>
                    <input type="text" class="form-control" name="username">
                </div>
                <div class="form-group">
                    <label><strong>问题</strong></label>
                    <input type="text" class="form-control" name="quesion">
                </div>
                <button type="button" id="subBtn" class="btn btn-primary">提交</button>
            </form>
        </div>
    </div>
</div>

<script src="/static/js/jquery.validate.min.js"></script>
<script>

    $(function(){
        $.ajax({
            url:home.jsp,
            type:'post',
            data:$("#regForm").serialize(),

            beforeSend:function(){
                console.log("before function")
            },

            success:function (data){
                console.log("success")
            },
            error:function(){
                alert("请求服务器异常")
            },
            complete:function(){
                console.log("complete function")
            }
        })

    });
</script>
</body>
</html>
