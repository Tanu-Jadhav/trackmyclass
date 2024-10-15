package com.trackmyclass.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackmyclass.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public String addStudent(Student student) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(student);
			session.beginTransaction().commit();
			return "Data Added Successfully..!!";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public Student getStudentByRollNo(long rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(long rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudentByRoll(List<Long> list) {
		Session session = null;
		List<Student> studentList=null;
		try {
			session = factory.openSession();
			studentList = session.byMultipleIds(Student.class).multiLoad(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return studentList;
	}

}
