/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 08:13:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>Kakao 지도 시작하기</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=2934c927d2d32254639ece8de18434e5\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tvar mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("\t\tmapOption = {\r\n");
      out.write("\t\t\tcenter : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("\t\t\tlevel : 3\r\n");
      out.write("\t\t// 지도의 확대 레벨\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\r\n");
      out.write("\r\n");
      out.write("\t\t// 마커가 표시될 위치입니다 \r\n");
      out.write("\t\tvar markerPosition = new kakao.maps.LatLng(33.450701, 126.570667);\r\n");
      out.write("\r\n");
      out.write("\t\t// 마커를 생성합니다\r\n");
      out.write("\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\tposition : markerPosition\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 마커가 지도 위에 표시되도록 설정합니다\r\n");
      out.write("\t\tmarker.setMap(map);\r\n");
      out.write("\r\n");
      out.write("\t\t// 아래 코드는 지도 위의 마커를 제거하는 코드입니다\r\n");
      out.write("\t\t// marker.setMap(null);\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById(\"btnHome\").onclick = function() {\r\n");
      out.write("\t\t\t// 이동할 위도 경도 위치를 생성합니다 \r\n");
      out.write("\t\t\tvar moveLatLon = new kakao.maps.LatLng(37.584890, 126.912712);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 지도 중심을 이동 시킵니다\r\n");
      out.write("\t\t\tmap.setCenter(moveLatLon);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 마커를 생성합니다\r\n");
      out.write("\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\tposition : moveLatLon\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 마커가 지도 위에 표시되도록 설정합니다\r\n");
      out.write("\t\t\tmarker.setMap(map);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById(\"btnKTutle\").onclick = function() {\r\n");
      out.write("\t\t\t// 이동할 위도 경도 위치를 생성합니다 \r\n");
      out.write("\t\t\tvar moveLatLon = new kakao.maps.LatLng(37.552486, 126.937684);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 지도 중심을 이동 시킵니다\r\n");
      out.write("\t\t\tmap.setCenter(moveLatLon);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 마커를 생성합니다\r\n");
      out.write("\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\tposition : moveLatLon\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 마커가 지도 위에 표시되도록 설정합니다\r\n");
      out.write("\t\t\tmarker.setMap(map);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"map\" style=\"width: 100%; height: 350px;\"></div>\r\n");
      out.write("\t<button id=\"btnHome\">우리집</button>\r\n");
      out.write("\t<button id=\"btnKTutle\">거구장</button>\r\n");
      out.write("\r\n");
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