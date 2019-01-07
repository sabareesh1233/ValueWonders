package com.speridian.springMVC.model;

import java.io.Serializable;

public class UserDevice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long deviceid;

	private int userid;
	private long hardwareid;
	private long manfractureid;
	private String os;
	private long model;

	public UserDevice() {

	}

	public long getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(long deviceid) {
		this.deviceid = deviceid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public long getHardwareid() {
		return hardwareid;
	}

	public void setHardwareid(long hardwareid) {
		this.hardwareid = hardwareid;
	}

	public long getManfractureid() {
		return manfractureid;
	}

	public void setManfractureid(long manfractureid) {
		this.manfractureid = manfractureid;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public long getModel() {
		return model;
	}

	public void setModel(long model) {
		this.model = model;
	}

}
