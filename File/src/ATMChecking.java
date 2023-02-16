import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATMChecking extends ATMData {
	private int money;
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws FileNotFoundException {
		Scanner in = new Scanner(new File("ATMBookBank.txt"));
		boolean check = false;
		while (in.hasNext()) {
			String id = in.next();
			String pass = in.next();
			int balance = in.nextInt();
			if (id == getID() && pass == getPass() && balance <= money) {
				check = true;
				break;
			}
		}
		return check;
	}

	public void show() throws IOException {
		if (checkBookBank()==true) {
			System.out.println("\nYou drawing for " + frm.format(money) + ", get");
			int thousand = money / 1000;
			money %= 1000;
			System.out.println("\n1000 = " + thousand);
			int fiveHundred = money / 500;
			money %= 500;
			System.out.println("\n500 = " + fiveHundred);
			int hundred = money / 100;
			money %= 100;
			System.out.println("\n100 = " + hundred);
			int balance = - this.money;
			System.out.println("\nYou balance is " + frm.format(balance) + "Baht.");
		}
		else {
			System.out.println("\nSorry, your id or password is wrong, or your amount not enough");
		}
	}
}
