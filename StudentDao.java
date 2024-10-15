package com.trackmyclass.dao;

import java.util.List;

import com.trackmyclass.entity.Student;

public interface StudentDao {
	public String addStudent(Student student);

	public Student getStudentByRollNo(long rollNo);

	public String deleteStudent(long rollNo);

	public String updateStudent(Student student);

	public List<Student> getAllStudent();
	
	public List<Student> getAllStudentByRoll(List<Long> list);

	

}
