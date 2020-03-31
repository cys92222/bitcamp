<%@page import="com.bit.vo.GoodsVO"%>
<%@page import="com.bit.dao.GoodsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDAO dao = new GoodsDAO();
		GoodsVO g = dao.getGoods(no);	
	%>
	
	<h2>상품 수정</h2>
	<hr>
	<form action="updateGoodsOK.jsp" method="post" enctype="multipart/form-data">
	<input type = "hidden" name="no" value="<%=no%>">
	<table width = "70%">
		<tr>
			<td>상품명</td>
			<td><input type="text" name="item" value=<%=g.getItem() %>></td>
		</tr> 
		<tr>
			<td>가격</td>
			<td><input type="number" name="price" value=<%=g.getPrice() %>></td>
		</tr>
		<tr>
			<td>수량</td>
			<td><input type="number" name="qty" value=<%=g.getQty() %>></td>
		</tr>
		<tr>
			<td>상품사진</td>
			<td><input type="file" name="fname">
			<img src="../upload/<%=g.getFname() %>" width="20" height="20">
			</td>	
		</tr>
		<tr>
			<td>상품설명</td>
			<td><textarea rows="10" cols="40" name="detail"><%=g.getDetail() %></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정">
							<input type="reset" value="취소">
		</tr>
	</table>
	
	</form>
</body>
</html>