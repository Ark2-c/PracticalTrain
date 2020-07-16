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

    <script src="../js/jquery.min.js"></script>
    <script src="../js/jquery.easyui.min.js"></script>
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
                            window.parent.location.href = "index";
                        } else  {
                            //jquery对象方法
                            alert( data.msg);

                        }
                    }
                });
            });
        })
    </script>
</head>
<body>
<form  id="form">
    <input type="input" name="username" id="username"></br>
    <input type="input" name="passwd" id="passwd"></br>
    <input type="button" id="submit" value="登录"></br>
</form>
</body>
</html>
