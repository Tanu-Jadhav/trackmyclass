package com.trackmyclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackmyclass.dao.UserDao;
import com.trackmyclass.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	@Override
	public String addUser(User user) {
		String msg = dao.addUser(user);
		return msg;
	}



	@Override
	public String deleteUser(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserName(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
