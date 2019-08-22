package com.maijijun.service.imp;


import com.maijijun.bean.UsersEntity;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.common.transaction.HibernateTransaction;
import com.maijijun.dao.imp.UserDaoImpl;
import com.maijijun.service.IUserService;

public class UserServiceImpl implements IUserService {
	private UserDaoImpl dao = new UserDaoImpl();

	@Override
	public void register(UsersEntity users) throws UserServiceException {
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		try {
			UsersEntity users2 = dao.findUserByName(users.getName());
			if (users2 != null) {
				throw new UserServiceException("用户已存在");
			}
			dao.saveOrupdateUser(users);
			ht.commit();
		} catch (Exception e) {
			ht.rollback();
			e.printStackTrace();
			throw new UserServiceException("用户已存在");
		}

	}


	@Override
	public UsersEntity login(String name, String password)
			throws UserServiceException {
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		try {
			UsersEntity users = dao.findUserByName(name);
			if(users != null){
				if (users.getPassword().equals(password)) {
					return users;
				}else {
					throw new UserServiceException("登陆成功");
				}
			}else {
				throw new UserServiceException("登录失败");
			}
		} catch (Exception e) {
			
			throw new UserServiceException("异常");
		}
	}
}
