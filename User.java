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
public class User {
	
	@Id
	private String userName;
	private String password;
	private String emails;
	private String mobile;
	private String firstName;
	private String lastName;
	
	
}
