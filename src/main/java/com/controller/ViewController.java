package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * 게시글 보기 
 *
 */
public class ViewController extends HttpServlet {
	
	private static final long serialVersionUID = -1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/view.jsp");
		rd.include(request, response);
	}
}