<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header{
		color: red;
	}
<!-- 자식에 css를 적용하면 부모가 누구던지간에 자식의 css 우선순위가 높다. -->
	h1{
		color: blue;
	}
	
	p{
		color: green;
	}
</style>
</head>
<body>
	<header>
		<h1>header h1</h1>
		<p>header p</p>
	</header>
	
	<footer>
		<h1>footer h1</h1>
		<p>footer p</p>
	</footer>
</body>
</html>