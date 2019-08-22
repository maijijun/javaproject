package com.maijijun.common.transaction;

import com.maijijun.common.HibernateSessionFactory;
import org.hibernate.Session;



public class HibernateTransaction implements Transaction {
	private org.hibernate.Transaction transaction;

	public void beginTransaction() {
		Session session = HibernateSessionFactory.getSession();
		if(!session.equals(null)){
		transaction = session.beginTransaction();
		}
		
	}

	public void commit() {
		transaction.commit();
	}

	public void rollback() {
		transaction.rollback();
	}
}
