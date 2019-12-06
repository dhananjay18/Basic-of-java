package com.codeblog.hibernatedemo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.codeblog.hibernatedemo.domain.User;

public class InsertTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setId(101);
		user.setName("abhi");
		user.setEmail("wankhede@gmail.com");
		
		User user1=new User();
		user1.setId(102);
		user1.setName("ramesh");
		user1.setEmail("ramesh@gmail.com");

	   	SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		
		session.beginTransaction();

		session.save(user);
		session.save(user1);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		
	}

}
