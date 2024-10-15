package com.trackmyclass.service;

import java.util.List;

import com.trackmyclass.entity.Student;

public interface StudentService {
	
	public String addStudent(Student student);

	public String deleteStudent(long rollNo);

	public String updateStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentByRollNo(long rollNo);
	
	public List<Student> getAllStudentByRoll(List<Long> list);

}
