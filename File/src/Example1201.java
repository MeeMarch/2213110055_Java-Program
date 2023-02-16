import java.io.*;
import java.util.*;

public class Example1201 {

	public static void main(String[] args) throws IOException{
		//read data from file by Scanner class
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while(read.hasNext()) {
			String name = read.next();
			read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(name+" ("+email+")");
		}
		read.close();
	}

}
