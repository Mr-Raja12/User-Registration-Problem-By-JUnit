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
	@Test
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		// create a pattern
		Pattern pattern = Pattern.compile(regex);
		// get a matcher object
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	@Test
	public boolean lastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}

	@Test
	public boolean email(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	@Test
	public boolean mobileNumber(String number) {
		String regex = "^[0-9]{1,3}[ ][6-9][0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}
}