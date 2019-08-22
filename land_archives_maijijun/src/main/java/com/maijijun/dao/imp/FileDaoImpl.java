package com.maijijun.dao.imp;

import java.util.List;

import com.maijijun.bean.FilesEntity;
import com.maijijun.common.HibernateSessionFactory;
import com.maijijun.dao.IFileDao;
import org.hibernate.Session;


public class FileDaoImpl implements IFileDao {
	public void saveOrupdateFiles(FilesEntity files) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		session.save(files);
	}
	public void saveOrupdateFiles1(FilesEntity files) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		session.update(files);
	}
	public void deleteFiles(FilesEntity files) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		session.delete(files);
	}
	
	public FilesEntity findFilesByGnum(String gNum) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		List list;
		list = session.createQuery("")
				.setString(0, gNum).list();
		if (list.size() != 0) {
			return (FilesEntity) list.get(0);
		} else {
			return null;
		}
	}
	
	

}
