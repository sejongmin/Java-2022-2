package Training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Calculator {
	static class Cal extends JFrame {
		JTextField inputText;
		JTextField outputText;
		ArrayList<String> equation = new ArrayList<String>();
		
		Cal(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("계산기");
			this.setLayout(new BorderLayout());
			
			Container con = getContentPane();
			
			JPanel panel1 = new JPanel();
			String str1 = "수식입력";
			inputText = new JTextField(20);
			JLabel lbl1 = new JLabel(str1);
			
			panel1.add(lbl1);
			panel1.add(inputText);
			panel1.setBackground(Color.gray);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridLayout(4,4,5,5));
			String button_names[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8",
					"9", "CE", "계산", "+", "-", "x", "/" };
			
			JButton buttons[] = new JButton[button_names.length];
			for (int i = 0; i < button_names.length; i++) {
				buttons[i] = new JButton(button_names[i]);
				if (i >= 12) buttons[i].setBackground(Color.blue);
				buttons[i].addActionListener(new PadActionListener());
				buttonPanel.add(buttons[i]);
			}
			
			
			//panel2.setBounds(8, 90, 270, 235);
			JPanel panel2 = new JPanel();
			String str2 = "계산 결과";
			outputText = new JTextField(20);
			JLabel lbl2 = new JLabel(str2);
			
			panel2.add(lbl2);
			panel2.add(outputText);
			panel2.setBackground(Color.yellow);
			
			con.add(panel1, BorderLayout.NORTH);
			con.add(buttonPanel, BorderLayout.CENTER);
			con.add(panel2, BorderLayout.SOUTH);
			
			setSize(300, 300);
			setVisible(true);
		}
		
		class PadActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String operation = e.getActionCommand();
				
				if (operation.equals("CE")) {
					inputText.setText("");
					outputText.setText("");
				} else if (operation.equals("계산")) {
					String result = Double.toString(calculate(inputText.getText()));
					outputText.setText("" + result);
				} 
				else {
					inputText.setText(inputText.getText() + e.getActionCommand());
				}
			}
		}
		
		
		private void fullTextParsing(String text) {
			String num = "";
			equation.clear();
			for (int i = 0; i < text.length(); i++) {
				char ch = text.charAt(i);
				
				if (ch == '+' || ch == '-' || ch == 'x' || ch == '/') {
					equation.add(num);
					num = "";
					equation.add(ch + "");
				} 
				else
					num = num + ch;
			}
			equation.add(num);
		}
		
		public double calculate(String inputText) {
			fullTextParsing(inputText);
			
			double prev = 0;
			double current = 0;
			String mode = "";
			
			//연산자 우선순위 적용
			for (String s : equation) {
				if (s.equals("+")) {
					mode = "add";
				} else if (s.equals("-")) {
					mode = "sub";
				}  
				else if (s.equals("x")) {
					mode = "mul";
				}  
				else if (s.equals("/")) {
					mode = "div";
				}  else {
					current = Double.parseDouble(s);

					if (mode.equals("add")) {
						prev += current;
					} else if (mode.equals("sub")) {
						prev -= current;
					} 
					else if (mode.equals("mul")) {
						prev *= current;
					} 
					else if (mode.equals("div")) {
						prev /= current;
					} else {
						prev = current;
					}
				}
			}
			return prev;
		}
	}
	public static void main(String[] args) {
		new Cal();
	}

}