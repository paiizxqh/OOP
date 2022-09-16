package Lab2_2;

import java.text.DecimalFormat;

public class Lab2_2 {

	public static void main(String[] args) {
		final int SIZE = 5;

		int[][] grid = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				grid[i][j] = i * SIZE + j + 1;
				System.out.print(grid[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				grid[i][j] = i * SIZE + j + 1;
				System.out.print(grid[j][i] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		int j = 0;
		for (int i = 0; i < SIZE; i++) {
			if (i % 2 != 0) {
				for (j = SIZE - 1; j >= 0; j--) {
					System.out.print(grid[i][j] + "\t");
				}
			} else {
				for (j = 0; j < SIZE; j++) {
					System.out.print(grid[i][j] + "\t");
				}
			}
			System.out.print("\n");
		}
	}
}