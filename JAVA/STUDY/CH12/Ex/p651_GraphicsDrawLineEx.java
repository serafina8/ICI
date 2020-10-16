package Ex;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class p651_GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public p651_GraphicsDrawLineEx() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,170);
		setContentPane(panel);
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(20, 20, 100, 100);
		}
		
	}
	
	
	public static void main(String[] args) {
		new p651_GraphicsDrawLineEx();
	}
}