<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/15
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../css/login.css" type="text/css">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1948911_38on7dvvfv.css">
    <link rel="stylesheet" href="../css/login.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //登录
            $("#submit").click(function () {
                var data = $("#form").serialize();
                $.ajax({
                    type: "post",
                    url: "check",
                    data: data,
                    success: function (data) {
                        if ("success" === data.type) {
                            window.parent.location.href = "come";
                        } else {
                            //jquery对象方法
                            alert(data.msg);

                        }
                    }
                });
            });
        })
    </script>
</head>
<body>

    <div id="loginBG">

    </div>
    <div id="head"></div>
    <div id="loginFrom">
        <form id="form">
            <div>
                <i class="iconfont icon-xingmingyonghumingnicheng" ></i>
                用户名<input type="input" name="username" id="username" class="text"></br>
            </div>
            <div>
                <i class="iconfont icon-mima" ></i>
                密码<input type="password" name="passwd" id="passwd" class="text"></br>
            </div>
            <div>
                <input type="button" id="submit" value="登录"></br>
            </div>
        </form>
    </div>
</body>
</html>
