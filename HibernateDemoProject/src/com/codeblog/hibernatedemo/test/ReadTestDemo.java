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

public class ReadTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = (Query) session.createQuery(" from user");
		List<User> users = query.getResultList();

		for (User user2 : users) {
			System.out.println(user2.getEmail());
		}

		session.saveOrUpdate(users);
		session.beginTransaction();

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
