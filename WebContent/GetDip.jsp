<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="common.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GetDip</title>
</head>

<body>
<br>
<br>
<div class="container" align="center">


<div id="page-content" >
<h3>证明</h3>
<h5>${stu.sname} ，男，身份证号： ${stu.id } ,曾于我校就读 ${stu.dep } ，获得毕业证，</h5>
<h5>编号 ${stu.graduid } ，并获得学士学位证书，</h5>
<h5>编号 ${stu.degreeid }</h5>
<h5>特此证明</h5>
</div>




<button class="btn btn-primary"  id="generate-word">确认
导出Word</button>
<button class="btn btn-default"  onclick="history.go(-1)">返回</button>
</div>
<script type="text/javascript">
jQuery(document).ready(function($) {
$("#generate-word").click(function(event) {
$("#page-content").wordExport();
});
});
</script>
</body>
</html>