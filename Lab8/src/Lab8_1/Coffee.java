package Lab8_1;

public class Coffee extends Product{
	
	public Coffee(int price) {
		super(price);
	}
	public String toString(){
		return this.getClass().getSimpleName();
	}
}