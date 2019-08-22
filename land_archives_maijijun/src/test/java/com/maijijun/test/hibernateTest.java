package com.maijijun.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import  com.maijijun.bean.*;
import org.junit.jupiter.api.Test;


public class hibernateTest {
	@Test
  public void  add(){

	  // 加载Hibernate默认配置文件
	  Configuration configuration = new Configuration().configure();

		//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).configure().build();
	  // 用Configuration创建SessionFactory
	  SessionFactory factory = configuration.buildSessionFactory();
	  // 创建Session
	  Session session = factory.openSession();
	  // 开启事务
	  Transaction transaction = session.beginTransaction();
	  // 实例化持久化类
	  UsersEntity user = new UsersEntity();
	  user.setId(1);
	  user.setName("maijijun");
	  user.setPassword("123456");
	  user.setAddress("杭州");
	  user.setEmail("maijijun@bilibili.com");
	  user.setPhonenumber("13967705305");
	  // 保存
	  session.save(user);
	  // 提交事务
	  transaction.commit();
	  // 关闭Session，释放资源
	  session.close();
	  factory.close();

  }
}
