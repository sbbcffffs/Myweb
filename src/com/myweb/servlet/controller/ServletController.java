package com.myweb.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.servlet.service.ServletService;

import sun.jvm.hotspot.debugger.Debugger;

@WebServlet("*.yeo")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//GET 요청 시
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	//POST 요청 시
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	//GET, POST 요청에 따른 공통 처리
	@SuppressWarnings("null")
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletService servletService = new ServletService();
		
		//캐릭터셋 인코딩: UTF-8 설정
		request.setCharacterEncoding("UTF-8");
		//URI setter
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length());
		
		//CRUD - Create. 멤버등록
		if("/servlet/regist.yeo".equals(command)) {
			servletService.memberRegist(request, response);
		}
		
		//CRUD - Read. 멤버조회
		if("/servlet/read.yeo".equals(command)) {
			servletService.memberRead(request, response);
		} 

		//CRUD - Update. 멤버수정
		if("/servlet/update.yeo".equals(command)) {
			servletService.memberUpdate(request, response);
		}
		
		//CRUD - Delete. 멤버삭제
		if("/servlet/delete.yeo".equals(command)) {
			servletService.memberDelete(request, response);
		} 
	}
}
