package Lab6_2;

public class InventoryCart {
	
	private Product[] productArr;
	private int index =0;
	
	public InventoryCart(int a){
		productArr = new Product[a];
	}
	
	public void addProduct(Product w){
		int i;
		boolean chk = false;
		if (index >= 1) {
			for (i = 0; i < index; i++) {
				if (productArr[i].equals(w)) {
					chk = true;
					break;
				} 
			}
			if (chk == true) {
				productArr[i].amount += 1;
				productArr[i].price *= productArr[i].amount;
				//System.out.println("rrrr" + i + " " + index);
			} 
			else {
				//System.out.println("r" + i + " " + index);
				productArr[index++] = w;
				
			}
		} else {
			//System.out.println("rr" + index);
			productArr[index++] = w;
			
		}
	}
	public Product getProduct(int index) {
		return productArr[index];
	}

	public Product[] getAllProduct() {
		return productArr;
	}
}