<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	html, body{magin: 0px; padding: 0px;}
	
	ul {list-style: none;}
	
	a {text-decoration: none;
		color: #fff;
		font-size: 20px;
		text-transform: uppercase;
		}
		
	li {background: #000;
		width: 180px;
		padding: 20px;
		border-top: solid 5px #dfdfdf;
		transition: background 0.2s, margin-top 0.5s;
		float: left;
		margin-right: 5px;
		}
	
	li:hover{
		background: gray;
		margin-top: 10px;
	}
</style>
</head>
<body>
	<nav>
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact us</a></li>
			<li><a href="#">Portfolio</a></li>
			<li><a href="#">Sign in</a></li>
		</ul>
	</nav>
</body>
</html>