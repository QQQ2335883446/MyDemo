<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="common.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DipResult</title>
</head>

<body>
<br>
<br>
<div class="container" >
<h1>毕业生双证证明</h1>

<br>

<br>
<h4>姓名： ${stu.sname }</h4>
<br>
<h4>电子注册号： ${stu.graduid }</h4>
<br>
<h4>学位证编号： ${stu.degreeid }</h4>
<br>
<br>
<br>




<a href="GetDip?id=${stu.sno}" class="btn btn-primary"  id="generate-excel">导出Word</a>
<button class="btn btn-default"  onclick="history.go(-1)">返回</button>
</div>
</body>
</html>