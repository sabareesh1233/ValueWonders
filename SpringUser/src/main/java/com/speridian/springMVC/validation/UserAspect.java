package com.speridian.springMVC.validation;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

import com.speridian.springMVC.model.User;
import com.speridian.springMVC.model.UserDevice;

@Aspect
@Component
public class UserAspect {
	@Around(value = "execution(@com.speridian.springMVC.validation.ValidateUser * *(..))")
	public Object verifyUser(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] paramArgs = joinPoint.getArgs();
		Object object = paramArgs[0];
		Response<String> response = new Response<String>();
		if (object instanceof User) {
			User user = (User) object;
			System.out.println(user);
			if (user.getFirstname().isEmpty() || user.getLastname().isEmpty() || user.getEmail().isEmpty()
					|| user.getMobileno().equals("")) {
				response.setCode("100");
				response.setMessage("Invalid request");
				return response;
			}
			Object value = null;
			try {
				value = joinPoint.proceed();
				System.out.println(value);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return value;
		} else if (object instanceof UserDevice) {
			UserDevice userdevice = (UserDevice) object;
			if (userdevice.getHardwareid() == 0 || userdevice.getOs().isEmpty()) {
				response.setCode("100");
				response.setMessage("Invalid Request");
				return response;
			}
			Object value = null;
			try {
				value = joinPoint.proceed();
		
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return value;
		}
		return null;
	}
}
