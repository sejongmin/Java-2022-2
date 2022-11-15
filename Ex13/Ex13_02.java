package Ex13;

import javax.swing.*;
import java.awt.*;

public class Ex13_02 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");
			
			this.setLayout(new FlowLayout());
			
			JButton bt1 = new JButton("버튼1");
			this.add(new JButton("버튼1"));
			
			JButton bt2 = new JButton("버튼2");
			this.add(new JButton("버튼2"));
			
			JButton bt3 = new JButton("버튼3");
			this.add(new JButton("버튼3"));
			
			JButton bt4 = new JButton("버튼4");
			this.add(new JButton("버튼4"));
			
			JButton bt5 = new JButton("버튼5");
			this.add(new JButton("버튼5"));
			
			setSize(256, 256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
