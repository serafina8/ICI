package Tch;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tch_01_GraphicEx extends JFrame {
	 public tch_01_GraphicEx() {
		 setTitle("");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 DrawPane drawPan = new DrawPane();
		 setContentPane(drawPan);
		 
		 setSize(400,300);
		 setVisible(true);
	 }
 
	 class DrawPane extends JPanel{
		 
		 
		 @Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); //원래의 형태를 유지하고.. super=JPanel..
			g.setColor(Color.blue);
			g.drawOval(100, 50, 200, 200);
		}

		public DrawPane() { //drawpane의 super는 ...
			JButton btnFirst = new JButton("First");
			JButton btnSecond = new JButton("Second");
			add(btnFirst);
			add(btnSecond);
			
		}
	 }
	public static void main(String[] args) {
		new tch_01_GraphicEx();
	}
}