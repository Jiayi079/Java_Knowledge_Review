package hello;

public class while_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check the count difference between while loop and do-while loop
		
		// while loop
		System.out.println("count 1: ");
		int count1 = 3;
		while (count1 >= 0) {
			System.out.println(count1);
			count1 = count1 - 1;
		}
		System.out.println("count 1 value outside the loop: " + count1);
		
		
		System.out.println("count 2: ");
		int count2 = 3;
		while (count2 >= 0) {
			count2 = count2 - 1;
			System.out.println(count2);
		}
		System.out.println("count 2 value outside the loop: " + count2);
		
		
		System.out.println("count 3: ");
		int count3 = 3;
		do {
			count3 = count3 - 1;
			System.out.println(count3);
		} while (count3 >= 0);
		
		System.out.println("count 3 value outside the loop: " + count3);
		
		
		System.out.println("count 4: ");
		int count4 = 3;
		do {
			System.out.println(count4);
			count4 = count4 - 1;
		} while (count4 >= 0);
		
		System.out.println("count 4 value outside the loop: " + count4);
		
	}
}
