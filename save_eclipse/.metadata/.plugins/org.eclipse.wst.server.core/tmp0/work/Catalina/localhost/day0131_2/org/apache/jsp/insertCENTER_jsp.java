/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-03 10:00:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bit.dao.CenterDAO;
import com.bit.vo.CenterVO;

public final class insertCENTER_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>센터 등록</h2>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<form action=\"insertCENTER.jsp\" method=\"post\">\r\n");
      out.write("\t\t센터번호 :<input type=\"number\" name=\"center_no\"><br> \r\n");
      out.write("\t\t센터이름 :<input type=\"text\" name=\"center_name\"><br> \r\n");
      out.write("\t\t센터전화 :<input type=\"text\" name=\"center_tel\"><br> \r\n");
      out.write("\t\t센터주소 :<input type=\"text\" name=\"center_addr\"><br> \r\n");
      out.write("\t\t<input type=\"submit\" value=\"등록\">\r\n");
      out.write("\t\t<input type=\"reset\" value=\"취소\">\r\n");
      out.write("\t\t<!-- 센터를 입력하다가 잘못입력해서 지울때 -->\r\n");
      out.write("\t</form>\r\n");
      out.write(" \r\n");
      out.write("\t");

		request.setCharacterEncoding("UTF-8");
		
		if(request.getMethod().equals("POST")){
		int center_no = Integer.parseInt(request.getParameter("center_no"));
		String center_name = request.getParameter("center_name");
		String center_tel = request.getParameter("center_tel");
		String center_addr = request.getParameter("center_addr");

		CenterVO c = new CenterVO(center_no, center_name,  center_tel, center_addr);
		CenterDAO dao = new CenterDAO();
		int re = dao.insertCenter(c);
		
		if (re > 0) {
		
      out.write("\r\n");
      out.write("\t\t\t<font color='blue'>센터등록에 성공하였습니다.</font>\r\n");
      out.write("\t\t");

		} else {
		
      out.write("\r\n");
      out.write("\t\t\t<font color='red'>센터등록에 실패하였습니다.</font>\r\n");
      out.write("\t\t");

		}
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
