package hello;

import java.util.Scanner;

public class counting_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program can return how many digits the user input number have
		// e.g. 
		// user input: 352
		// output: 3 digits
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		int user_input = input.nextInt();
		
		int digit = 0;
		
		// while loop
		while (user_input != 0) 
		{
			user_input = user_input / 10;
			digit++;
		}
		
		System.out.println("This number has " + digit + " digits.");

	}

}
