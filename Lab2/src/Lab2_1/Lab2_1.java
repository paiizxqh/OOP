package Lab2_1;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab2_1 {

	public static void main(String[] args) {
		System.out.print("Please input the number : ");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int y = a;
		int x;
		int sum = 0;
		
		System.out.print(y + " = ");
		
		while(a>=10){
			x = a % 10;
			System.out.print(x + " + ");
			a = a / 10;
			sum = sum + x;
			}
		System.out.print(a);
		sum = sum+a;
		System.out.print(" = "+sum);
	}
}