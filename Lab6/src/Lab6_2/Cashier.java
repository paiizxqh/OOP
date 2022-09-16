package Lab6_2;

public class Cashier {

	private String name;

	public Cashier(String name) {
		this.name = name;
	}
	
	public void printReceipt(InventoryCart ic) {
		int i = 0, total = 0;
		String chk = "CC";
		
		System.out.println("-----------------------\n");
		System.out.println("Pumpkin Shop (" + name + ")");
		System.out.print("\n");
		
		while (ic.getAllProduct()[i] != null) {
			int count = ic.getProduct(i).getAmount();
			int weight = ic.getProduct(i).getWeight();
			int price = ic.getProduct(i).getPrice();
			String name = ic.getProduct(i).getName();
			String unit = ic.getProduct(i).getUnit();
			
			if (ic.getProduct(i).getUnit().equals(chk)) {
				Milk milk = (Milk) ic.getProduct(i);
				System.out.println(count + " x " + name + "\t" + milk.getVolumn() + " " + unit + "  " + price);
			} else {
				System.out.println(count + " x " + name + "\t" + weight + " " + unit + "  " + price);
			}
			total += ic.getProduct(i).getPrice();
			i++;
		}
		System.out.println("-----------------------");
		System.out.println("    Total\t" + total + " $");
	}
}