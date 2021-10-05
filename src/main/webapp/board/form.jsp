<%@ page contentType="text/html; charset=utf-8" %>
<form name='writeFrm' method="post" action="write" target='ifrmHidden' autocomplete='off'>
	<dl>
		<dt>제목</dt>
		<dd>
			<input type="text" name="subject">
		</dd>
	</dl>
	<dl>
		<dt>작성자</dt>
		<dd>
			<input type="text" name="poster">
		</dd>
	</dl>
	<dl>
		<dt>내용</dt>
		<dd>
			<textarea name="content" width="700" height="500"></textarea>
		</dd>
	</dl>
	<input type="reset" value="취소하기">
	<input type="submit" value="작성하기">
</form>