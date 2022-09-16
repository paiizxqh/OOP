package Lab3_1;

public class TestBox {
	
	public static void resizeBox(Box b,int fold){
		b.width = b.width*fold;
		b.height = b.height*fold;
		b.depth = b.depth*fold;
		
	}

	public static void main(String[] args) {
		Box box1 = new Box(3,4,5);
		resizeBox(box1,2);
		//System.out.println(box1);
		System.out.println(box1.getVolume());
	}
}