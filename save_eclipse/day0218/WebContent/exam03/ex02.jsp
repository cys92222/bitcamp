<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.inner{width: 100px; height: 100px; background: fuchsia; display: inline-block;
		margin: 10px;}
		
	#outer{width: 500px; height: 200px; background: skyblue; 
			overflow: hidden;}
</style>
</head>
<body>
	<div id="outer">
		<div class="inner">1</div>
		<div class="inner" >2</div>
		<div class="inner">3</div>
		<div class="inner">4</div>
		<div class="inner">5</div>
	</div>
</body>
</html>