<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#box1{width: 500px; height: 200px; background: gray;}
	#parent{width: 500px; height: 500px; background: coral;}
	#child{width: 200px; height: 200px; background: pink; margin-top: 200px;}
	#box2{width: 500px; height: 2000px; background: skyblue}
</style>
</head>
<body>
	<div id="box1"></div>
	<div id="parent">
		<div id="child"></div>
	</div>
	<div id="box2"></div>
</body>
</html>