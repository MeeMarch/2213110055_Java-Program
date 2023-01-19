import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		System.out.print("Input book title   : ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		book.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		book.setPublishyear(scan.nextInt());
		System.out.println();
		System.out.println(book);
	}

}
