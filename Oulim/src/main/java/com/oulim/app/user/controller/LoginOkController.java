package com.example.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.user.dao.UserDAO;
import com.oulim.app.user.dto.UserDTO;

public class LoginOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		int userNumber = 0;
		Result result = new Result();
		
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		String reuser = request.getParameter("reuser");
		HttpSession session = request.getSession(); //+++ 세션저장
		String path = null;
		
		userDTO.setuserId(userId);
		userDTO.setuserPw(userPw);
		System.out.println(userDTO);
		
		//쿼리문 실행 메소드 호출
		userNumber = userDAO.login(userDTO);
		System.out.println(userNumber); 
		
		if(userNumber != -1) {
			path = "/user/join.me";
			session.setAttribute("userNumber", userNumber);
			System.out.println("세션값 : " + userNumber);
			
			if(reuser != null) {
				Cookie cookie = new Cookie("userId", userId);
				cookie.setMaxAge(60 * 60 * 24); //1일
				response.addCookie(cookie);
			}else {
				//체크 해제시 쿠키 삭제
				Cookie cookie = new Cookie("userId", "");
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}else {
			path = "/user/login.me?login=fail";
		}
		
		result.setRedirect(true); //세션에 저장된 값은 유지
		result.setPath(path);
		
		
		return result;
	}

}
