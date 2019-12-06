<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="./static/css/styles.css">
</head>
<body>

	<!-- header -->

	<div class="w3-container w3-teal">
		<jsp:include page="./static/header/header.jsp" />
	</div>
	<p>${param.msg}</p>
	<form action="./UserAunthenticationController" method="post">

		<table>
			<tr>
				<td>Login Name</td>
				<td><input tye="text" name="loginName"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input type="submit" value="login">
	</form>
	<!-- footer -->
	<div class="w3-container w3-teal">

		<jsp:include page="./static/footer/footer.jsp" />
	</div>
</body>
</html>