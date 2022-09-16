package Lab7_2;

public class Product {
	protected int price;
	protected int weight;
	protected int Quantt=1;
	
	public Product(int price) {
		this.price = price;
	}

	//Getter & Setter
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getQuantt() {
		return Quantt;
	}
	public void addQuantt() {
		this.Quantt = this.Quantt + 1;
	} 
}