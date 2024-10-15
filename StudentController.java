package com.trackmyclass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackmyclass.entity.Student;
import com.trackmyclass.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
@GetMapping("/get-all-students")
public List<Student> getAllStudent(){
	return null;
	
}
@PostMapping("/add-student")
public String addStudent(@RequestBody Student student) {
	String msg = service.addStudent(student);
	return msg;
	
}
@GetMapping("/get-student-by-rollNo/{rollNo}")
public Student getStudent(@PathVariable long rollNo) {
	return null;
	
}
@DeleteMapping("/delete-student/{rollNo}")
public String deleteStudent(@PathVariable long rollNo) {
	String msg = service.deleteStudent(rollNo);
	return msg;
	
}

@PutMapping("/update-student")
public String updateStudent(@RequestBody Student student) {
	String msg = service.updateStudent(student);
	return msg;
	
		
}
}
