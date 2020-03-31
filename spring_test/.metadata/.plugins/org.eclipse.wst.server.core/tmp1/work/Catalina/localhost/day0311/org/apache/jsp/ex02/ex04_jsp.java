/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 03:49:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex04_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#canvas {\r\n");
      out.write("\twidth: 3000px;\r\n");
      out.write("\theight: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#man {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 10px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar x = 10;\r\n");
      out.write("\t\tvar y = 10;\r\n");
      out.write("\t\tvar vX = 10;\t//x축으로 한번 움직이는 거리\r\n");
      out.write("\t\tvar vY = 10;\t//y축으로 한번 움직이는 거리\r\n");
      out.write("\t\tvar dX = 0;\t\t//x축으로 총 이동할 거리\r\n");
      out.write("\t\tvar dY = 0;\t\t//y축으로 총 이동할 거리\r\n");
      out.write("\t\tvar endX = 0;\t//마우스 눌러진 x 위치(최종목적지)\r\n");
      out.write("\t\tvar endY = 0;\t//마우스 눌러진 y 위치(최종목적지)\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar timeID;\t//타이머를 위한 아이디\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar canvas = document.getElementById(\"canvas\");\r\n");
      out.write("\t\tvar man = document.getElementById(\"man\");\r\n");
      out.write("\r\n");
      out.write("\t\tcanvas.onclick = function() {\r\n");
      out.write("\t\t\tvar event = window.event;\r\n");
      out.write("\t\t\tendX = event.x;\r\n");
      out.write("\t\t\tendY = event.y;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//x축으로 이동하는 거리와 y축으로 이동하는 거리를 \r\n");
      out.write("\t\t\t//동일하게 하기 위하여 각각의 거리를 구하여 동일한 비율로 나눠요.\r\n");
      out.write("\t\t\tdX = Math.abs(endX - x);\r\n");
      out.write("\t\t\tdY = Math.abs(endY - y);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvX = dX/100;\r\n");
      out.write("\t\t\tvY = dY/100;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(x > endX){\r\n");
      out.write("\t\t\t\tvX = -vX;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(y > endY){\r\n");
      out.write("\t\t\t\tvY = -vY;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar i = 0 ;\r\n");
      out.write("\t\t\ttimeID = setInterval(function(){\r\n");
      out.write("\t\t\t\tx += vX;\r\n");
      out.write("\t\t\t\ty += vY;\r\n");
      out.write("\t\t\t\tman.style.left = x + 'px';\r\n");
      out.write("\t\t\t\tman.style.top = y + 'px';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(i >= 100){\r\n");
      out.write("\t\t\t\t\tclearInterval(timeID);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\ti++;\r\n");
      out.write("\t\t\t},100);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"canvas\">\r\n");
      out.write("\t\t<img id=\"man\" src=\"man.png\" width=\"80\" height=\"80\">\r\n");
      out.write("\t</div>\r\n");
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
