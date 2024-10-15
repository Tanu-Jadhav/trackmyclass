package com.trackmyclass.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackmyclass.entity.Student;
import com.trackmyclass.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public String addUser(User user) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(user);
			session.beginTransaction().commit();
			return "Data Added Successfully..!!";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}
