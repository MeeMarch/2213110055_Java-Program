import java.util.*;

public class MovieDemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input movie id   : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name : ");
		String movieName = scan.nextLine();
		System.out.println();

		System.out.print("Input director name   : ");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String email = scan.nextLine();
		System.out.print("Input director gender : ");
		char gender = scan.next().toLowerCase().charAt(0);
		while (gender!='m'&&gender!='f') {
			System.out.print("Input director gender, again : ");
			gender = scan.next().charAt(0);
		}

		System.out.println();
		System.out.print("Input movie theater no.  : ");
		int theaterNo = scan.nextInt();
		while (theaterNo <= 0 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}

		System.out.println();
		Theater theater = new Theater(movieId,movieName,new Director(directorName, email,gender),theaterNo);
		System.out.println(theater);
}
}
