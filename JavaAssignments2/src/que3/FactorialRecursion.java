package que3;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int n = scanner.nextInt();

		if (n < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			long factorial = calculateFactorial(n);
			System.out.println("Factorial of " + n + " is: " + factorial);
		}

		scanner.close();
	}

	public static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);

		}

	}
}
