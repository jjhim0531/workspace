package com.kh.member.controller;
//controller : 브라우저에서 요청을 받아서 서버가 응답을 내려줌(servlet으로 만듬)
//(실질적인 내용은 controller에 보이지 않고 service에 표시됨)
//service : 요청의 실질적인 작업을 처리해줌.(controller가 너무 길어지지 않기 위해서)
 
import java.io.IOException;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1) 전달값에 한글이 있을 경우 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		
		//2) 요청시 전달값 추출해서 변수 또는 객체에 기록하기(form 태그의 name 그대로 가져오기)
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		 
		Member loginUser = new MemberService().loginMember(userId, userPwd);
		
		if(loginUser == null) { 
			//조회결과 없음 -> 로그인 실패 -> 에러문구가 보여지는 에러페이지로 포워딩
			request.setAttribute("errorMsg", "로그인에 실패하였습니다.");
			
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		} else {
			//조회결과 있음 -> 로그인 성공
			//로그인된 회원정보를 session영역에 담기(왜? 모든 페이지에서 다 사용할 수 있도록)
			//Servlet에서는 session영역에 접근하고자 한다면 우선 세션객체를 얻어야한다.
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			
			//1. 포워딩방식 -> 해당방식은 url이 변경되지 않는다. 
			//	 -> 우리는 localhost:8888/jsp/라는 기존의 메인 url이 있다.
			//   해당 방식으로 응답시 url은 http://localhost:8888/jsp/login.me가 나타난다.(url 2개에 도착지는 1개인 현상이 나타난다)
			//   실제 화면은 localhost:8888/jsp/의 응답화면이 나타난다.
			//	 request.getRequestDispatcher("index.jsp").forward(request, response);(요청마다 도착지가 달라진다면 forward 방식이 맞다)
			
			//2. url재요청 방식(로그인은 로그인후 다시 메인화면이 나타나야 하기에 도착지가 동일하다)
			// 기존에 해당 페이지를 응답하는 url이 존재했다면 사용가능
			// 응답페이지 -> index.jsp페이지(jsp url 재요청)
			response.sendRedirect(request.getContextPath());
			//contextPath = /jsp
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}