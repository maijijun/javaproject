package com.maijijun.common;


import com.maijijun.dao.IUserDao;
import com.maijijun.dao.imp.UserDaoImpl;
import com.maijijun.service.IUserService;
import com.maijijun.service.imp.UserServiceImpl;


public class BeanFactory {
	
	private static IUserDao userDao;
	private static IUserService userService;
	
	public static Object getBean(String beanName){
		System.out.print(beanName);
		if(beanName.equals("userDao")){
			return getUserDao();
		}else if(beanName.equals("userService")){
			return getUserService();
		}else{
			return null;
		}
	}
	
	private synchronized static IUserDao getUserDao(){
		if(userDao == null)
			userDao = new UserDaoImpl();
		return userDao;
	}
	
	private synchronized static IUserService getUserService(){
		if(userService == null)
			userService = new UserServiceImpl();
		return userService;
	}
	

}
