package Lab7_2;

public class Milk extends Product {
	private int volumn;
	
	public Milk(int price) {
		super(price);
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public String toString(){
		return this.getClass().getSimpleName();
	}
}