package Lab12;

import java.util.*;

public class Main {

	public static void main(String[] args) {
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
			Amount = Amount + i.Total();
		}	
		System.out.println("Total $ Amount in Cart: $"+Amount);
	}

}
