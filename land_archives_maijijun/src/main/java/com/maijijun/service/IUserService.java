package com.maijijun.service;


import com.maijijun.bean.UsersEntity;
import com.maijijun.common.exception.UserServiceException;

public interface IUserService {
	void register(UsersEntity users) throws UserServiceException;
	UsersEntity login(String name, String password) throws UserServiceException;
}
