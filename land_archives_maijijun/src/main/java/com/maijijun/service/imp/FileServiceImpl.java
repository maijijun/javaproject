package com.maijijun.service.imp;


import com.maijijun.bean.FilesEntity;
import com.maijijun.common.exception.UserServiceException;
import com.maijijun.common.transaction.HibernateTransaction;
import com.maijijun.dao.imp.FileDaoImpl;
import com.maijijun.service.iFileServer;

public class FileServiceImpl implements iFileServer {
	private FileDaoImpl dao = new FileDaoImpl();

	public FilesEntity getAllFiles(FilesEntity files){
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		FilesEntity files2 =new FilesEntity();
		try {
			 files2 = dao.findFilesByGnum(files.getGnum());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return files2;
		
	}
	public void addFiles(FilesEntity files) throws UserServiceException {
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		try {
			FilesEntity files2 = dao.findFilesByGnum(files.getGnum());
			if (files2 != null) {
				throw new UserServiceException("已经存在");
			}
			dao.saveOrupdateFiles(files);
			ht.commit();
		} catch (Exception e) {
			ht.rollback();
			e.printStackTrace();
			throw new UserServiceException("失败");
		}
		
	}
	public void addFiles1(FilesEntity files) throws UserServiceException {
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		try {
			FilesEntity files2 = dao.findFilesByGnum(files.getGnum());
			dao.saveOrupdateFiles1(files);
			ht.commit();
		} catch (Exception e) {
			ht.rollback();
			e.printStackTrace();
			throw new UserServiceException("失败");
		}
		
	}
	public void delFiles(FilesEntity files) throws UserServiceException {
		HibernateTransaction ht = new HibernateTransaction();
		ht.beginTransaction();
		try {
			FilesEntity files2 = dao.findFilesByGnum(files.getGnum());
			dao.deleteFiles(files2);
			ht.commit();
		} catch (Exception e) {
			ht.rollback();
			e.printStackTrace();
			throw new UserServiceException("失败");
		}
		
	}
}