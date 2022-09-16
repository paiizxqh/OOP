package Lab3_1;

import java.util.Scanner;

public class Book {
	public String name;
	public int price;
	public int year;
	public String author;

	public static void main(String[] args) {
		Book book1 = new Book();
		/*
		 * Book book2; System.out.println(book2.name);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book name: ");
		book1.name = sc.nextLine();

		System.out.print("Enter Book price: ");
		book1.price = sc.nextInt();

		book1.year = 2542;
		book1.author = "J.K. Rowling";

		System.out.println("Book: " + book1.name);
		System.out.println("Written by " + book1.author + " in " + book1.year);
		System.out.println("Price is " + book1.price + " Baht");

	}
}