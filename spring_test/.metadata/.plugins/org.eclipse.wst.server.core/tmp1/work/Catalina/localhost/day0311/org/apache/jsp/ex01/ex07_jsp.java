/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 01:10:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex07_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onload = function(){\r\n");
      out.write("\t\tvar a = document.getElementsByClassName(\"tr\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i in a){\r\n");
      out.write("\t\t\tvar b = a[i];\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tb.onmouseover = function(){\r\n");
      out.write("\t\t\t\tthis.style.background =\"pink\";\r\n");
      out.write("\t\t\t}\t\t\r\n");
      out.write("\t\t\tb.onmouseout = function(){\r\n");
      out.write("\t\t\t\tthis.style.background =\"white\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table border=\"1\" width=\"80%\">\r\n");
      out.write("\t\t<tr bgcolor = \"skyblue\"><td>이름</td><td>나이</td><td>주소</td><td>전화</td></tr>\r\n");
      out.write("\t\t<tr class=\"tr\"><td>홍길동</td><td>20</td><td>서울</td><td>010-111-1111</td></tr>\r\n");
      out.write("\t\t<tr class=\"tr\"><td>이순신</td><td>21</td><td>부산</td><td>010-222-2222</td></tr>\r\n");
      out.write("\t\t<tr class=\"tr\"><td>유관순</td><td>22</td><td>대전</td><td>010-333-3333</td></tr>\r\n");
      out.write("\t\t<tr class=\"tr\"><td>강감찬</td><td>23</td><td>부안</td><td>010-444-4444</td></tr>\r\n");
      out.write("\t\t<tr class=\"tr\"><td>백두산</td><td>24</td><td>제주</td><td>010-555-5555</td></tr>\r\n");
      out.write("\t</table>\r\n");
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
