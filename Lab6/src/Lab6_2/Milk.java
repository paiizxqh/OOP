package Lab6_2;

public class Milk extends Product {
	
	public Milk(int price) {
		super("Milk","CC",price,1);
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	public int getVolumn() {
		return volumn;
	}
}