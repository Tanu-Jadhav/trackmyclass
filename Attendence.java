package com.trackmyclass.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "attendence")
public class Attendence {
	@Id
	private String id;
	
	private String date;
	private String time;
	private int counts;
		
	@ManyToOne
	@JoinColumn(name="username")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="subject")
	private Subject subject;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="attendence_student" , joinColumns = @JoinColumn(name="aid"),inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> student;

	
}
