package hello;

import java.util.Scanner;

public class prime_num {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Please enter the number: ");
//		int input_num = input.nextInt();
		
		System.out.println("1 to 100 prime number: ");
		boolean isPrime = true;
		for (int j = 2; j <= 100; j++) 
		{
			for (int i = 2; i < j; i++) 
			{
				if (j % i == 0) 
				{
//					System.out.println("");
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) 
			{
				System.out.print(j + " ");
			}
			else
			{
				isPrime = true;
			}
		}
		
		
//		if (isPrime) 
//		{
//			System.out.println(input_num + " is a prime number.");
//		}
//		else
//		{
//			System.out.println(input_num + " is not a prime number.");
//		}
		
		
		
		System.out.println("\n50 smallest prime number: ");
		int times = 1;
		isPrime = true;
		
		
		for (int i = 2;;i++)
		{
			if (times > 50)
			{
				break;
			}
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
				
			if (isPrime)
			{
				System.out.print(i + " ");
				times++;
			}
			else
			{
				isPrime = true;
			}
		}
	}
}
