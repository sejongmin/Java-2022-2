package Ex13;

import java.awt.*;
import javax.swing.*;

public class Ex13_03 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout 연습");
			
			this.setLayout(new BorderLayout(10, 10));
			
			JButton bt1 = new JButton("버튼1");
			this.add(bt1, BorderLayout.NORTH);
			
			JButton bt2 = new JButton("버튼2");
			this.add(bt2, BorderLayout.WEST);
			
			JButton bt3 = new JButton("버튼3");
			this.add(bt3, BorderLayout.CENTER);
			
			JButton bt4 = new JButton("버튼4");
			this.add(bt4, BorderLayout.EAST);
			
			JButton bt5 = new JButton("버튼5");
			this.add(bt5, BorderLayout.SOUTH);
			
			setSize(256, 256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();
	}

}
