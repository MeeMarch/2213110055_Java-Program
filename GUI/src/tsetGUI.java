import java.awt.*;
import javax.swing.*;

public class tsetGUI extends JFrame{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//components
	private JLabel lblLenght,lblWidth,lblArea,lblPerimeter;
	//private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	public tsetGUI() {
		
		//Properties for Components
		lblLenght = new JLabel("Enter the length:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);
		//TextFields
		/*txtLength = new JTextField(10);
		txtWidth = new JTextField(10);
		txtArea = new JTextField(10);
		txtPerimeter = new JTextField(10);*/
		
		GridLayout L = new GridLayout(4,2);
		setLayout(L);
		add(lblLenght);
		//add(txtLength);
		add(lblWidth);
		//add(txtWidth);
		add(lblArea);
		//add(txtArea);
		add(lblPerimeter);
		//add(txtPerimeter);
		
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		tsetGUI test = new tsetGUI();

	}

}
