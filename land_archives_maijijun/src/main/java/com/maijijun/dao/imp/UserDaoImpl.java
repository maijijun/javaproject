package com.maijijun.dao.imp;

import java.util.List;

import com.maijijun.bean.UsersEntity;
import com.maijijun.common.HibernateSessionFactory;
import com.maijijun.dao.IUserDao;
import org.hibernate.Session;



public class UserDaoImpl implements IUserDao {

	@Override
	public void saveOrupdateUser(UsersEntity users) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		session.clear();
		session.saveOrUpdate(users);
	}

	@Override
	public UsersEntity findUserByName(String name) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		List list = session.createQuery("from User where name=?")
				.setString(0, name).list();
		if (list.size() != 0) {
			return (UsersEntity) list.get(0);
		} else {
			return null;
		}
	}

}
