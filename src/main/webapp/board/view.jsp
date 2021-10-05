<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.model.dto.Board" %>
<%
	Board board = (Board)request.getAttribute("board");
%>
<c:set var="board" value="<%=board%>" />
<dl>
	<dt>제목</dt>
	<dd>${board.subject}</dd>
</dl>
<dl>
	<dt>작성자</dt>
	<dd>${board.poster} / ${board.regDt}</dd>
</dl>
<dl>
	<dt>내용</dt>
	<dd>${board.content}</dd>
</dl>

