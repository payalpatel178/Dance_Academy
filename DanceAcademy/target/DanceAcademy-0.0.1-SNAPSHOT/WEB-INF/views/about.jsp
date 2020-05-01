<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>About Us</title>
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
p{
	font-weight:normal;
	padding-left:30px;
	padding-right:30px;
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

.headingForHome {
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size: 45px;
	font-style: italic;
	text-align: center;
	color: #003380;
	text-shadow: 2px 2px 3px #FFFFFF;
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
}
</style>
<!-- CSS -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="topnav">
		<a href="http://localhost:8080/DanceAcademy/programs/index">Home</a> 
		<a class="active" href="http://localhost:8080/DanceAcademy/programs/about">About Us</a> 
		<a href="http://localhost:8080/DanceAcademy/programs/getprograms">Programs</a> 
		<a href="http://localhost:8080/DanceAcademy/persons/addperson">Admissions</a> 
		<a href="#">Contact Us</a>
	</div>
	<div class="container">
		<h1 class="headingForHome">ABOUT US</h1>

		<br/>
		<p class="text-justify"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			Live to Dance Academy has been teaching dancers in the
			Clarkson-Lorne Park area in Mississauga since 1993. We are now
			celebrating our 27th year, we specialize in Jazz, Tap, Ballet,
			Contemporary, Pointe, Hip Hop, Acro, Modern, Irish and Musical
			Theatre. We also teach Pilates, Jazz Funk and Tap to adults. Can
			Dance Academys philosophy is that every dancer should lead a
			balanced life. Dance is only a portion of their needs and wants and
			should leave room for other hobbies and school. Our competitive
			program runs for students who dance once a week or more. Each and
			every child and dancer is special as well as learning at their own
			level. Competition is a pleasure and an opportunity to get better. It
			should never be at the expense of a balanced life. To this end Can
			Dance Academy has received numerous awards for giving the most
			students the opportunity to compete. Our annual recitals at
			Meadowvale Theatre are raved about and are hailed as amazing. They
			always include set, props, professional lighting design and video. 
			<br/><br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			We have three levels of dance; recreational, competitive and company
			team. Our competitive and company team perform in our annual charity
			fundraiser as well as three Ontario competitions per season. Our
			staff consists of highly trained teachers and professional dancers.
			Our studios have specialized dance flooring, permanent and portable
			ballet barres, wall to wall mirrors and professional sound systems.
			We are located within walking distance of five schools. Our focus is
			on learning and loving dance in a fun and relaxed atmosphere.</p>

	</div>
	<div class="footer">
		<p>All Rights reserved &copy; 2019</p>
	</div>
</body>
</html>