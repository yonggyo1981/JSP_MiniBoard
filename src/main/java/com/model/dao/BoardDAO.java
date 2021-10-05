package com.model.dao;

import javax.servlet.http.HttpServletRequest;
import com.core.*;
import java.io.IOException;
import java.sql.*;

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
		String sql = "";
		try(Connection conn = DB.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			request.setCharacterEncoding("UTF-8");
		
		
		
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		return idx;
	}
}
