package que7;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotateMatrixClockwise(matrix);

		System.out.println("\nMatrix after rotating by 90 degrees in clockwise direction:");
		printMatrix(matrix);
	}

	public static void rotateMatrixClockwise(int[][] matrix) {
		transpose(matrix);
		reverseRows(matrix);
	}

	public static void transpose(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void reverseRows(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));

		}

	}
}
