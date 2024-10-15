package com.trackmyclass.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackmyclass.entity.Attendence;

@Repository
public class AttendenceDaoImpl implements AttendenceDao {
@Autowired
private SessionFactory factory;

	@Override
	public String takeAttendence(Attendence attendence) {
		Session session = null;
		String msg;
		try {
			Session sf = factory.openSession();
			session.save(attendence);
			session.beginTransaction().commit();
			msg="Attendence Submitted..!!";

		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something went wrong during Submit Attendence...";
		} finally {
			session.close();
		}
		return msg;
	}		

}
