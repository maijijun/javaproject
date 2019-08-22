package com.maijijun.web;
import com.maijijun.bean.FilesEntity;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.service.imp.FileServiceImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class AddFiles extends HttpServlet {
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
		files.setGnum(gnum);

		FilesEntity files2= service.getAllFiles(files);
		if(files2.equals(null)){
		files.setPid(pid);
		files.setSqure(squre);
		files.setType(type);
		files.setUsedfor(usedfor);
		files.setPeople(people);
		files.setLocation(location);
		files.setWhenuse(whenuse);
		files.setRemark(remark);
		files.setContent(content);

			try {
				service.addFiles1(files);
			} catch (UserServiceException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("/queryrs.jsp").forward(request, response);

		}
		else{
			files2.setPid(pid);
			files2.setSqure(squre);
			files2.setType(type);
			files2.setUsedfor(usedfor);
			files2.setPeople(people);
			files2.setLocation(location);
			files2.setWhenuse(whenuse);
			files2.setRemark(remark);
			files2.setContent(content);

			try {
				service.addFiles1(files2);
			} catch (UserServiceException e) {
				e.printStackTrace();
			}
			request.setAttribute("files", files2);
			request.getRequestDispatcher("/queryrs.jsp").forward(request, response);

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}