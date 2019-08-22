package com.maijijun.web;

import com.maijijun.bean.FilesEntity;
import com.maijijun.service.imp.FileServiceImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DelFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FileServiceImpl service = new FileServiceImpl();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String gNum = request.getParameter("tdh");

		FilesEntity files = new FilesEntity();
		files.setGnum(gNum);
		FilesEntity files2 = service.getAllFiles(files);

		if (!files2.equals(null)) {
			try {
				service.delFiles(files2);
				request.getRequestDispatcher("/query.jsp").forward(request,
						response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			request.getRequestDispatcher("/queryrs.jsp").forward(request,
					response);;
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
