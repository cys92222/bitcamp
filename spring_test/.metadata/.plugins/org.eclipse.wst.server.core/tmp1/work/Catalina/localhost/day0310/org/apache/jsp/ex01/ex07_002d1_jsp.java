/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-10 02:40:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex07_002d1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tvar arr  = [\r\n");
      out.write("\t\t\t{no:1, name:\"스타킹1\", qty:10, price:1200, fname:\"stock1.jpg\"},\r\n");
      out.write("\t\t\t{no:2, name:\"스타킹2\", qty:10, price:1700, fname:\"stock2.jpg\"},\r\n");
      out.write("\t\t\t{no:3, name:\"스타킹3\", qty:10, price:1100, fname:\"stock3.jpg\"},\r\n");
      out.write("\t\t\t{no:4, name:\"스타킹4\", qty:10, price:900, fname:\"stock4.jpg\"},\r\n");
      out.write("\t\t\t{no:5, name:\"스타킹5\", qty:10, price:1000, fname:\"stock5.jpg\"}]\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementsByTagName(\"button\")[0].onclick = function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tfor(var i = 0; i<arr.length; i++){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar tr = document.createElement(\"tr\");\r\n");
      out.write("\t\t\t\tvar g = arr[i];\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(var a in g){\r\n");
      out.write("\t\t\t\t\tvar td = document.createElement(\"td\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(a == \"fname\"){\r\n");
      out.write("\t\t\t\t\t\tvar img = document.createElement(\"img\");\r\n");
      out.write("\t\t\t\t\t\timg.src = g[a];\r\n");
      out.write("\t\t\t\t\t\timg.width = 50;\r\n");
      out.write("\t\t\t\t\t\timg.height = 50;\r\n");
      out.write("\t\t\t\t\t\ttd.appendChild(img);\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tvar txt = document.createTextNode(g[a]);\r\n");
      out.write("\t\t\t\t\t\ttd.appendChild(txt);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\ttr.appendChild(td);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.getElementsByTagName(\"table\")[0].appendChild(tr);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>장바구니 목록</h2>\r\n");
      out.write("\t<table border=\"1\" width=\"80%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>상품번호</td>\r\n");
      out.write("\t\t\t<td>상품명</td>\r\n");
      out.write("\t\t\t<td>수량</td>\r\n");
      out.write("\t\t\t<td>가격</td>\r\n");
      out.write("\t\t\t<td>사진</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<button>장바구니 목록 읽어오기</button>\r\n");
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
