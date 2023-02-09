import javax.swing.*;

public class RectangleDemo1 {

	public static void main(String[] args) {
		double width  = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double length  = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));
		String color  = JOptionPane.showInputDialog("Input color:");
		
		Rectangle rectangle = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rectangle+"\nArea of Rectangle is"+rectangle.getArea());
	}

}
