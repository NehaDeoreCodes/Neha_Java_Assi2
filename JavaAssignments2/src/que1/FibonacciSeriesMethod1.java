package que1;

public class FibonacciSeriesMethod1 {

	public static void main(String[] args) {
		 int n = 10; 
	        int a = 0, b = 1, c;
	        
	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;

	}

}
}
