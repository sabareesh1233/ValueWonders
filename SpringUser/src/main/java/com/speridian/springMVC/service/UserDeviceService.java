package com.speridian.springMVC.service;

import java.util.List;

import com.speridian.springMVC.model.User;
import com.speridian.springMVC.model.UserDevice;

public interface UserDeviceService {

	public List<UserDevice> listOfUserDevice();

	public UserDevice getUserdevice(int userid);

	public void saveUserDevice(UserDevice userdevice);

	public void deleteUserDevice(int userid);

	public User get(int userid);
	
	public void updateUserDevice(UserDevice userdevice);

}
