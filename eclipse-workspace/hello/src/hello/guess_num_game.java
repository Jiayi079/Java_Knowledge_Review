package hello;

import java.util.Scanner;

public class guess_num_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 让计算机来想一个数，然后让用户来猜。
		// 用户每输入一个数，就告诉他是大了还是小了，
		// 知道用户猜中位置，最后还要告知用户他菜了多少次
		
		Scanner input = new Scanner(System.in);

		int num = (int)(Math.random() * 100 + 1); 	// random number [0,1) -> [0,100) -> [1, 100]
		int user_input;
		int count = 0;
		
		System.out.print("Please guess a number around 1 to 100: ");
		
		
		// while loop
//		user_input = input.nextInt();
//		
//		while (user_input != num)
//		{
//			count++;
//			if (user_input > num) {
//				System.out.println("The number you entered is larger.");
//			} else {
//				System.out.println("The number you entered is smaller");
//			}
//			System.out.print("Please re-entered again: ");
//			user_input = input.nextInt();
//		}
		
		
		// do-while
		do {
			user_input = input.nextInt();
			count++;
			if (user_input > num) {
				System.out.println("The number you entered is larger.");
				System.out.print("Please re-entered again: ");
			} else if (user_input < num) {
				System.out.println("The number you entered is smaller");
				System.out.print("Please re-entered again: ");
			}
		} while (user_input != num);
		
		System.out.println("Congrads! You get it!");
		System.out.println("The correct number: " + num
				+ "\nYou total guess " + count + " times!");
	}

}
