package Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p623_ComboActionEx extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon[] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public p623_ComboActionEx() {
		setTitle("ComboActionEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
			
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p623_ComboActionEx();
	}
}