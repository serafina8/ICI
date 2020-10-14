package Ex;

import javax.swing.*;
import java.awt.*;

public class p621_ComboBoxEx extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private String[] names = {"kitae", "jaemoon", "hyosoo", "namyun", "Serafina", "»ï¼øÀÌ"};
	
	public p621_ComboBoxEx() {
		setTitle("ComboBoxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>(); // ºó ÄÞº¸¹Ú½º »ý¼º
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);//ÄÞº¸¹Ú½º¿¡ ¹®ÀÚ¿­ ¾ÆÀÌÅÛ »ðÀÔ
		c.add(nameCombo);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new p621_ComboBoxEx();
	}
}