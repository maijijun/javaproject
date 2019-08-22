package com.maijijun.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maijijun.bean.FilesEntity;
import com.maijijun.service.imp.FileServiceImpl;



public class FindFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FileServiceImpl service = new FileServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gNum = request.getParameter("tudi");

		FilesEntity files = new FilesEntity();
		files.setGnum(gNum);
		
		try{

			FilesEntity files2= service.getAllFiles(files);
			request.setAttribute("files", files2);
			request.getRequestDispatcher("/queryrs.jsp").forward(request, response);
		      
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("message1", "<script laguage='JavaScript'> alert('文件不存在') </script>");
			request.getRequestDispatcher("/query.jsp").forward(request, response);
		}
		
	}

	public FindFiles() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
