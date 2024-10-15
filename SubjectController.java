

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
import org.springframework.web.bind.annotation.RestController;

import com.trackmyclass.entity.Student;
import com.trackmyclass.entity.Subject;
import com.trackmyclass.service.StudentService;
import com.trackmyclass.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService service;

	@GetMapping("/get-all-student")
	public List<Subject> getAllSubject() {
		return null;

	}

	@PostMapping("/add-subject")
	public String addStudent(@RequestBody Subject subject) {
		String msg = service.addSubject(subject);
		return msg;

	}

	@GetMapping("/get-subject-by-id/{id}")
	public Student getSubjectById(@PathVariable long id) {
		return null;

	}

	@DeleteMapping("/delete-subject/{id}")
	public String deleteSubject(@PathVariable long id) {
		String msg = service.deleteSubject(id);
		return msg;

	}

	
	
	@PutMapping("/update-subject")
	public String updateStudent(@RequestBody Subject subject) {
		String msg = service.updateSubject(subject);
		return msg;

	}

}
