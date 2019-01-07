package com.speridian.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.speridian.springMVC.dao.UserDao;
import com.speridian.springMVC.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> listOfUser(User user) {
		return userDao.listOfUser();
	}

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

}
