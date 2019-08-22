package com.maijijun.service;

import com.maijijun.bean.FilesEntity;
import com.maijijun.common.exception.UserServiceException;

public interface iFileServer{
	FilesEntity getAllFiles(FilesEntity files);
	void addFiles(FilesEntity files) throws UserServiceException;
	void addFiles1(FilesEntity files) throws UserServiceException;
	void delFiles(FilesEntity files) throws UserServiceException;
	
}
