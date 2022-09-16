package Lab6_2;

public class Product {
	
	protected String name;
	protected String unit;
	protected int price;
	protected int weight;
	protected int volumn;
	protected int amount;
	
	public Product(String name, String unit, int price,int amount){
		this.name = name;
		this.unit = unit;
		this.price = price;
		this.amount = amount;
	}
	
	public Product(int price) {
		this.price = price;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	public int getVolumn(){
		return volumn;
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if((((Product) otherObj).name == this.name)) {
			return true;
		}
		else {
			return false;
		}
	}

	//Getter
	public String getName(){
		return name;
	}
	public String getUnit(){
		return unit;
	}
	public int getPrice(){
		return price;
	}
	public int getAmount(){
		return amount;
	}
	
	//Setter
	public void setName(String name){
		this.name = name;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
}