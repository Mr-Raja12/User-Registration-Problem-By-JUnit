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
		boolean result = userRegistration.mobileNumber("785415451");
		Assert.assertEquals(false, result);
	}

}
