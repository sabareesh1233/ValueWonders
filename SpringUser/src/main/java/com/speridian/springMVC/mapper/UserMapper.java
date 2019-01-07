package com.speridian.springMVC.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.speridian.springMVC.model.User;

@Mapper
public interface UserMapper {

	public List<User> listOfUser();

	public User getUser(long id);

	public void saveUser(User user);

	public int deleteUser(int id);

	public void updateUser(User user);

}
