<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/17
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>citizen</title>
    <link rel="stylesheet" type="text/css" href="../plugin/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../plugin/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../plugin/easyui/demo/demo.css">
    <script type="text/javascript" src="../plugin/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../plugin/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<table class="easyui-datagrid" title="人口详情 DataGrid" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,url:'getPerson',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'idCard',width:175"> idCard</th>
        <th data-options="field:'name',width:175">姓名</th>
        <th data-options="field:'phone',width:175,align:'right'">联系电话</th>
        <th data-options="field:'sex',width:175,align:'right'">性别</th>

    </tr>
    </thead>
</table>
</body>
</html>
