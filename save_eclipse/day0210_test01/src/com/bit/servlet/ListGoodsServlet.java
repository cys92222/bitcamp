package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;

/**
 * Servlet implementation class ListGoodsServlet
 */
@WebServlet("/listGoods.do")
public class ListGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getSession().getAttribute("id") == null) {
			response.sendRedirect("login.do");
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	
		
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		GoodsDAO dao = new GoodsDAO();
		list = dao.listAll();
		
		out.println("<h2>상품목록</h2>");
		out.print("<a href='insertGoods.do'>상품등록</a><br>");
		
		String str ="<table border='1' width='80%'>";
		str +="<tr>";
		str +="<td>상품번호</td>";
		str +="<td>상품명</td>";
		str +="<td>가격</td>";
		str +="<td>수량</td>";
		str +="<td>상품사진</td>";
		str +="</tr>";
		
		
		for(GoodsVO v : list) {
			str +="<tr>";
			str +="<td>"+v.getNo()+"</td>";
			str +="<td><a href='detailGoods.do?no="+v.getNo()+"'>"+v.getItem()+"</a></td>";
			str +="<td>"+v.getPrice()+"</td>";
			str +="<td>"+v.getQty()+"</td>";
			str +="<td><img src='upload/"+v.getFname()+"'width='50' height='50'</td>";
			str +="</tr>";

		}
		
		str += "</table>";
		out.print(str);
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
