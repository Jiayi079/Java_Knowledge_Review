package hello;

import java.util.Scanner;

public class num_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number you want to reverse: ");
		int input_num = input.nextInt();
		int output_result = 0;
		int split;
		
		System.out.print("Here's the result: ");
		
//		// while loop
//		// using split to printout each number each time of the loop
//		while (input_num != 0) 
//		{
//			split = input_num % 10;
//			System.out.print(split);
//			input_num = input_num / 10;
//		}
		
		
		// do-while loop
		// using calculation to get the reverse number
		do {
			split = input_num % 10;
			input_num = input_num / 10;
			output_result = output_result * 10 + split;
			
		} while (input_num != 0);
		
		System.out.println(output_result);
	}

}
