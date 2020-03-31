/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 07:58:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map01_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>Kakao 지도 시작하기</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=2934c927d2d32254639ece8de18434e5\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar container = document.getElementById('map');\r\n");
      out.write("\tvar options = {\r\n");
      out.write("\t\tcenter : new kakao.maps.LatLng(37.5523762, 126.9355865), //위도,경도\r\n");
      out.write("\t\tlevel : 3\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tvar map = new kakao.maps.Map(container, options);\r\n");
      out.write("\r\n");
      out.write("\t// 지도를 클릭한 위치에 표출할 마커입니다\r\n");
      out.write("\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t// 지도 중심좌표에 마커를 생성합니다 \r\n");
      out.write("\t\tposition : map.getCenter()\r\n");
      out.write("\t});\r\n");
      out.write("\t// 지도에 마커를 표시합니다\r\n");
      out.write("\tmarker.setMap(map);\r\n");
      out.write("\r\n");
      out.write("\t// 지도에 클릭 이벤트를 등록합니다\r\n");
      out.write("\t// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다\r\n");
      out.write("\tkakao.maps.event.addListener(map, 'click', function(mouseEvent) {\r\n");
      out.write("\r\n");
      out.write("\t\t// 클릭한 위도, 경도 정보를 가져옵니다 \r\n");
      out.write("\t\tvar latlng = mouseEvent.latLng;\r\n");
      out.write("\r\n");
      out.write("\t\t// 마커 위치를 클릭한 위치로 옮깁니다\r\n");
      out.write("\t\tmarker.setPosition(latlng);\r\n");
      out.write("\r\n");
      out.write("\t\tvar message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';\r\n");
      out.write("\t\tmessage += '경도는 ' + latlng.getLng() + ' 입니다';\r\n");
      out.write("\r\n");
      out.write("\t\tvar resultDiv = document.getElementById('clickLatlng');\r\n");
      out.write("\t\tresultDiv.innerHTML = message;\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//거구장 버튼누르면 거구장으로 \r\n");
      out.write("\tvar a = document.getElementById(\"qq\").onclick = function() {\r\n");
      out.write("\t\tfunction setCenter() {\r\n");
      out.write("\t\t\t// 이동할 위도 경도 위치를 생성합니다 \r\n");
      out.write("\t\t\tvar moveLatLon = new kakao.maps.LatLng(37.5523762, 126.9355865);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 지도 중심을 이동 시킵니다\r\n");
      out.write("\t\t\tmap.setCenter(moveLatLon);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//집 버튼 누르면 집으로\r\n");
      out.write("\tvar b = document.getElementById(\"home\").onclick = function() {\r\n");
      out.write("\t\tfunction setCenter() {\r\n");
      out.write("\t\t\t// 이동할 위도 경도 위치를 생성합니다 \r\n");
      out.write("\t\t\tvar moveLatLon = new kakao.maps.LatLng(37.552371, 126.9027557);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 지도 중심을 이동 시킵니다\r\n");
      out.write("\t\t\tmap.setCenter(moveLatLon);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"map\" style=\"width: 500px; height: 400px;\"></div>\r\n");
      out.write("\t<button id=\"qq\">거구장</button>\r\n");
      out.write("\t<button id=\"home\">우리집</button>\r\n");
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
