package Ex13;

import java.awt.*;
import javax.swing.*;

public class Ex13_10 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 4");
			
			this.setLayout(new FlowLayout());
			
			String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지",
					"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
			JList list = new JList(pet);
			JScrollPane sp = new JScrollPane(list);
			Dimension d = list.getPreferredSize();
			d.width = 100;
			d.height = 200;
			sp.setPreferredSize(d);
			this.add(sp);
			
			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			setSize(300, 300);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
