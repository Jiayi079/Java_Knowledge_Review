package hello;

import java.util.Scanner;

public class average_num_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 让用户输入一系列正整数，
		// 最后输入-1表示输入结束，
		// 最后程序机选出这些数字的平均数，输出输入的数字的个数和平均数
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter any positive numbers you want. "
				+ "\nEnter -1 to stop the program and get the average "
				+ "value of your input numbers!");
		int count = 0;
		int total = 0;
		int[] numbers = new int[100];
		
//		int input_num = input.nextInt();
//		
//		while (input_num != -1) {
//			total = total + input_num;
//          numbers[count] = input_num;
//			count++;
//			input_num = input.nextInt();
//		}
		
		int input_num;
		
		do {
			input_num = input.nextInt();
			if (input_num != -1) {
				total = total + input_num;
				numbers[count] = input_num;
				count++;
			}
		} while (input_num != -1);
		
		if (count > 0) {
			double average = total / count;
			System.out.println("The average value is: " + average);
			System.out.print("All the numbers larger than average value: ");
			for (int i = 0; i < count; i++)
			{
				// print out all the input number which are larger than average value
				if (numbers[i] > average)
				{
					System.out.print(numbers[i] + " ");
				}
			}
		}
		
//		程序中存在的安全隐患：
		
//		1. 数组大小固定：int[] numbers = new int[100]; 这里数组的大小被固定为100。如果输入的数字超过100个，程序将会抛出数组越界异常。这可以通过使用ArrayList等动态数据结构来解决。
//
//		2. 边界值处理：当cnt为0时（即没有输入任何有效的数字），代码将尝试计算average = sum / cnt;，这里会发生除以零的错误，程序会抛出异常。需要添加对cnt是否为0的检查。
//
//		3. 输入终止条件：程序通过x = in.nextInt();从输入中读取整数，直到输入为-1。这意味着-1不能作为有效输入。同时，假定输入总是正确的整数也可能是不安全的，应当增加输入验证。
//
//		4. 效率问题：每次调用in.nextInt()时，程序都假定能正确读取一个整数。在实际应用中，如果输入流中出现非整数数据，可能导致输入错误或异常。此外，对于大量的数据输入，使用数组可能不如使用其他数据结构（如上文提到的ArrayList）效率高。
	}

}
