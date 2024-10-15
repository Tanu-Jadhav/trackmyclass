package com.trackmyclass.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackmyclass.entity.Subject;
@Repository
public class SubjectDaoImpl implements SubjectDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public String addSubject(Subject subject) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(subject);
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
