package com.bl.junitprogram;

import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Raja
 *
 */
public class UserRegistration {
	public boolean validateEmail(String email) {
		return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
	}
}