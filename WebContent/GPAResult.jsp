<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="common.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GPAResult</title>
</head>

<body>
<br>
<br>
<div class="container">
<h1>毕业生信息查询结果</h1>

<br>
<span>基本信息：</span>
<br>
<span>姓名： ${stu.sname }</span>
<br>
<span>地址： ${stu.snative }</span>
<br>
<span>性别： ${stu.ssxe }</span>
<br>
<span>电话： ${stu.stel }</span>
<br>
<span>毕业： ${stu.conclusion }</span>
<br>
<br>
<div style="width: 500px;">
<table class="table table-bordered" id="test_table">
 <tr>
 <td><strong>课程</strong></td>
 <td><strong>得分</strong></td>
 <td><strong>学期</strong></td>

 </tr>
 <c:forEach items="${list}" var="grade">
 <tr>
 <td>${grade. cname}</td>
 <td>${grade. score}</td>
 <td>${grade. credit}</td>
 </tr>
 </c:forEach>
</table>
</div>
<button class="btn btn-default"  onclick="history.go(-1)">返回</button>
<button class="btn btn-primary"  id="generate-excel">导出Excel</button>
</body>
</html>