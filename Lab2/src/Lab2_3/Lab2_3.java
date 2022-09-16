package Lab2_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		int n=0;
		System.out.print("Enter stated day: ");
		Scanner x = new Scanner(System.in);
		int day = x.nextInt();
		System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
		
		for(int i=1; i<day;i++){
			System.out.print("\t");
			n++;
			}
		for(int j=1; j<=31;j++){
			System.out.print(j+"\t");
			n++;
			if(n%7==0){
				System.out.print("\n");
			}
		}
	}
}