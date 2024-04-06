package que4;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 1, 90, 34, 89, 7, 9 };
		int n = arr.length;

		Arrays.sort(arr);

		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = n - 1; i >= n / 2; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}