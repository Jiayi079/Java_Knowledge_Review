package hello;

import java.util.Scanner;

public class gcd_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter first number: ");
		int b = input.nextInt();
		
		// solution 1
		int gcd = 1;
		
		for (int i = 1; i <= a && i <= b; i++)
		{
			if (a % i == 0 && b % i == 0)
			{
				gcd = i;
			}
		}
		
		System.out.println("Solution 1: \nThe greatest common divisor for " 
		+ a + " and " + b + " is: " + gcd);
		
		
		//solution 2
		int remainder = 0;
		
		while (b != 0)
		{
			remainder = a % b;
			a = b;
			b = remainder;
		}
		System.out.println("Solution 2: \nThe greatest common divisor is: " 
		+ a);

	}

}
