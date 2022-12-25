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

}
