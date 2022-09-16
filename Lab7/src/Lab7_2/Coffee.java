package Lab7_2;

public class Coffee extends Product{
	
	public Coffee(int price) {
		super(price);
	}
	public String toString(){
		return this.getClass().getSimpleName();
	}
}