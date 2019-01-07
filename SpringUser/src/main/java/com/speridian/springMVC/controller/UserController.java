
package com.speridian.springMVC.controller;

import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.speridian.springMVC.model.User;
import com.speridian.springMVC.model.UserDevice;
import com.speridian.springMVC.service.UserDeviceService;
import com.speridian.springMVC.service.UserService;
import com.speridian.springMVC.validation.Response;

import com.speridian.springMVC.validation.ValidateUser;

@Controller
@RestController
@Configuration
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);

	@Autowired
	private UserService userservice;

	@Autowired
	private UserDeviceService userdeviceservice;

	@RequestMapping(value = "/list")
	public List<User> listOfUsers(User user) {
		List<User> list = userservice.listOfUser(user);
		return list;
	}

	@RequestMapping(value = "/getuser/{id}")
	public User get(@PathVariable int id) {
		return userservice.getUser(id);
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST, consumes = "application/json")
	@ValidateUser
	public Response<String> saveUser(@RequestBody User user) {
		userservice.saveUser(user);
		Response<String> response = new Response<String>();
		response.setCode("200");
		response.setMessage("OK");
		return response;
	}

	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT, consumes = "application/json")
	@ValidateUser
	public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
		User currentUser = userservice.getUser(id);
		if (currentUser == null) {
			log.info("unable to update the User.user not found with the id{}" + id + "not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		currentUser.setFirstname(user.getFirstname());
		currentUser.setLastname(user.getLastname());
		currentUser.setEmail(user.getEmail());
		currentUser.setMobileno(user.getMobileno());
		userservice.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteUser/{id}")
	public User deleteUser(HttpServletRequest request, @PathVariable("id") int id) {
		userservice.deleteUser(id);
		return new User();
	}

	@RequestMapping(value = "/userdevice/{list}")
	public List<UserDevice> listOfUserDevice() {
		List<UserDevice> listusers = userdeviceservice.listOfUserDevice();
		return listusers;
	}

	@RequestMapping(value = "/getuserdevice/{userid}")
	public UserDevice getUserdevice(@PathVariable int userid) {
		UserDevice userdevice = userdeviceservice.getUserdevice(userid);
		return userdevice;
	}

	@RequestMapping(value = "/saveUserDevice", method = RequestMethod.POST, consumes = "application/json")
	@ValidateUser
	public Response<String> saveUserDevice(HttpServletRequest request, @RequestBody UserDevice userdevice) {
		if (userdevice.getUserid() > 0) {
			User user = userdeviceservice.get(userdevice.getUserid());
			if(user == null) {
				return null;
			}
		}
		userdeviceservice.saveUserDevice(userdevice);
		Response<String> response = new Response<String>();
		response.setCode("200");
		response.setMessage("OK");
		return response;
	}

	@RequestMapping(value = "/updateUserDevice/{userid}", method = RequestMethod.PUT, consumes = "application/json")
	@ValidateUser
	public ResponseEntity<UserDevice> updateUserDevice(@PathVariable int userid, @RequestBody UserDevice userdevice) {
		UserDevice currentUserDevice = userdeviceservice.getUserdevice(userid);
		if (currentUserDevice == null) {
			log.info("unable to update the userdevice. userdevice not found with userid{}" + userid + "not found");
			return new ResponseEntity<UserDevice>(HttpStatus.NOT_FOUND);
		}
		currentUserDevice.setHardwareid(userdevice.getHardwareid());
		currentUserDevice.setManfractureid(userdevice.getManfractureid());
		currentUserDevice.setModel(userdevice.getModel());
		currentUserDevice.setOs(userdevice.getOs());
		userdeviceservice.updateUserDevice(currentUserDevice);
		return new ResponseEntity<UserDevice>(currentUserDevice, HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteUserDevice/{userid}")
	public UserDevice delete(@PathVariable int userid) {
		userdeviceservice.deleteUserDevice(userid);
		return new UserDevice();
	}

}
