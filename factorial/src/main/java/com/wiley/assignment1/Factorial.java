package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE

		// First, confirms that the next value entered by the user is an integer.
		// This prevents non-integer input, such as letters or decimals, from being accepted.
		if (this.scanner.hasNextInt()) {
			// Store the user's integer input in the instance variable `num`,
			// as required by the assignment instructions.
			this.num = this.scanner.nextInt();

			// Only allows integers from 1 through 10, inclusive.
			// If the number is in that range, return the original input value.
			if (this.num >= 1 && this.num <= 10) {
				return this.num;
			}
		}

		// If the input is not an integer, or if the integer is outside the
		// allowed range, print the required error message and return -1.
		this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		return -1;

		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 
		int result = 1;
		//YOUR CODE STARTS HERE

		// Multiply result by every integer from 1 up to the user's number.
		// Example: if num is 4, this calculates 1 * 2 * 3 * 4.
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();	
	 }

	
}