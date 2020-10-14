package Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p632_imageGallery extends JFrame {
	private ImageIcon[] images = {
			new ImageIcon("images/image0.jpg"),
			new ImageIcon("images/image1.jpg"),
			new ImageIcon("images/image2.jpg"),
			new ImageIcon("images/image3.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	
	public p632_imageGallery() {
		setTitle("imageGallery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		
		add(imgLabel, BorderLayout.CENTER);
		add(new SouthPanel(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	ImageIcon []buttons = { new ImageIcon("images/left.png"), new ImageIcon("images/right.png") };
	JButton btnLeft;
	JButton btnRight;
	class SouthPanel extends JPanel {

		public SouthPanel() {
			btnLeft = new JButton(buttons[0]);
			btnRight = new JButton(buttons[1]);
			MyListener myListener = new MyListener(); 
			add(btnLeft);
			add(btnRight);
			btnLeft.addActionListener(myListener);
			btnRight.addActionListener(myListener);
		}
		
		int i=0;
		class MyListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {			
				if(e.getSource()==btnLeft) {
					if(i==0)
						i=3;
					else
						i--;

				}
				else {
					if(i==3)
						i=0;
					else
						i++;
				}
				imgLabel.setIcon(images[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new p632_imageGallery();
	}

}
