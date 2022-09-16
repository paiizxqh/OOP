package Lab7_1;

public class BallC extends BallA{

	public BallC(String A) {
		super(A);
	}
	
	public void roll() {
		System.out.println(this.getTradeMark()+" rolls very smoothly.");
	}
	
	public void show(){
		System.out.println(this.getTradeMark()+" is a trademark of "+getClass().getSimpleName()+".");
	}
}