package com.speridian.springMVC.validation;

import java.io.Serializable;

//import java.util.List;

public class Response<T> implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5680424286291574107L;

	private String code, message;
	// private T data;
	// private List<T> items;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}