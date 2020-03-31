<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#ball{
		width: 100px;
		height: 100px;
		background-image: url(ball5.jpg);
		background-repeat: no-repeat;
		position: absolute;
		
		animation-name: rolling;
		animation-duration: 3s;
		animation-timing-function: ease;
		animation-iteration-count: infinite;
		animation-direction: alternate;
		animation-delay: 2s;
	}
	
	@keyframes rolling{
		from {left:0px;
			transform:rotate(0deg);
			width: 100px;
			height: 100px;
			background-image: url(ball5.jpg);
			background-repeat: no-repeat;
			}
	
		to {left:100%;
			transform:rotate(360deg);
			width: 150px;
			height: 150px;
			background-image: url(ball22.jpg);
			background-repeat: no-repeat;}

	}
</style>
</head>
<body>
	<div id="ball"></div>
</body>
</html>