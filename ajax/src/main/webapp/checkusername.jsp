<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
</head>
<body>

<input type="text" id="username"><span id="help_text"></span>

<script>
    function createXmlHttp() {

        //兼容
        var xmlHttp = null;

        function createXmlHttp() {
            if (window.ActiveXObject) {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } else {
                xmlHttp = new XMLHttpRequest();
            }
            return xmlHttp;
        }

        document.querySelector("#username").onblur = function () {

            var username = this.value;
            var xmlHttp = createXmlHttp();//创建对象
            xmlHttp.open("get", "/check?username?username="+username);//设置请求的URL和方式
            //异步回调
            xmlHttp.onreadystatechange = function () {
                //获取请求状态码
                var readyState = xmlHttp.readyState;
                if (readyState == 4) {
                    //获取Http状态码
                    var HttpState = xmlHttp.status;
                }
                if (HttpState == 200) {
                    var result = xmlHttp.responseText;
                    if (result == "yes") {
                        document.querySelector("#help_text").innerText = "√";
                    } else {
                        document.querySelector("#help_text").innerText = "该账号已被使用";
                    }
                } else {
                    alert("服务器异常：" + HttpState);
                }
            }
        }
        xmlHttp.send();//发送请求
    }
</script>

</body>
</html>
