package Lab7_1;

public class Main {
	
	public static void TestBall(Ball t,double volume){
		t.show();
		t.inflate(volume);
		((RollAble)t).roll();
	}
	
	public static void main(String[] args){
		BallA a = new BallA("Zentia");
		TestBall(a,1);
		BallB b = new BallB("Zappire");
		TestBall(b,1.1);
		BallC c = new BallC("Zenith");
		TestBall(c,1.2);
	}
}