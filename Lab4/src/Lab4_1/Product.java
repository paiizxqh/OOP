package Lab4_1;
public class Product {
	private String name[] = new String[5];
	private int code[] = new int[5];
	private double price[] = new double[5];

	public Product(){

	}

    public String getName(int i) {
        return name[i];
    }

    public void setName(String name[],int i) {
        this.name[i] = name[i];
    }

    public int getCode(int i) {
        return code[i];
    }

    public void setCode(int code[],int i) {
        this.code[i] = code[i];
    }

    public double getPrice(int i) {
        return price[i];
    }

    public void setPrice(double price[],int i) {
        this.price[i] = price[i];
    }

	public static void main(String[] args) {
		

	}
}
