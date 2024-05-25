package hello;

import java.util.Scanner;

public class feet_inches_transfer_to_meters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter you feet and inch: ");
		Scanner input = new Scanner(System.in);
		int feet = input.nextInt();
		int inch = input.nextInt();
		
		System.out.println("Foot = " + feet + ", inch = " + inch);
		System.out.println((int)((feet + inch / 12.0) * 0.3048 *100) + "cm");
	}
}
