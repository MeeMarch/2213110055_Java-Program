import java.awt.EventQueue;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textNumber1;
	private JTextField textNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNumber1.setBounds(29, 12, 137, 14);
		contentPane.add(lblNumber1);
		
		textNumber1 = new JTextField();
		textNumber1.setBounds(129, 10, 96, 19);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);
		
		JLabel lbNumber2 = new JLabel("Enter Number2");
		lbNumber2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbNumber2.setBounds(29, 47, 90, 19);
		contentPane.add(lbNumber2);
		
		textNumber2 = new JTextField();
		textNumber2.setBounds(129, 47, 96, 19);
		contentPane.add(textNumber2);
		textNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Show Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(281, 197, 100, 25);
		contentPane.add(lblResult);
		
		
		JLabel lbOparator = new JLabel("Oparator");
		lbOparator.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbOparator.setBounds(50, 91, 69, 14);
		contentPane.add(lbOparator);
		
		final JComboBox chOparator = new JComboBox();
		chOparator.setBounds(129, 88, 48, 21);
		chOparator.addItem("+");
		chOparator.addItem("-");
		chOparator.addItem("*");
		chOparator.addItem("/");
		contentPane.add(chOparator);
		
		JLabel lblDigit = new JLabel("How to show Digit");
		lblDigit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDigit.setBounds(29, 129, 116, 13);
		contentPane.add(lblDigit);
		
		final JRadioButton rdbtnOneDigit = new JRadioButton("1 Digit");
		rdbtnOneDigit.setBounds(129, 125, 103, 21);
		contentPane.add(rdbtnOneDigit);
		
		final JRadioButton rdbtnTwoDigit = new JRadioButton("2 Digit");
		rdbtnTwoDigit.setBounds(129, 148, 103, 21);
		contentPane.add(rdbtnTwoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnOneDigit);
		group.add(rdbtnTwoDigit);

		JLabel lblShow = new JLabel("Option to show");
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblShow.setBounds(29, 181, 90, 13);
		contentPane.add(lblShow);
		
		final JCheckBox chckbxShowResult = new JCheckBox("Show Result at Dialogbox");
		chckbxShowResult.setBounds(129, 177, 146, 21);
		contentPane.add(chckbxShowResult);
		
		final JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOK.setBounds(133, 232, 85, 21);
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(textNumber1.getText());
					num2 = Double.parseDouble(textNumber2.getText());
					operator = (String) chOparator.getSelectedItem();
					if(operator.equals("+"))
					sum=num1+num2;
					if(operator.equals("-"))
					sum=num1-num2;
					if(operator.equals("*"))
					sum=num1*num2;
					if(operator.equals("/"))
					sum=num1/num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(rdbtnOneDigit.isSelected()) {
						frmNumber=new DecimalFormat("#,###.0");
					}
					else if(rdbtnTwoDigit.isSelected()) {
						frmNumber=new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(String.format(frmNumber.format(sum)));
					
					//lblResult.setText(String.format("%.2f", sum));
					//JCheckBox
					if(chckbxShowResult.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : "+frmNumber.format(sum));
					}
					
				}
			}
		});
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExit.setBounds(243, 232, 85, 21);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		contentPane.add(btnExit);

	}
}
