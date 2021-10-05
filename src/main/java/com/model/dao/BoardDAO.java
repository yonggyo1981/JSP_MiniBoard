package com.model.dao;

import javax.servlet.http.HttpServletRequest;
import com.core.*;
import java.io.IOException;
import java.sql.*;

import com.model.dto.Board;

/**
 * 게시판 DAO
 *
 */
public class BoardDAO {
	/**
	 * 게시글 작성 
	 * 
	 * @param request
	 * @return 게시글 작성 성공시 등록된 게시글 번호(0이면 실패...)
	 */
	public int write(HttpServletRequest request) {
		int idx = 0;
		String sql = "INSERT INTO board (poster, subject, content) VALUES(?, ?, ?)";
		try(Connection conn = DB.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			request.setCharacterEncoding("UTF-8");
			String poster = request.getParameter("poster");
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");
			pstmt.setString(1, poster);
			pstmt.setString(2, subject);
			pstmt.setString(3, content);
			
			int result = pstmt.executeUpdate();
			if (result > 0) { // 게시글 등록이 잘 된 경우 
				ResultSet rs = pstmt.getGeneratedKeys();
				/**
				 *  // .next() -> 다음 투플로 있으면 true, 이동
				 *  // .getXxx(속성 순서 번호(1~), 속성명)
				 */
				if (rs.next()) {
					idx = rs.getInt(1);
				}
			}
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		return idx;
	}
	
	/**
	 * 게시글 조회 
	 * 
	 * @param idx
	 * @return
	 */
	public Board get(int idx) {
		Board board = null;
		String sql = "SELECT * FROM board WHERE idx = ?";
		try (Connection conn = DB.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, idx);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				
			}
			rs.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return board;
	}
}





