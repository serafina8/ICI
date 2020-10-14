package Ex;

import javax.swing.*;
import java.awt.*;

public class p616_ListEx extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private  ImageIcon[] images = { new ImageIcon("images/apple.jpg"), 
									new ImageIcon("images/banana.jpg"),
									new ImageIcon("images/cherry.jpg"), 
									new ImageIcon("images/grape.jpg") };				
	public p616_ListEx() {
		setTitle("ListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
				
		setVisible(true);
	}
	public static void main(String[] args) {
		new p616_ListEx();
	}
}