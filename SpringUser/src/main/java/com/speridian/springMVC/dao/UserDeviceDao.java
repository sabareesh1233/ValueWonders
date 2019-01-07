package com.speridian.springMVC.dao;

import java.util.List;

import com.speridian.springMVC.model.UserDevice;

public interface UserDeviceDao {

	public List<UserDevice> listOfUserDevice();

	public UserDevice getUserDevice(int userid);

	public void saveUserDevice(UserDevice userdevice);

	public void deleteUserDevice(int userid);
	
	public void updateUserDevice(UserDevice userdevice);

}
