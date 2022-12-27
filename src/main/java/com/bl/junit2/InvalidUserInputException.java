package com.bl.junit2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Raja
 *
 */
public class InvalidUserInputException extends Exception {
	
	@Test
	public void givenFirstNameWhenProperShouldReturnTrue() {
        try {
        	UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.firstNameValidate("Raja");
            Assert.assertTrue(result);
        } catch (Exception e) { 
        }
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("raja");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
        }

    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("Baitha");
        Assert.assertTrue(result);
    } catch (Exception e) {
    }
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("baitha");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
    }

    @Test
    public void givenEmailWhenProperShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmailWhenNotProperShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhoneWhenProperShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 8709177407");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhoneWhenNotProperShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("7879219494");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPasswordWhenProperShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPasswordWhenNotProperShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Rajab23#%");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

}