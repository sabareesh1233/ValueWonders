package com.speridian.springMVC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.speridian.springMVC.mapper.UserMapper;
import com.speridian.springMVC.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	UserMapper userMapper;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public List<User> listOfUser() {

		return userMapper.listOfUser();
	}

	public User getUser(int id) {

		return userMapper.getUser(id);
	}

	@Override
	public void saveUser(User user) {

		userMapper.saveUser(user);
	}

	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}

}