package que2;

import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		
		int sum = calculateSumOfDigits(number);

		
		if (number % sum == 0) {
			System.out.println(number + " is a Harshad number.");
		} else {
			System.out.println(number + " is not a Harshad number.");
		}

		scanner.close();
	}

	
	public static int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;

	}

}
