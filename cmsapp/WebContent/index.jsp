<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="./static/css/styles.css">
<meta charset="ISO-8859-1">
<title>CMSAPP |HOME</title>
</head>
<body>
	<div class="page">
		<div class="header">
			<div class="w3-container w3-teal">
				<!-- header -->

				<jsp:include page="./static/header/header.jsp" />
			</div>


			<!-- body -->
			<div class="body">
				<div class="container">
					<form action="./UserRegistrationController" method="post">
						<table>
							<tr>
								<td>Name</td>
								<td><input type="text" name="name"><br /></td>
							</tr>
							<tr>
							<td>Email</td>
							<td><input type="text" name="email">
							<br /></td>
							</tr>
							<tr>
							<td>
							 Login Name
							</td>
							<td>
							<input type="text" name="loginName">
							<br /> </td>
							</tr>
							<tr>
							<td>
							Password</td>
							<td>
							<input type="password" name="password">
							<br /></td>
							</tr>
							
						</table>
						<input type="submit" value="REGISTER">
							
					</form>
				</div>
			</div>
			<!-- footer -->
			<div class="w3-container w3-teal">

				<jsp:include page="./static/footer/footer.jsp" />
			</div>
		</div>
	</div>
</body>
</html>