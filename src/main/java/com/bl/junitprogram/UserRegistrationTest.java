package com.bl.junitprogram;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Raja
 *
 */
public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	/*
	 * User need to a valid first name, last name
	 */
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Raja");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("raja");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Baitha");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("baitha");
		Assert.assertEquals(false, result);
	}

	/*
	 * User need to valid email id.
	 */
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("abc&.com");
		Assert.assertEquals(false, result);
	}

	/*
	 * User need to follow Pre-defined mobile format
	 */
	@Test
	public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
		boolean result = userRegistration.mobileNumber("91 8709177407");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.mobileNumber("5647891233");
		Assert.assertEquals(false, result);
	}

	/*
	 * User need to follow Pre-defined password Rule-1 ---> Minimun 8 characters
	 */
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("Qwertyiop");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("qwertyyuuiop");
		Assert.assertEquals(false, result);
	}

	/*
	 * Rule-2 ---> Should have at least 1 upper case
	 */
	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password2("Qwertyu19");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password2("qwerrty");
		Assert.assertEquals(false, result);
	}

	/*
	 * Rule-3 ---> Should have at least 1 numeric number in the password
	 */
	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password3("Raja@123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password3("ar@ba");
		Assert.assertEquals(false, result);
	}

	/*
	 * Rule-4 ---> Has exactly 1 special character
	 */
	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password4("Rajabaitha@1999");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password4("Rajal99");
		Assert.assertEquals(false, result);
	}

	/*
	 * Its should be all email samples provided
	 */
	@Test
	public void givenEmail8_WhenNotProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
		Assert.assertEquals(false, result);
	}

}
