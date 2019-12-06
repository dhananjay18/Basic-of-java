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
	<div class="page">
		<div class="header">
			<div class="w3-container w3-teal">
				<!-- header -->

				<jsp:include page="./static/header/header.jsp" />
			</div>


			<!-- body -->
			<form action="./addContactController" method="post">
				<table border="2">

					<tr>
						<td>Contact Name</td>
						<td><input type="text" name="name"></td>
					</tr>


					<tr>
						<td>Phone Number</td>
						<td><input type="text" name="contactNumber"></td>
					</tr>


					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>



					<tr>
						<td>Contact Group</td>
						<td><select name="cgroup">
								<option value="friend">FRIEND</option>
								<option value="office">OFFICE</option>
								<option value="family">FAMILY</option>
						</select></td>
					</tr>

					<tr>
						<td>Address</td>
						<td><select name="address">
								<option value="indore">INDORE</option>
								<option value="pune">PUNE</option>
								<option value="mumbai">MUMBAI</option>
						</select></td>
					</tr>

				</table>
				<input type="submit" value="ADD CONTACT">
			</form>
			<!-- footer -->
			<div class="w3-container w3-teal">

				<jsp:include page="./static/footer/footer.jsp" />
			</div>
		</div>
	</div>
</body>
</html>