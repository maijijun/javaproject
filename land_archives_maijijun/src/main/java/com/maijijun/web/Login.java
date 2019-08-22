package com.maijijun.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.maijijun.bean.UsersEntity;
import com.maijijun.common.BeanFactory;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.service.imp.UserServiceImpl;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceImpl service = (UserServiceImpl) BeanFactory.getBean("userService");
  
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			UsersEntity users = service.login(name, password);
			
			HttpSession session = request.getSession();
			session.setAttribute("users", users);
			request.getRequestDispatcher("/host.jsp").forward(request, response);
		} catch (UserServiceException e) {
			e.printStackTrace();
		
			request.setAttribute("message", "<script laguage='JavaScript'> alert('用户名或密码错误，请重新输入！') </script>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

