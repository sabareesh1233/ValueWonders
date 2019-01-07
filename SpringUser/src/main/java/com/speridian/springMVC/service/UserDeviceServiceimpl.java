package com.speridian.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.speridian.springMVC.dao.UserDeviceDao;
import com.speridian.springMVC.model.User;
import com.speridian.springMVC.model.UserDevice;

@Service
public class UserDeviceServiceimpl implements UserDeviceService {

	@Autowired
	UserDeviceDao userdevicedao;

	public List<UserDevice> listOfUserDevice() {

		return userdevicedao.listOfUserDevice();
	}

	@Override
	public UserDevice getUserdevice(int userid) {

		return userdevicedao.getUserDevice(userid);
	}

	public void deleteUserDevice(int userid) {
		userdevicedao.deleteUserDevice(userid);
	}

	public void saveUserDevice(UserDevice userdevice) {
		userdevicedao.saveUserDevice(userdevice);
	}

	@Override
	public User get(int userid) {

		return null;
	}

	@Override
	public void updateUserDevice(UserDevice userdevice) {
		// TODO Auto-generated method stub
		userdevicedao.updateUserDevice(userdevice);
		
	}

}
