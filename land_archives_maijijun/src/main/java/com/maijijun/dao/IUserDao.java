package com.maijijun.dao;

import com.maijijun.bean.UsersEntity;

public interface IUserDao {
	void saveOrupdateUser(UsersEntity users) throws Exception;
	UsersEntity findUserByName(String name) throws Exception;
}
