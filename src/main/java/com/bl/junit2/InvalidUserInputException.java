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
	public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
        	UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.firstNameValidate("Raja");
            Assert.assertTrue(result);
        } catch (Exception e) { 
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("raja");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
        }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("Baitha");
        Assert.assertTrue(result);
    } catch (Exception e) {
    }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("baitha");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 8709177407");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("7879219494");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
       	UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Rajab23#%");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

}