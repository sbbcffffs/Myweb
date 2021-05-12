package com.myweb.servlet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.servlet.dao.ServletDAO;
import com.myweb.util.JdbcUtil;

public class ServletService extends JdbcUtil {
	
	//CRUD - Create. 멤버등록
	public void memberRegist(HttpServletRequest request, HttpServletResponse response) {
		
		ServletDAO servletdao = new ServletDAO();
		
		Connection connOpen = open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO MEMBERS ( ID, PW, NAME, EMAIL )"
				   + "VALUES ( ?, 'Louis', ?, 'ssss@ssss.com' )";
		
		try {
			pstmt = connOpen.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("name"));
			
			servletdao.memberRegist(pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	//CRUD - Read. 멤버조회
	public void memberRead(HttpServletRequest request, HttpServletResponse response) {
		
		ServletDAO servletdao = new ServletDAO();
		
		Connection connOpen = open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO MEMBERS ( ID, PW, NAME, EMAIL )"
				   + "VALUES ( ?, 'Louis', ?, 'ssss@ssss.com' )";
		
		try {
			pstmt = connOpen.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("name"));
			
			servletdao.memberRegist(pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
		
	//CRUD - Update. 멤버수정
	public void memberUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		ServletDAO servletdao = new ServletDAO();
		
		Connection connOpen = open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO MEMBERS ( ID, PW, NAME, EMAIL )"
				   + "VALUES ( ?, 'Louis', ?, 'ssss@ssss.com' )";
		
		try {
			pstmt = connOpen.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("name"));
			
			servletdao.memberRegist(pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
		
	//CRUD - Delete. 멤버삭제
	public void memberDelete(HttpServletRequest request, HttpServletResponse response) {
		
		ServletDAO servletdao = new ServletDAO();
		
		Connection connOpen = open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO MEMBERS ( ID, PW, NAME, EMAIL )"
				   + "VALUES ( ?, 'Louis', ?, 'ssss@ssss.com' )";
		
		try {
			pstmt = connOpen.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("name"));
			
			servletdao.memberRegist(pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
