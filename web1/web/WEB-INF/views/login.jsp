<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doucument</title>

    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

<div class="container">

    <c:choose>
        <c:when test="${param.code == 1001}">
            <div class="alert alert-danger">
                验证码错误！
            </div>
        </c:when>
    </c:choose>

    <c:choose>
        <c:when test="${param.code == 1002}">
            <div class="alert alert-danger">
                账号或密码错误！
            </div>
        </c:when>
    </c:choose>


    <form action="/login" method="post" id="loginform">

        <div class="form-group">
            <lable>账号</lable>
            <input typ e="text" class="form-control" name="username">
        </div>

        <div class="form-group">
            <lable>密码</lable>
            <input type="password" class="form-control" name="password" id="password">
        </div>

        <div class="form-group">
            <lable>验证码</lable>
            <input type="text" class="form-control" name="captcha">
            <a href="Javaacript:;" id="change"><img id="captcha" src="/Captcha.png" alt=""></a>
        </div>
        
        <button class="btn btn-primary" type="button" id="submitBtn">登陆</button>
    </form>
</div>


<script src="/static/js/jquery-2.2.3.min.js"></script>
<script src="/static/js/cryptojs/core-min.js"></script>
<script src="/static/js/cryptojs/md5-min.js"></script>
<script>
    $(function(){

        $("#submitBtn").click(function(){

            var pwd = $("#password").val();
            pwd = CryptoJS.MD5(pwd);
            //console.log(pwd.toString());
            $("#password").val(pwd);

            $("#loginform").submit();
        })


        $("#change").click(function(){

            $("#captcha").removeAttr("src").attr("src","/Captcha.png?t="+ new Date().getTime());
        })
    })

</script>

</body>
</html>
