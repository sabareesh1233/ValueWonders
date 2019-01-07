package com.speridian.springMVC.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Documented
public @interface ValidateUser {

	String value() default "";

}
