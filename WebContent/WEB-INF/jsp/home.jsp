<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.first{
	float:left;
	display:inline;
	border:1px
}
body{
	padding:0px;
	margin:0px;
	border-style:solid;
	border-color:white;
}
</style>
</head>
<body>
<div>
login successfully!
<font id="user" color="red">${session_user.name}</font>
red11
</div>

<div class="first">
<c:if test="${session_user.role==1}">
	<li><a herf="blank"><i class="icon-chevron-right"></i>首页</a></li>
	<li id="oracle"><a href="oracle.action?action=list"><i class="icon-chevron-right"></i>oracle集群</a></li>
	<li id="oracle"><a href="user.action?action=list"><i class="icon-chevron-right"></i>用户管理</a></li>
</c:if>
<c:if test="${session_user.role==2}">
	<li><a herf="blank"><i class="icon-chevron-right"></i>首页</a></li>
	<li id="oracle"><a href="monitor.action?action=list"><i class="icon-chevron-right"></i>监控管理</a></li>
	<li id="oracle"><a href="datamigrater.action?action=list"><i class="icon-chevron-right"></i>数据迁移</a></li>
</c:if>
<form action="loginout" method="post">
<input type="submit" value="退出"> <br>
</form>
</div>
<div class="first">
<jsp:include page="${mainRight==null?'blank.jsp':mainRight}"></jsp:include>
</div>
</body>
</html>