package Lab7_2;

public class Sugar extends Product{

	public Sugar(int price) {
		super(price);
	}
	public String toString(){
		return this.getClass().getSimpleName();
	}
}