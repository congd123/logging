package com.ddss.logging;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Logging {

	/**
	 * Logging in debug mode
	 */
	int DEBUG = 0;
	
	/**
	 * Logging in info mode
	 */
	int INFO = 1;
	
	/**
	 * Level of logging 
	 */
	int value() default Logging.INFO;
}
