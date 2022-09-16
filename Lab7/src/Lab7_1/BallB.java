package Lab7_1;

public class BallB extends BallA{

	public BallB(String A) {
		super(A);
	}
	
	public void roll() {
		System.out.println(this.getTradeMark()+" rolls smoothly.");
	}
	
	public void show(){
		System.out.println(this.getTradeMark()+" is a trademark of "+getClass().getSimpleName()+".");
	}
}