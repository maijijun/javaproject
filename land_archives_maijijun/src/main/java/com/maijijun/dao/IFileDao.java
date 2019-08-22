package com.maijijun.dao;


import com.maijijun.bean.FilesEntity;

public interface IFileDao {
	void saveOrupdateFiles(FilesEntity files) throws Exception;
	void saveOrupdateFiles1(FilesEntity files) throws Exception;
	void deleteFiles(FilesEntity files) throws Exception;
	FilesEntity findFilesByGnum(String gNum) throws Exception;
}