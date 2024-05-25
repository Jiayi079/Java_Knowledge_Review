package hello;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// explanation:
		// user input 1 -> will go through case 1 and case 2 then stop
		// user input 2 -> will go through case 2 then stop
		// user input 3 -> will go through case 3 and case 4 then stop
		// user input 4 -> will go through case 4 then stop
		// user input any of other nums -> will go through "default" part then stop
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number: ");
		int type = input.nextInt();
		
		switch(type) {
		case 1:										// case 1 has nothing
		case 2: 
			System.out.println("Hello!");			// case 2 having break statement
			break;
		case 3: 
			System.out.println("Good Evening!");	// case 3 doesn't have break statement
		case 4:
			System.out.println("See yah!");			// case 4 having break statement again
			break;
		default:
			System.out.println("Sorry, what?");		// default part
			break;
		}
	}

}
