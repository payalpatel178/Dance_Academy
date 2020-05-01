<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updating a program</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	color: black;
	font-size: 17px;
	font-weight: bold;
	background: rgb(2, 0, 36);
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(209, 161, 231, 1) 0%, rgba(0, 212, 255, 1) 100%);
	background: #ffffff;
}

.topnav {
	overflow: hidden;
	background-color: #4d94ff;
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
.headingForHome{
	font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size:65px;
	font-style:italic;
	text-align: center;
	color:#003380;
	text-shadow: 2px 2px 3px #FFFFFF;
	padding-top:50px;
}
td{ 
width: 200px; 
text-align: left; 
border: 1px solid white; 
padding: 5px;
}
.btn{
   padding-top:10px;
   font-size:16px;
   font-weight:bold;
}
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: #4d94ff;
   height:32px;
   padding-bottom:5px;
   color: white;
   text-align: center;
}
</style>
<!-- CSS -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="topnav">
		<a class="active" href="http://localhost:8080/DanceAcademy/programs/index">Home</a> 
		<a href="http://localhost:8080/DanceAcademy/programs/about">About Us</a> 
		<a href="http://localhost:8080/DanceAcademy/programs/getprograms">Programs</a> 
		<a href="http://localhost:8080/DanceAcademy/persons/addperson">Admissions</a> 
		<a href="#">Contact Us</a>
	</div>
	<div align="left" class="container">
		<form:form action="updateProgram" method="post" 
			modelAttribute="editedprogram">
			<div class="form-row">
			<table>
					<form:hidden path="id" />
				<br/>
				<tr>
					<td>Name</td>
					<td><form:input path="name" style="width:350px;"/></td>
				</tr>

				<tr>
					<td>Duration</td>
					<td><form:input path="duration" style="width:350px;"/></td>
				</tr>

				<tr>
					<td>Starting date</td>
					<td><form:input path="startingDate" style="width:350px;"/></td>
				</tr>

				<tr>
					<td>Fees</td>
					<td><form:input path="fees" style="width:350px;"/></td>
				</tr>
				
				<tr>
					<td></td>
					<td colspan="2"><input type="submit" value="UPDATE PROGRAM" class="btn btn-warning"></td>
				</tr>
			</table>
			</div>
		</form:form>
	</div>
	<div class="footer">
        <p>All Rights reserved &copy; 2019</p>
    </div>
</body>
</html>