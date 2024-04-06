package que6;

import java.util.Scanner;

public class ArrayRotation1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the number of rotations: ");
		int rotations = scanner.nextInt();

		leftRotate(array, rotations);
		System.out.println("Array after left rotation:");
		printArray(array);

		rightRotate(array, rotations);
		System.out.println("Array after right rotation:");
		printArray(array);

		scanner.close();
	}

	public static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	public static void rightRotate(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
