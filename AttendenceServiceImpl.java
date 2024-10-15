package com.trackmyclass.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackmyclass.dao.AttendenceDao;
import com.trackmyclass.entity.Attendence;
import com.trackmyclass.model.AttendanceDto;

@Service
public class AttendenceServiceImpl implements AttendenceService {

	@Autowired
	private StudentService studentService;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private UserService userService;
	@Autowired
	private AttendenceDao attendenceDao;
	
	@Override
	public String takeAttendence(AttendanceDto dto) {
		String id = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		dto.setId(id);
		
		Attendence attendence=new Attendence();
		attendence.setId(id);
		attendence.setDate(attendence.getDate());
		attendence.setTime(attendence.getTime());
		attendence.setCounts(attendence.getCounts());

		attendence.setSubject(subjectService.getSubjectById(dto.getSubjectId()));
		attendence.setUser(userService.getUserByUserName(dto.getUsername()));
		attendence.setStudent(studentService.getAllStudentByRoll(dto.getRollNos()));
	
		return attendenceDao.takeAttendence(attendence);
	}

}
