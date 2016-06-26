<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>最新的问题 - SegmentFault</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <style>
        .btn-group {
            float: right;
        }
        .global-navTags {
            background-color: #005f3c;
            box-shadow: 0 1px 2px 0 rgba(0,0,0,.24);
        }
        .global-navTags .container .nav__List .nav_item{
            float:left;
            width:100px;
            margin-left:3px;
            line-height:30px;
            display:block;
            text-align:center;
            height:30px;
            color:#666;
        }
        a:hover{
            color:red;
            font-weight:bold;
            text-decoration:none;
        }
        .stream-list_item {
            border-bottom: 1px solid #eee;
            padding: 10px 0;
            float:left;
            width:200px;
            margin-left:3px;
            line-height:30px;
            display:block;

        }
        .qa-rank .votes {
            display: inline-block;
            text-align:center;
            font-weight:bold;
            text-decoration:none;
            list-style: none;

        }
        .qa-rank .answered {
            <!--background-color: #009a61;-->
            text-align:center;
            font-weight:bold;
            text-decoration:none;
            list-style: none;

        }
        .qa-rank .views {
            color: #999;

        }
    </style>

</head>
<body>
<div class="global-nav sf-header">
    <nav class="container nav">
        <div class="hidden-sm  navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"><span>问答</span></a></li>
                <li><a href="#"><span>文章</span></a></li>
                <li><a href="#"><span>笔记</span></a></li>
                <li><a href="#"><span>职位</span></a></li>
                <li><a href="#"><span>活动</span></a></li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="输入关键字搜索">
                </div>
            </form>
            <button class="btn-group"><a href="/user/login" class="SFLogin em ml10"
                                         onclick="_gaq.push(['_trackEvent', 'Button', 'Click', 'Login']);"
            >注册 ·登录</a></button>
        </div>
    </nav>
</div>
<div class="global-navTags">
    <div class="container">
        <nav class="nav">
            <ul class="nav__List">
                <li class="nav_item"><a href="#">home</a></li>
                <li class="nav_item"><a href="#">feed</a></li>
                <li class="nav_item tag-nav__item"><a href="#">javascript</a></li>
                <li class="nav_item tag-nav__item"><a href="#">php</a></li>
                <li class="nav_item tag-nav__item"><a href="#">pyhton</a></li>
                <li class="nav_item tag-nav__item"><a href="#">java</a></li>
                <li class="nav_item tag-nav__item"><a href="#">masql</a></li>
                <li class="nav_item tag-nav__item"><a href="#">ios</a></li>
                <li class="nav_item tag-nav__item"><a href="#">android</a></li>
                <li class="nav_item tag-nav__item"><a href="#">node.js</a></li>
                <li class="nav_item tag-nav__item"><a href="#">html5</a></li>
                <li class="nav_item tag-nav__item"><a href="#">linux</a></li>
                <li class="nav_item tag-nav__item"><a href="#">c++</a></li>
                <li class="nav_item tag-nav__item"><a href="#">css3</a></li>
                <li class="nav_item tag-nav__item"><a href="#">git</a></li>
                <li class="nav_item tag-nav__item"><a href="#">golang</a></li>
                <li class="nav_item tag-nav__item"><a href="#">ruby</a></li>
                <li class="nav_item tag-nav__item"><a href="#">vim</a></li>
                <li class="nav_item tag-nav__item"><a href="#">docker</a></li>
                <li class="nav_item tag-nav__item"><a href="#">mongodb</a></li>
                <li class="nav_item nav__item--more" data-open="0"><a href="#">
                    <div class="tag__more">
                        <i class="tag__more--icon">•</i>
                        <i class="tag__more--icon">•</i>
                        <i class="tag__more--icon">•</i>
                    </div>
                </a></li>
            </ul>
        </nav>
    </div>
</div>
<div class="wrap">
    <div class="container">
        <ul class="nav nav-tabs nav-tabs-zen">
            <li class="active"><a href="#">最新的</a></li>
            <li><a href="#">热门的</a></li>
            <li><a href="#">未回答的</a></li>
        </ul>
        <div class="stream-list question-stream">
            <section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">刚刚提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">写一个ftp服务端口扫描程序需要准备那些知识？</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="iis">iis</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="ftp">ftp</a>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">2分钟前提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">写一个ftp服务端口扫描程序需要准备那些知识？</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="iis">iis</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="ftp">ftp</a>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">刚刚提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">某厂面试题：移动端适配为何这样不行？</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="css">css</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="javascript">javascript</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="移动端web">移动端web</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="html">html</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="前端开发">前端开发</a>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">2分钟前提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">openssl make报错</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="openssl">openssl</a>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">刚刚提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">关于webpack引入jQuery插件的问题</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="webpack">webpack</a>
                        </li>
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="jquery插件">jquery插件</a>
                        </li>
                    </ul>
                </div>
            </section>
            <!--<section class="stream-list_item">
                <div class="qa-rank">
                    <div class="votes hidden-xs">#<small>投票</small></div>
                </div>
                <div class="qa-rank">
                    <div class="answers answered">#<small>回答</small></div>
                </div>
                <div class="qa-rank">
                    <div class="views hidden-xs">#<small>浏览</small></div>
                </div>
                <div class="summary">
                    <ul class="author list-inline">
                        <li>
                            <a href="#">这么爱</a>
                            <span class="split"></span>
                            <a href="#" class="askDate">刚刚提问</a>
                        </li>
                    </ul>
                    <h4 class="title">
                        <a href="#">关于mysql unique的问题，如图所示</a>
                    </h4>
                    <ul class="tagList--inline ib">
                        <li class="tagPopup">
                            <a class="tag tag-sm" href="#" data-toggle="popover" data-original-title="mysql">mysql</a>
                        </li>
                    </ul>
                </div>
            </section>-->
        </div>
    </div>
</div>

</body>
</html>
