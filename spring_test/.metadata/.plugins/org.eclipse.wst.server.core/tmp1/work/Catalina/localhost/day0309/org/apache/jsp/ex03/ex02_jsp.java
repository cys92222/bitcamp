/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-09 09:17:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex02_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("window.onload = function(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar arr = [\r\n");
      out.write("\t\t{name:\"축구공\",fname:\"ball2.jpg\"},\r\n");
      out.write("\t\t{name:\"운동복\",fname:\"cloth1.jpg\"},\r\n");
      out.write("\t\t{name:\"축구화\",fname:\"shoe5.jpg\"},\r\n");
      out.write("\t\t{name:\"축구양말\",fname:\"stock3.jpg\"}]; //객체를 가지고있는 배열\r\n");
      out.write("\t\t\r\n");
      out.write("\tdocument.getElementById(\"btnRead\").onclick = function(){\r\n");
      out.write("\t\tfor(var i=0; i<arr.length; i++){\r\n");
      out.write("\t\t\tvar g = arr[i];\r\n");
      out.write("\t\t\tvar txtNode = document.createTextNode(g.name);\r\n");
      out.write("\t\t\tvar li = document.createElement(\"li\");\r\n");
      out.write("\t\t\tli.setAttribute(\"idx\",i);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tli.onclick = function(){\r\n");
      out.write("\t\t\t\tvar idx = this.getAttribute(\"idx\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img\").src = arr[idx].fname;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tli.appendChild(txtNode);\r\n");
      out.write("\t\t\tdocument.getElementById(\"list\").appendChild(li);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"list\" ></ul>\r\n");
      out.write("\t<button id=\"btnRead\">상품 읽어오기</button>\r\n");
      out.write("\t<img id=\"img\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
