package com.speridian.springMVC.dao;

import java.util.List;

import com.speridian.springMVC.model.User;

public interface UserDao {

	public List<User> listOfUser();

	public User getUser(int id);

	public void saveUser(User user);

	public void deleteUser(int id);

	public void updateUser(User user);

}
