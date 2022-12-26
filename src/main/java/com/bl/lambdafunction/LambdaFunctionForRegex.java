package com.bl.lambdafunction;

import java.util.Scanner;

public class LambdaFunctionForRegex {

	Scanner input = new Scanner(System.in);

	public void lambdaExpression() {
		/**
		 * Taking a Regular Expression for all Parameter
		 */
		String patternFirstName = "[A-Z]{1}+[a-z]{2,20}";
		String patternLastName = "[A-Z]{1}+[a-z]{2,20}";
		String patternEmail = "[a-z]{3,}[.]{1}[a-z]{0,}[@]{1}[a-z]{2,}[.]{1}[co]{2}[.]{1}[in]{0,2}";
		String patternMobileNumber = "[0-9]{1,3}[\\s]{1}[7-9]{1}[0-9]{9}";
		String patternPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{8,20}$";
		/**
		 * Use input for every Parameter
		 */
		System.out.print("Enter first name : ");
		String firstName = input.next();
		System.out.print("Enter last name : ");
		String lastName = input.next();
		System.out.print("Enter email : ");
		String email = input.next();
		System.out.print("Enter password : ");
		String password = input.next();
		System.out.print("Enter mobile number : ");
		String mobileNumber = input.next();

		/**
		 * Lambda function
		 */
		LambdaFunction validFirstName = fistNameValid -> fistNameValid.matches(patternFirstName);
		LambdaFunction validLastName = lastNameValid -> lastNameValid.matches(patternLastName);
		LambdaFunction valid_email = emailValid -> emailValid.matches(patternEmail);
		LambdaFunction validMobileNumber = mobileNumberValid -> mobileNumberValid.matches(patternMobileNumber);
		LambdaFunction validPassword = passwordValid -> passwordValid.matches(patternPassword);
		/**
		 * Function interface to return boolean values
		 */
		boolean checkFirstName = validFirstName.validDetails(firstName);
		boolean checkLastName = validLastName.validDetails(lastName);
		boolean check_email = valid_email.validDetails(email);
		boolean checkMobileNumber = validMobileNumber.validDetails(mobileNumber);
		boolean checkPassword = validPassword.validDetails(password);
		/**
		 * To check the all user details provided
		 */
		if (checkFirstName == true) {
			System.out.println(firstName + " is valid first name");
		} else {
			System.out.println(firstName + " is not valid first name");
		}
		if (checkLastName == true) {
			System.out.println(lastName + " is valid last name");
		} else {
			System.out.println(lastName + " is not valid last name");
		}
		if (check_email == true) {
			System.out.println(email + " is valid email");
		} else {
			System.out.println(email + " is not valid email");
		}
		if (checkMobileNumber == true) {
			System.out.println(mobileNumber + " is valid mobile number");
		} else {
			System.out.println(mobileNumber + " is not valid mobile number");
		}
		if (checkPassword == true) {
			System.out.println(password + " is valid password");
		} else {
			System.out.println(password + " is not valid password");
		}
	}

	public static void main(String[] args) {
		LambdaFunctionForRegex lambda = new LambdaFunctionForRegex();
		lambda.lambdaExpression();
	}
}
