/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-09 08:26:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.bit.dao.MemberDAO;
import com.bit.vo.MemberVO;
import java.util.Arrays;

public final class insertMemberOK_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

		//bit1234/bit1234 계정을 생성하고
		//다음의 자료를 추가할 테이블(member)을 생성하고
		//데이터베이스에 insert를 수행하도록 기능을 추가합니다

		//SQL> create user c##bit1234 identified by bit1234;
		//SQL> grant connect, resource, dba to c##bit1234;

		/*
		create table member (id varchar2(20) primary key, pwd varchar2(20), name varchar2(20), tel varchar2(20),
		birth date, email varchar2(20), gender varchar2(10), blood varchar2(10), hobby varchar2(60), url varchar2(100),
		job varchar2(20), intro varchar2(1000));
		
		insert into member values (?,?,?,?,?,?,?,?,?,?,?,?);
		*/

		//사용자가 요청한 데이터는 한글입니다를 설정
		request.setCharacterEncoding("UTF-8");

		String method = request.getMethod();

		//사용자가 입력한 데이터를 가져옴
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String[] hobby = request.getParameterValues("hobby");
		String url = request.getParameter("url");
		String job = request.getParameter("job");
		String intro = request.getParameter("intro");
		String hobbys = "";

		//"생일"은 자료형을 어떻게 해요?
		//데이터베이스 컬럼은 date로 해요
		//vo는 String으로 해요
		//request.getParmater가 String을 반환합니다
		//vo에 있는걸 table로 보낼때 to_date함수 이용
		//table에 있는걸 vo로 가져올때 to_char함수 이용
		//to_date('2020/01/01', 'yyyy/mm/dd')

		//hobbys = Arrays.toString(hobby);
		for (String ho : hobby) {
			hobbys = hobbys + ho + ",";
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(hobbys);
      out.write('\r');
      out.write('\n');
      out.write('	');

		}

		int re = -1;

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		if (method.equals("POST")) {
			MemberVO m = new MemberVO(id, pwd, name, tel, birth, email, gender, blood, hobbys, url, job, intro);
			MemberDAO m_dao = new MemberDAO();
			re = m_dao.insertMember(m);

			if (re > 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}
		}
	
      out.write("\r\n");
      out.write("\t입력정보는 다음과 같습니다\r\n");
      out.write("\t<br> 아이디 :\r\n");
      out.write("\t");
      out.print(id);
      out.write("<br> 암호 :\r\n");
      out.write("\t");
      out.print(pwd);
      out.write("<br> 이름 :\r\n");
      out.write("\t");
      out.print(name);
      out.write("<br> 전화번호 :\r\n");
      out.write("\t");
      out.print(tel);
      out.write("<br> 생일 :\r\n");
      out.write("\t");
      out.print(birth);
      out.write("<br> 이메일 :\r\n");
      out.write("\t");
      out.print(email);
      out.write("<br> 성별 :\r\n");
      out.write("\t");
      out.print(gender);
      out.write("<br> 혈액형 :\r\n");
      out.write("\t");
      out.print(blood);
      out.write("<br> 취미 :\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");

		//hobbys = Arrays.toString(hobby);
		for (String ho : hobby) {
			hobbys = hobbys + ho + ",";
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(hobbys);
      out.write('\r');
      out.write('\n');
      out.write('	');

		}
	
      out.write("<br> 홈페이지주소 :\r\n");
      out.write("\t");
      out.print(url);
      out.write("<br> 직업 :\r\n");
      out.write("\t");
      out.print(job);
      out.write("<br> 자기소개 :\r\n");
      out.write("\t");
      out.print(intro);
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
