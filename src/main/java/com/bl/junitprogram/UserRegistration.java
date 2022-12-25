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
}
