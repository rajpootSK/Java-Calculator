package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Calculator1 {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 window = new Calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(102, 51, 0));
		frame.getContentPane().setBackground(new Color(102, 0, 51));
		frame.setBounds(100, 100, 379, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(23, 11, 322, 55);
		textField.setBackground(new Color(255, 255, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBounds(23, 77, 82, 59);
		btnBackspace.setForeground(new Color(0, 0, 0));
		btnBackspace.setBackground(new Color(0, 0, 255));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(109, 77, 82, 59);
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setBackground(new Color(0, 0, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(265, 77, 76, 59);
		btnPlus.setForeground(new Color(0, 0, 0));
		btnPlus.setBackground(new Color(0, 0, 255));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(190, 77, 76, 59);
		btn00.setForeground(new Color(0, 0, 0));
		btn00.setBackground(new Color(0, 0, 255));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(23, 132, 82, 59);
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(new Color(0, 0, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(23, 192, 82, 59);
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(new Color(0, 0, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(23, 251, 82, 59);
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(0, 0, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(23, 314, 82, 59);
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setBackground(new Color(0, 0, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(109, 132, 82, 59);
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setBackground(new Color(0, 0, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(109, 192, 82, 59);
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(0, 0, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(109, 251, 82, 59);
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setBackground(new Color(0, 0, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(109, 314, 82, 59);
		btnDot.setForeground(new Color(0, 0, 0));
		btnDot.setBackground(new Color(0, 0, 255));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(190, 132, 76, 59);
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setBackground(new Color(0, 0, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(190, 192, 76, 59);
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBackground(new Color(0, 0, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(190, 251, 76, 59);
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBackground(new Color(0, 0, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(190, 314, 76, 59);
		btnEqual.setForeground(new Color(0, 0, 0));
		btnEqual.setBackground(new Color(0, 0, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer ;
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					double result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
							}
				else if(operation=="-") {
					double result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					double result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					double result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="%") {
					double result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(265, 132, 76, 59);
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setBackground(new Color(0, 0, 255));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMul = new JButton("*");
		btnMul.setBounds(265, 192, 76, 59);
		btnMul.setForeground(new Color(0, 0, 0));
		btnMul.setBackground(new Color(0, 0, 255));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
				
				
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(265, 251, 76, 59);
		btnDivide.setForeground(new Color(0, 0, 0));
		btnDivide.setBackground(new Color(0, 0, 255));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(265, 314, 76, 59);
		btnPercent.setForeground(new Color(0, 0, 0));
		btnPercent.setBackground(new Color(0, 0, 255));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btnBackspace);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnPlus);
		frame.getContentPane().add(btn00);
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btnDot);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnEqual);
		frame.getContentPane().add(btnSub);
		frame.getContentPane().add(btnMul);
		frame.getContentPane().add(btnDivide);
		frame.getContentPane().add(btnPercent);
	}
}
