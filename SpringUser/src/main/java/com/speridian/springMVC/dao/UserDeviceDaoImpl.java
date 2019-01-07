package com.speridian.springMVC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.speridian.springMVC.mapper.UserDeviceMapper;
import com.speridian.springMVC.model.UserDevice;

@Repository
public class UserDeviceDaoImpl implements UserDeviceDao {

	@Autowired
	UserDeviceMapper userdevicemapper;

	public List<UserDevice> listOfUserDevice() {
		return userdevicemapper.listOfUserDevice();
	}

	@Override
	public UserDevice getUserDevice(int userid) {
		// TODO Auto-generated method stub
		return userdevicemapper.getUserDevice(userid);
	}

	public void saveUserDevice(UserDevice userdevice) {
		userdevicemapper.saveUserDevice(userdevice);
	}

	@Override
	public void deleteUserDevice(int userid) {
		userdevicemapper.deleteUserDevice(userid);
	}

	@Override
	public void updateUserDevice(UserDevice userdevice) {
		// TODO Auto-generated method stub
		userdevicemapper.updateUserDevice(userdevice);

	}

}