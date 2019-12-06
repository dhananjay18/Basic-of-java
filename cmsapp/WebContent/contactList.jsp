<%@page import="com.codeblog.cmsapp.dao.ContactDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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
			<p>${param.msg}</p>

			<table border="1" width="90%">
				<tr>
					
					<th>Contact Name</th>
					<th>Phone Number</th>
					<th>Email</th>
					<th>Contact Group</th>
					<th>Address</th>
				</tr>
				<c:forEach items="${requestScope.cont}" var="contact">
					<tr>
						<td><c:out value="${contact.name}"/></td>
						<td><c:out value="${contact.contcatNumber}"/></td>
						<td><c:out value="${contact.email}"/></td>
						<td><c:out value="${contact.cgroup}"/></td>
						<td><c:out value="${contact.address}"/></td>
						<%-- <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>
						<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td>
				 --%>
					</tr>
				</c:forEach>

			</table>



			<!-- footer -->
			<div class="w3-container w3-teal">

				<jsp:include page="./static/footer/footer.jsp" />
			</div>
		</div>
	</div>

</body>
</html>