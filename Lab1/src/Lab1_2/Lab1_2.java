package Lab1_2;

import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		System.out.print("Enter triangle side: ");
		double a = sd.nextDouble();

		Scanner sp = new Scanner(System.in);
		System.out.print("Enter prism length: ");
		double b = sp.nextDouble();

		double result = (2 * ((Math.sqrt(3) / 4) * a * a) + ((a + a + a) * b));
		System.out.print("Surface area of prism is: ");
		System.out.print(result);
	}
}