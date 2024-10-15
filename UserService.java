package com.trackmyclass.service;

import com.trackmyclass.entity.User;

public interface UserService {

	public String addUser(User user);

	public User getUserByUserName(String uname);

	public String deleteUser(String uname);

	public String updateUser(User user);

	

}
