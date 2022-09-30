package Lab12;

import java.util.ArrayList;

public class Item {
	private String name;
	private double price;
	private int quantity;
	
	public Item(String name,double price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public double Total(){
		double total = price * quantity;
		return total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
