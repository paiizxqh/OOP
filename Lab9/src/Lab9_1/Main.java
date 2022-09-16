package Lab9_1;

public class Main {

	public static void main(String[] args) {
		/*int num[] = { 1, 2, 3, 4 };
		System.out.println(num[5]);
		for (int i : num) {
			System.out.println(i);*/
			
		//Fixed
		try {
		int num[] = { 1, 2, 3, 4 };
		System.out.println(num[5]);
		for (int i : num) {
			System.out.println(i);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index");
		}
	}
}
