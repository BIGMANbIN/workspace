<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>doucument</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/js/webupload/webuploader.css">
</head>
<body>

<div class="container">
    <div class="page-header">
        <h3>Ajax图片上传</h3>
    </div>
    <div id="picker">选择文件</div>
    <h3>图片预览</h3>
    <ul id="fileList" class="list-unstyled list-inline"></ul>

    <button id="btn" class="btn btn-success">开始上传</button>
</div>

<script src="/static/js/jquery-2.2.3.min.js"></script>
<script src="/static/js/webupload/webuploader.min.js"></script>
<script type="mayTemplate" id="progressTemplate">

    <div class="progress">
        <div class="progress-bar progress-bar-success" role="progressbar" style="width: 0%"></div>
    </div>
</script>
<script>
    $(function () {
        var uploader = WebUploader.create({
            swf: "/static/js/webupload/Uploader.swf",
            pick: "#picker",
            fileVal: "file",
            accept: {
                title: 'Image',
                extensions: 'gif,jpg,jpeg,bmp,png',
                mimeType: 'image/*'
            }
        });

        //将选择的文件放到队列中

        uploader.on("fileQueued", function (file) {
            var html = '<li id="' + file.id + '"><img class="img-thumbnail"></li>';
            $("#fileList").append(html);

            uploader.makeThumb(file, function (error, src) {
                if (error) {
                    return;
                }

                $("#" + file.id).find("img").attr('src', src);
            }, 100, 100);
        });

        //文件开始上传时调用的事件

        uploader.on("uploadProgress", function (file, percentage) {
            percentage = parseInt(percentage * 100);

            var $li = $("#" + file.id);

            if ($li.find(".progress").length) {
                $li.find(".progress .progress-bar").css("width", percentage + "%");
            } else {
                var template = $("#progressTemplate").html();
                $li.append(template);
            }

            /*/!* var $li = $("#"+file.id);

             if ($li.find("span").length){
             $li.find("span").text("上传中..."+percentage);
             }else {
             $("#"+file.id).append("<span>上传中...</span>");
             }

             if (percentage == 100){
             $li.find(("span").text("上传完成").fadeOut(3000));
             }*/

        });

        //当文件上传成功

        uploader.on("uploadSuccess", function (file) {
            $("#" + file.id).css("color", "#ccc");
        });

        //当文件上传失败
        uploader.on("uploadError", function (file) {
            $("#" + file.id).css("color", "darkred");
        });

        //无论上传失败或成功
        uploader.on("uploadComplete", function () {

        });

        //手动开启上传
        $("#btn").click(function () {
            console.log("开机")
            uploader.upload();
        });

    });


</script>

</body>
</html>