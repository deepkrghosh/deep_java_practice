package deep_practice_package;

import java.util.Scanner;

public class AdditionWithInputsFromUser {
	
//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		int num3 = num1 + num2;
		System.out.println("Sum of 2 numbers are: " + num3);
		
	}

}
