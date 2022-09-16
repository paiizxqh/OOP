package Lab5;
public class Cashier {
	
	private String name;
	
	public Cashier(String name) {
		this.name = name;
	}

	public void printReceipt(InventoryCart ic){ 
		int length = ic.getAllProduct().length;
		int i,total = 0;
		System.out.println("Pumpkin Shop "+name);
		System.out.print("\n");
		
		for(i=0;i<length;i++){
			if(ic.getProduct(i)!=null){
				System.out.print("1 x "+ic.getProduct(i).getName());
				System.out.print("\t("+ic.getProduct(i).getCode()+")\t");
				System.out.print(ic.getProduct(i).getPrice());
				System.out.print("\n");
				total = ic.getProduct(i).getPrice() + total;
			}
		}
		System.out.println("\t---------------");
		System.out.println("\t\tTotal\t"+total);
	}
}