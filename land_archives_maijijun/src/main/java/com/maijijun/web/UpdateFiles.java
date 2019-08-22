package com.maijijun.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.maijijun.bean.FilesEntity;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.service.imp.FileServiceImpl;


public class UpdateFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FileServiceImpl service = new FileServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pid = request.getParameter("flh");
		String gnum = request.getParameter("tdh");
		String squre = request.getParameter("mj");
		String type = request.getParameter("lx"); 
		String usedfor = request.getParameter("tdyt");
		String people = request.getParameter("yyz");
		String location = request.getParameter("wz");
		String whenuse = request.getParameter("kssysj");
		String remark = request.getParameter("bz");
		String content = request.getParameter("nr");

		FilesEntity files = new FilesEntity();
		files.setPid(pid);
		files.setGnum(gnum);
		files.setSqure(squre);
		files.setType(type);
		files.setUsedfor(usedfor);
		files.setPeople(people);
		files.setLocation(location);
		files.setWhenuse(whenuse);
		files.setRemark(remark);
		files.setContent(content);

		try {
			service.addFiles(files);
		} catch (UserServiceException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/query.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}