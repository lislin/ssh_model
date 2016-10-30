package com.lslin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lslin.dao.UserDao;
import com.lslin.entity.User;
import com.lslin.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}
}
