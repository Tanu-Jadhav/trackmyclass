package com.trackmyclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackmyclass.dao.SubjectDao;
import com.trackmyclass.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Override
	public Subject getSubjectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	private SubjectDao dao;

	@Override
	public String addSubject(Subject subject) {
		String msg = dao.addSubject(subject);
		return msg;
	}

	@Override
	public String deleteSubject(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

}
