package com.model.dto;

import java.sql.ResultSet;

/**
 * 게시판 Bean 클래스 
 *
 */
public class Board {
	private int idx; // 게시글 번호
	private String poster; // 작성자
	private String subject; // 게시글 제목
	private String content; // 게시글 내용
	private String regDt; // 게시글 등록일자
	
	public Board() {}
	
	public Board(ResultSet rs) {
		
	}
	
	public Board(int idx, String poster, String subject, String content, String regDt) {
		this.idx = idx;
		this.poster = poster;
		this.subject = subject;
		this.content = content;
		this.regDt = regDt;
	}
	
	public int getIdx() {
		return idx;
	}
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getPoster() {
		return poster;
	}
	
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getRegDt() {
		return regDt;
	}
	
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}	
}
