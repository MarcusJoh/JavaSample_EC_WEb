<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.weatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>the weather</title>
</head>
<body>




	<%
	weatherBean wBean = (weatherBean) request.getAttribute("wBean");
	out.print("The weather " + wBean.getCityStr() + " is now a " + wBean.getCloudsStr());
	%>












</body>
</html>