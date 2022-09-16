package Lab5;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("XA1101","Milk",150);
		Product p2 = new Product("XA1102","Suger",50);
		Product p3 = new Product("XA1103","Coffee",250);

		InventoryCart ic = new InventoryCart (10);
		ic.addProduct(p1);
		ic.addProduct(p2);
		ic.addProduct(p3);

		Cashier c = new Cashier("John Doe");
		c.printReceipt(ic);
		}
	}