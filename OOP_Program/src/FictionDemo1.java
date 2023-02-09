import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title: ");
		String title = scan.nextLine();
		System.out.print("Input public year: ");
		int publicYear = scan.nextInt();
		
		FictionBook book = new FictionBook(title, publicYear);
		
		System.out.print("Input author name: ");
		String author_name = scan.next();
		scan.nextLine();
		System.out.print("Input email: ");
		String email = scan.nextLine();
		
		book.setAuthorName(author_name);
		book.setEmail(email);
		
		while (book.checkFormatName()) {
			System.out.print("Input author name, again: ");
			author_name = scan.nextLine();
		}
		
		while (book.checkEmail()) {
			System.out.print("Input email, again: ");
			email = scan.nextLine();
		}
		
		System.out.println(book);
	}

}
