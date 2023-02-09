import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Cylinder[] cylinder = new Cylinder[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Input radius " + (i+1) +": ");
			double radius = scan.nextDouble();
			System.out.print("Input height " + (i+1) +": ");
			double height = scan.nextDouble();
			System.out.println();
			cylinder[i] = new Cylinder(radius, height);
		}

		for (int i = 0; i < cylinder.length; i++) {
			System.out.println("Cylinder " + (i + 1) + ", volume=" + cylinder[i].getVolume());
		}
	}
}