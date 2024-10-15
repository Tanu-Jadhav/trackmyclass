package com.trackmyclass.service;

import java.util.List;

import com.trackmyclass.entity.Subject;
import com.trackmyclass.model.AttendanceDto;

public interface SubjectService {

	public String addSubject(Subject subject);

	public String deleteSubject(long id);

	public String updateSubject(Subject subject);

	public Subject getSubjectById(long  id);
	
	public List<Subject> getAllSubject();


}
