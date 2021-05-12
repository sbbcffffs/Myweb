package com.myweb.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.myweb.util.JdbcUtil;

public class ServletDAO {
		
	private DataSource ds; // 데이터베이스 연결풀을 저장해놓는 객체
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	//CRUD - Create. 멤버등록
	public void memberRegist(PreparedStatement pstmt) {

		try {
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	//CRUD - Read. 멤버조회
	public void memberRead(PreparedStatement pstmt) {

		try {
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	//CRUD - Update. 멤버수정
	public void memberUpdate(PreparedStatement pstmt) {

		try {
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	//CRUD - Delete. 멤버삭제
	public void memberDelete(PreparedStatement pstmt) {

		try {
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}

