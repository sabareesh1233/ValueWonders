package com.speridian.springMVC.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.speridian.springMVC.model.UserDevice;

@Mapper
public interface UserDeviceMapper {

	public List<UserDevice> listOfUserDevice();

	public UserDevice getUserDevice(int userid);

	public void saveUserDevice(UserDevice userdevice);

	public int deleteUserDevice(int userid);

	public void updateUserDevice(UserDevice userdevice);

}
