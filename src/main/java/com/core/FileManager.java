package com.core;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import java.util.*;
import java.io.*;

/**
 * 파일 관리  
 *
 * 파일 업로드, 파일 다운로드, 파일 삭제 
 */
public class FileManager {
	private static final int MAX_UPLOAD_SIZE = 30 * 1024 * 1024;
	
	// 일반 양식 데이터 
	private static HashMap<String, String> postData = new HashMap<>();
	
	/**
	 * 파일 업로드 처리 
	 * 
	 * @param request
	 * @return 업로드된 파일 URL 
	 */
	public static String[] upload(HttpServletRequest request) {
		
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("UTF-8");
			// setSizeMax, setFileSizeMax 
			upload.setSizeMax(MAX_UPLOAD_SIZE);
		
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> params = items.iterator();
			while(params.hasNext()) {
				FileItem item = params.next();
				if (item.isFormField()) { // 일반 양식 데이터 
					String key = item.getFieldName();
					String value = item.getString("UTF-8");
					postData.put(key, value);
				} else { // 파일 데이터 
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
