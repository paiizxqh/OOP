package Lab1_4;

import java.util.Scanner;

public class Lab1_4 {
	public static void main(String[] args) {
		Scanner sx = new Scanner(System.in);
		int x = sx.nextInt();
		int y = sx.nextInt();

		if (x > 0 && y > 0) {
			System.out.print("coordinates(" + x + "," + y + ")= Q1");
		} else if (x < 0 && y > 0) {
			System.out.print("coordinates(" + x + "," + y + ")= Q2");
		} else if (x < 0 && y < 0) {
			System.out.print("coordinates(" + x + "," + y + ")= Q3");
		} else if (x > 0 && y < 0) {
			System.out.print("coordinates(" + x + "," + y + ")= Q4");
		} else if (x != 0 && y == 0) {
			System.out.print("coordinates(" + x + "," + y + ")= x-intercept");
		} else if (y != 0 && x == 0) {
			System.out.print("coordinates(" + x + "," + y + ")= y-intercept");
		} else
			System.out.print("coordinates(" + x + "," + y + ")= origin");
	}
}