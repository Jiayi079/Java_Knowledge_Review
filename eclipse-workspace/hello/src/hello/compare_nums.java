package hello;

import java.util.Scanner;

public class compare_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input two number to compare them!");
		System.out.print("a = ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		System.out.print("c = ");
		int c = input.nextInt();
		int max;
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		
		System.out.print("Maximum number is: " + max);
	}

}
