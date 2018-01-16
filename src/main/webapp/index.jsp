<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
<div id="top">
    <div class="img"><img src="./images/qie.jpg"></div>
    <div class="administer">用户管理系统</div>
    <div class="help">帮助&nbsp;&nbsp;退出</div>
</div>
<div id="menu">
    <a class="list" href="http://localhost:8080/userAction!findUsers">用户查询</a>
    <button class="add">用户新增</button>
    <button class="analyze">用户分析</button>
    <div class="avatar">
        <img src="./images/logo.png" width="80%">
        <p>当前登录用户</p>
    </div>
</div>
<div id="content">
    <div class="search">
        用户名称：
        <input type="" name="">
        <button>查询</button>
    </div>
    <div class="user">
        <table align="left" width="100%" border="1" rules="all">
            <thead bgcolor="#CCFFFF">
            <tr height="40px">
                <td>编号</td>
                <td>用户名称</td>
                <td>邮箱</td>
                <td>创建时间</td>
                <td>更新时间</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list }" var="temp" varStatus="vs">
                <tr height="40px">
                    <td>${temp.id }</td>
                    <td>${temp.name }</td>
                    <td>${temp.email }</td>
                    <td>${temp.createDate }</td>
                    <td>${temp.updateDate }</td>
                    <td>
                        <a href="userAction!to_edit?userModel.id=${temp.id }" class="edit">编辑</a>&nbsp;
                        <a href="userAction!remove?userModel.id=${temp.id }">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript" src="./plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
</body>
</html>