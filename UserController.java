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

import com.trackmyclass.entity.User;
import com.trackmyclass.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	@GetMapping("/get-all-users")
	public List<User>getUser(){
		return null;
	}
@PostMapping("/add-user")
public String addUser(@RequestBody User user) {
	String msg =service.addUser(user);
	return msg;
	
}
@GetMapping("/get-user-by-username/{uname}")
public User getUserName(@PathVariable String uname ) {
	User user = service.getUserByUserName(uname);
	return user; 
}
@DeleteMapping("delete-user/{uname}")
public String deleteUser(@PathVariable String uname) {
	String msg = service.deleteUser(uname);
	return uname;
}
@PutMapping("/update-user")
public String updateUser(@RequestBody User user) {
	String msg =service.updateUser(user);
	return null;
	
}
}
