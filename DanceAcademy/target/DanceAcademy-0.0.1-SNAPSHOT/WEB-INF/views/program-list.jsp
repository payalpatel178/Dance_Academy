<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Programs</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	color: black;
	font-size: 17px;
	background: rgb(2, 0, 36);
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(209, 161, 231, 1) 0%, rgba(0, 212, 255, 1) 100%);
	background: #ffffff;
}

.headingForHome {
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size: 45px;
	font-style: italic;
	text-align: center;
	color: #003380;
	text-shadow: 2px 2px 3px #FFFFFF;
}

.topnav {
	overflow: hidden;
	background-color: #4d94ff;
	font-weight: bold;
}

.topnav a {
	float: left;
	color: #ffffff;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ff9900;
	color: black;
}

.topnav a.active {
	background-color: #003380;
	color: white;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #4d94ff;
	height: 32px;
	padding-bottom: 5px;
	color: white;
	text-align: center;
	font-weight: bold;
}
</style>
<!-- CSS -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="topnav">
		<a href="http://localhost:8080/DanceAcademy/programs/index">Home</a> 
		<a href="http://localhost:8080/DanceAcademy/programs/about">About Us</a> 
		<a class="active" href="http://localhost:8080/DanceAcademy/programs/getprograms">Programs</a> 
		<a href="http://localhost:8080/DanceAcademy/persons/addperson">Admissions</a> 
		<a href="#">Contact Us</a>
	</div>

	<div align="center" class="container">
		<h1 class="headingForHome">LIST OF PROGRAMS</h1>
		<div align="right" class="container">
			<h1>
				<a href="addprogram" class="btn btn-warning">ADD NEW PROGRAM</a>
			</h1>
		</div>
		<table border="2" class="table">
			<tr class="info">
				<th class="text-center">Name Of Program</th>
				<th class="text-center">Duration</th>
				<th class="text-center">Starting Date</th>
				<th class="text-center">Fees</th>
				<th class="text-center" colspan=2>Edit Program</th>
			</tr>

			<c:forEach var="program" items="${progList}">
				<tr class="warning">
					<td style="padding: 5px;"><c:out value="${program.name}"></c:out></td>
					<td style="padding: 5px;"><c:out value="${program.duration}"></c:out></td>
					<td style="padding: 5px;"><c:out
							value="${program.startingDate}"></c:out></td>
					<td style="padding: 5px;"><c:out value="${program.fees} $"></c:out></td>

					<td style="padding: 5px;"><a
						href="editprogram?programId=${program.id}">Update Me!</a></td>
					<td style="padding: 5px;"><a
						href="deleteprogram?programId=${program.id}">Delete Me!</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>

	<div class="footer">
		<p>All Rights reserved &copy; 2019</p>
	</div>
</body>
</html>