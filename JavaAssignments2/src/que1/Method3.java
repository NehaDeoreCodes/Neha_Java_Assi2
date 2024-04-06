package que1;

public class Method3 {

	public static void main(String[] args) {
		int n = 10;

		int[] fibonacciArray = new int[n];
		fibonacciArray[0] = 0;
		fibonacciArray[1] = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");
		System.out.print(fibonacciArray[0] + " " + fibonacciArray[1] + " ");
		for (int i = 2; i < n; i++) {
			fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
			System.out.print(fibonacciArray[i] + " ");

		}

	}
}
