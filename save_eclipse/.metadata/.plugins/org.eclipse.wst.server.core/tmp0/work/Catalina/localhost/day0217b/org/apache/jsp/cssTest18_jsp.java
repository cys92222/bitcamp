/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-17 04:11:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cssTest18_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t.place{\r\n");
      out.write("\t\twidth: 600px;\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t\tbackground-color: pink;\r\n");
      out.write("\t\tmargin: 10px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\tfont-family: Arial, Times, sans-serif;\r\n");
      out.write("\t\tfont-style: italic;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"place\">(CNN)The US plan to evacuate Americans and their families from the Diamond Princess cruise ship appears, on its face, to be the case of a powerful government coming to the aid of its most vulnerable citizens.\r\n");
      out.write("But the decision has prompted anger from some exhausted passengers, who believe the move could actually set back their ability to return to normal life -- just as that option was within their grasp.\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"place\">On Saturday afternoon, the US Embassy in Tokyo sent a notice to Americans on board the Diamond Princess laying out plans to evacuate nearly 400 Americans back home.\r\n");
      out.write("Once there, another 14 days of mandatory quarantine would begin. Anyone who chose not to get on the flight would have to wait another 14 days in Japan to ensure they were symptom-free before returning to the US.\r\n");
      out.write("That decision has prompted anger among the American passengers, with many demanding answers to two simple questions about the US response: Why did the American government wait so long to make the about-face decision? What prompted such a dramatic shift in US policy?\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"place\">\"From tragedy to comedy to farce,\" tweeted American passenger Matthew Smith, pulling no punches. \"The US government instead wants to take us off without testing, fly us back to the US with a bunch of other untested people, and then stick us in 2 more weeks of quarantine? How does that make any sense at all?\"\r\n");
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
