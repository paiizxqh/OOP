package Lab7_2;

public class InventoryCart {
	private Product[] productArr;
	private static int index = 0;
	
	public InventoryCart(int a){
		productArr = new Product[a];
	}
	public void add(Product w){
		for(int i=0;i<index;i++) {
			if(w.getClass().getSimpleName().equals(productArr[i].getClass().getSimpleName())) {
				w.addQuantt();
				this.remove(i);
				}
			}
		productArr[index++] = w;
	}
	public void remove(int k) {
		for(int i=k;i<index;i++) {
			this.productArr[i] = this.productArr[i+1];
		}
		index--;
	}
	
	//Getter & Setter
	public Product getProduct(int index) {
		return productArr[index];
	}
	public Product[] getAllProduct() {
		return productArr;
	}
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		InventoryCart.index = index;
	}
}