package com.core;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import java.util.*;

/**
 * 파일 관리  
 *
 * 파일 업로드, 파일 다운로드, 파일 삭제 
 */
public class FileManager {
	private static final int MAX_UPLOAD_SIZE = 30 * 1024 * 1024;
	
	/**
	 * 파일 업로드 처리 
	 * 
	 * @param request
	 * @return 업로드된 파일 URL 
	 */
	public static String upload(HttpServletRequest request) {
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		// setSizeMax, setFileSizeMax 
		upload.setSizeMax(MAX_UPLOAD_SIZE);
		
		return null;
	}
}
