package com.trackmyclass.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {
	@Id
	private long rollNo;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String gender;
	private String dateOfBirth;
	private String address;
	private String studentId;
	private String department;
	private String className;
	
	
	
	
}
