<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>
</head>
<body>
<hr><br>Welcome to this <font color="green">Login Page</font>!<br>
<form action="login" method="post">
<br>
<font id="error" color="red">${error}</font>
<h1>登录:</h1><br>
用户名:<input type="text" name="name"><br>
密码:  <input type="password" name="password"><br>
<input type="checkbox" name="readme" value="t">记住密码?<br>
<br>
<input type="submit" value="登陆">    <input type="reset"><br>
</form>

</body>
</html>