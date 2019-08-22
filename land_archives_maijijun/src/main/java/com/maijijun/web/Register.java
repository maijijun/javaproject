package com.maijijun.web;

import com.maijijun.bean.UsersEntity;
import com.maijijun.common.HibernateSessionFactory;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.service.imp.UserServiceImpl;
import org.hibernate.Session;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceImpl service = new UserServiceImpl();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address");
		String phonenumber = request.getParameter("phonenumber");
		// System.out.println(name + address + telephone);
		Session session = HibernateSessionFactory.getSession();
		List list = session.createQuery("from ").list();
		
		UsersEntity users = new UsersEntity();
		users.setId(list.size()+1);
		users.setAddress(address);
		users.setEmail(email);
		users.setPassword(password);
		users.setName(name);
		users.setZip(zip);
		users.setPhonenumber(phonenumber);
		

		try {
			service.register(users);
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);

		} catch (UserServiceException e) {
			request.getRequestDispatcher("/register.jsp").forward(request,
					response);
			e.printStackTrace();
		}

	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
