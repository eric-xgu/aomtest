<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
 function checkForm(){
	 var name=document.getElementById("name").value;
	 if(name == null || name ==""){
		 document.getElementById("error").innerHTML="用户名不可为空";
		 return false;
	 }
	 return true;
 }
</script>
adduser
<form action="user.action?action=saveuser" method="post" onsubmit="return checkForm()">
<br>
<font id="error" color="red">${error}</font>
用户名:<input type="text" name="name"><br>
密码:  <input type="password" name="password"><br>
<input type="submit" value="保存"><br>
</form>
</form>
</body>
</html>