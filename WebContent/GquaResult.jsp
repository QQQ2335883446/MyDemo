<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="common.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GraduatequalificationResult</title>
</head>

<body>
<br>
<br>
<div class="container">
<h1>毕业生资格查询结果</h1>
<span>可毕业人数： 	${count }</span>
<br>

<br>
<table class="table">
 <tr>
 <td><strong>姓名</strong></td>
 <td><strong>性别</strong></td>
 <td><strong>所在地</strong></td>
 <td><strong>学校</strong></td>
  <td><strong>毕业情况</strong></td>
 <td></td>
 </tr>
 <c:forEach items="${list}" var="stu">
 <tr>
 <td>${stu. sname}</td>
 <td>${stu. ssxe}</td>
 <td>${stu. snative}</td>
 <td>${stu. saddress}</td>
 <td>${stu. fail}</td>
 <td></td>
 </tr>
 </c:forEach>
</table>
<button class="btn btn-default"  onclick="history.go(-1)">返回</button>
</body>
</html>