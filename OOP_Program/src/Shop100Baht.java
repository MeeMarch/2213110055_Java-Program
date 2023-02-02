import javax.swing.*;

public class Shop100Baht {
	public static void main(String[] args) {
		Product arnupab = new Product();
		int button = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?",null,JOptionPane.YES_NO_OPTION);

		if (button == 0) {
			arnupab = new PattanakarnBranch();
		}

		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, arnupab);
	}

}
