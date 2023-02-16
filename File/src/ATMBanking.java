import java.io.IOException;
import java.util.Scanner;

public class ATMBanking {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String accountNumber, password;
		int money;
		System.out.print("Enter account number : ");
		accountNumber = console.nextLine();
		while (accountNumber.length() != 14) {
			System.out.print("Input wrong type, Enter account number : ");
			accountNumber = console.nextLine();
		}
		System.out.print("Enter password : ");
		password = console.nextLine();
		while (password.length() != 4) {
			System.out.print("Enter password : ");
			password = console.nextLine();
		}
		System.out.print("Enter money : ");
		money = console.nextInt();
		while (money != 100 && money != 500 && money != 1000) {
			System.out.print("Enter money : ");
			money = console.nextInt();
		}
	}

}
