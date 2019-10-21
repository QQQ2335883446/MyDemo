<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Graduatequalification</title>
</head>

<body>
<div class="container">
<br>
<div class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
    毕业生管理
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">

    <li><a href="Graduatequalification.jsp">毕业生资格审查</a></li>
    <li role="separator" class="divider"></li>
    <li><a href="GPA.jsp">毕业生信息查询</a></li>
    <li role="separator" class="divider"></li>
    <li><a href="Diploma.jsp">毕业生双证遗失证明</a></li>

  </ul>
</div> 	
<h1>毕业生信息查询</h1>
<br>
<form action="GPA" method="post">
  <div class="form-group">
    <label for="id">输入身份证号：</label>
    <input type="text" class="form-control" name="id" id="id" required placeholder="可输入 210281199809169338 测试  " >
  </div>
  <button type="submit" class="btn btn-default">确定</button>
</form>
 <button class="btn btn-default"  onclick="history.go(-1)">返回</button>
</div>
</body>
</html>