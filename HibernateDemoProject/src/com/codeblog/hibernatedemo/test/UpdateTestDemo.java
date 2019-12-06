package com.codeblog.hibernatedemo.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

import com.codeblog.hibernatedemo.domain.User;

public class UpdateTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();


		User user = (User) session.get(User.class, 1);
		user.setEmail("Pawar@gmail.com");
		session.update(user);
		
		session.beginTransaction();

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
