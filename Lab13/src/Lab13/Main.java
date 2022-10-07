package Lab13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/OOP_6420503795/Lab13/sell.txt");
		FileWriter fw = new FileWriter(file);
		
		ArrayList<Item> arrItem = new ArrayList<Item>();
		char shopping;
		
		do{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the item: ");
		String name = input.nextLine();
		System.out.print("Enter the unit price: ");
		double price = input.nextDouble();
		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();
		System.out.print("Continue shopping (y/n)? ");
		shopping = input.next().charAt(0);
		arrItem.add(new Item(name,price,quantity));
		}while(shopping!='n');
	
		System.out.println("Final shopping Cart totals");
		double Amount=0;
		for(Item i : arrItem){
			System.out.println(i.getName()+"\t$"+i.getPrice()+"\t"+i.getQuantity()+"\t$"+i.Total());
			String text = i.getName()+","+i.getPrice()+","+i.getQuantity()+"\n";
			fw.write(text);
			Amount = Amount + i.Total();
		}
		fw.close();
		System.out.println("Total $ Amount in Cart: $"+Amount);
	}

}
