package com.bit.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.MemberDAO;
import com.bit.vo.MemberVO;

/**
 * Servlet implementation class insertMemberServlet
 */
@WebServlet("/insertMember.do")
public class insertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");	//한글설정

		PrintWriter out = response.getWriter();
		String str ="<html>";
		str +="<form method='post' action='insertMember.do'>";
		
		str += "아이디 : ";
		str += "<input type='text' name='id'><br><br>";
		
		str += "비밀번호: ";
		str += "<input type='password' name='pwd'><br><br>";
		
		str += "이름: ";
		str += "<input type='text' name='name'><br><br>";
			
		str += "연락처: ";
		str += "<input type='tel' name='tel' "
				+ "pattern='[0-9]{3}-[0-9]{4}-[0-9]{4}' placeholder='010-1234-5678'><br><br>";
		
		str += "생일: ";
		str += "<input type='date' name='birth'><br><br>";
		
		str += "이메일: ";
		str += "<input type='email' name='email'><br><br>";
		
		str += "성별: ";
		str += "<input type='radio' name='gender' value='남자'> 남자  "
			   + "<input type='radio' name='gender' value='여자'>여자 <br><br>";

		str += "혈액형: ";
		str += "<input type='radio' name='blood' value='a'> a형  "
				+ " <input type='radio' name='blood' value='b'> b형 "
				+ " <input type='radio' name='blood' value='o'> o형 " 
				+ " <input type='radio' name='blood' value='ab'> ab형<br><br> " ;
				
		str += "취미: ";
		str += "<input type='checkbox' name='hobby' value='게임'>게임"
				+ "<input type='checkbox' name='hobby' value='영화'>영화"
				+ "<input type='checkbox' name='hobby' value='음악감상'>음악감상"
				+ "<input type='checkbox' name='hobby' value='독서'>독서"
				+ "<input type='checkbox' name='hobby' value='운동'>운동<br><br>";
		
		str += "URL: ";
		str += "<input type='url' name='url'><br><br>";
		
		str += "직업:<br> ";
		str += "<select name = 'job' size='0'>" 
				+ "<option value='자영업'>자영업</option>"
				+ "<option value='회사원'>회사원</option>"
				+ "<option value='학생'>학생</option>"
				+ "<option value='주부'>주부</option>"
				+ "<option value='기타'>기타</option>"
				+ "</select><br><br>";
		
		str += "소개:<br> ";
		str += "<textarea name='intro' rows='10' cols='60'></textarea><br><br>";
		
		str += "<input type='submit' value='가입'>";
		str += "<input type='reset' value='취소'>";
		
		str +="</form>";
		str += "</html>";
		out.print(str);
		out.close();
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		MemberVO m = new MemberVO();
		m.setId(request.getParameter("id"));
		m.setPwd(request.getParameter("pwd"));
		m.setName(request.getParameter("name"));
		m.setTel(request.getParameter("tel"));
		m.setBirth(request.getParameter("birth"));
		m.setEmail(request.getParameter("email"));
		m.setGender(request.getParameter("gender"));
		m.setBlood(request.getParameter("blood"));
		m.setHobby(Arrays.toString((request.getParameterValues("hobby"))));
		m.setUrl(request.getParameter("url"));
		m.setJob(request.getParameter("job"));
		m.setIntro(request.getParameter("intro"));
		
		MemberDAO dao = new MemberDAO();
		int re = dao.insertMember(m);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(re > 0) {
			out.println("회원가입에 성공하였습니다.");
//			response.sendRedirect("");
		}else {
			out.println("회원가입에 실패하였습니다.");
			out.close();
		}
	}

}
