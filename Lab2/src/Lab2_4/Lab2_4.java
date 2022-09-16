package Lab2_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2_4 {
	public static void main(String[] args) {
		System.out.print("Enter sentence: ");
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		s = s.replace("happy","happy :)");
		s = s.replace("sad","sad :(");
		System.out.print(s);
	}
}