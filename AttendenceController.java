package com.trackmyclass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trackmyclass.model.AttendanceDto;
import com.trackmyclass.service.AttendenceService;
import com.trackmyclass.service.StudentService;
import com.trackmyclass.service.SubjectService;
import com.trackmyclass.service.UserService;

@RestController
@RequestMapping("/attendence")
public class AttendenceController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private UserService userService;
	@Autowired
	private AttendenceService attendenceService;

	@GetMapping("/get-all-attendence-records")
	public List<AttendanceDto> getAllAttendanceRecord() {
		return null;

	}

	@PostMapping("/take-attendence")
	public String takeAttendence(@RequestBody AttendanceDto dto) {
		String msg = attendenceService.takeAttendence(dto);
		
		return msg;
		
	}

}
