package Tch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tch_01_ComboListEx_practice extends JFrame {
	public tch_01_ComboListEx_practice() {
		setTitle("ComboListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		add(new CenterPanel(), BorderLayout.CENTER);
		JLabel msg = new JLabel("msg : ");
		
		setVisible(true);
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridBagLayout());
			
		}
	}
	
		
	
	public static void main(String[] args) {
		new tch_01_ComboListEx_practice();
	}
}