<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wine mercs</title>
</head>
<body>



	<form action="<%=request.getContextPath()%>/ControllerServlet"
		method="post">
		Get from the database:<input type="text" name="mName"><br>

		<input type="submit" value="Get me some wine">
	</form>













</body>
</html>