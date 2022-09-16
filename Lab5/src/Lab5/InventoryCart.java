package Lab5;
public class InventoryCart {
	
	private Product[] productArr;
	private int productIndex = 0;
	
	public void addProduct(Product num){
		productArr[productIndex++] = num;
	}
	public InventoryCart(int a){
		productArr = new Product[a];
	}
	public Product getProduct(int index) {
		return productArr[index];
	}
	public Product[] getAllProduct() {
		return productArr;
	}

}