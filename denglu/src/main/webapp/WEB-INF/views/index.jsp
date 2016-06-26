<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
            text-align: center;
        }

        .form {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }

        .form .form-heading,
        .form .checkbox {
            margin-bottom: 10px;
        }

        .form .checkbox {
            font-weight: normal;
            float: left;
        }

        .form .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }

        .form input[type="username"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }</style>

</head>
<body>
<div class="container">

    <form class="form">
        <h2 class="form-heading" style="color: red">用户登录界面</h2>
        <label for="username" class="sr-only">用户名</label>
        <input type="email" id="username" class="form-control" placeholder="请输入用户名" required>
        <label for="password" class="sr-only">密码</label>
        <input type="password" id="password" class="form-control" placeholder="请输入密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember"> 记住密码
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
    </form>
</div>
<script src="/static/js/jquery-2.2.3.min.js"></script>
<script>
    $(function () {

    });

</script>
</body>
</html>
