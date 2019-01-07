package com.speridian.springMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.speridian.springMVC.model.User;

@Service
public interface UserService {

	public List<User> listOfUser(User user);

	public User getUser(int id);

	public void saveUser(User user);

	public void deleteUser(int id);

	public void updateUser(User user);

}
