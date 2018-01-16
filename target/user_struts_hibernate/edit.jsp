<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户编辑</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="container">
    <header>
        <h1>编辑用户信息</h1>
    </header>
    <form id="testForm" action="userAction!do_edit" method="post">
        <input type="hidden" name="userModel.updateDate" value="<fmt:formatDate value="${now}" type="both" dateStyle="long"  pattern="yyyy-MM-dd HH:mm:ss"/>"/>
        <div class="input ">
            <label class="input-label">用户名称：</label>
            <input id="username" name="userModel.name" type="text" class="input_value" placeholder="请输入您的用户名！" value="${userModel.name}">
        </div>
        <div class="input">
            <label class="input-label">登录密码：</label>
            <input id="password" name="userModel.password" type="password" class="input_value" placeholder="请输入您的密码！" value="${userModel.password}">
        </div>
        <div class="input">
            <label class="input-label">重复密码：</label>
            <input id="repeatPassword" name="userModel.rePassword" type="password" class="input_value" placeholder="请输入您的确认密码！" value="${userModel.password}">
        </div>
        <div class="input">
            <label class="input-label">电子邮箱：</label>
            <input id="email" name="userModel.email" type="email" class="input_value" placeholder="请输入您的邮箱！" value="${userModel.email}">
        </div>
        <div class="input">
            <label class="gender">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
            <div class="radio-gender">
                <input type="radio" name="userModel.sex" id="male" value="男" checked="checked" required>
                <label for="male">男</label>
                <input type="radio" name="userModel.sex" id="female" value="女" required>
                <label for="female">女</label>
            </div>
        </div>
        <br>
        <hr>
        <div class="control">
            <button type="submit">修改</button>
            <button type="reset">重置</button>
            <a href="http://localhost:8080/userAction!findUsers" class="return">返回</a>
        </div>
    </form>
</div>
<script type="text/javascript" src="./plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
</body>
</html>