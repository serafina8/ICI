package Tch;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tch_01_GraphicEx_2 extends JFrame {
	 public tch_01_GraphicEx_2() {
		 setTitle("");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 DrawPane drawPan = new DrawPane();
		 setContentPane(drawPan);
		 
		 setSize(400,300);
		 setVisible(true);
		 //System.out.println("Frame:"+getWidth()+" "+getHeight());
	 }
	 int x=40, y=40;
	 class DrawPane extends JPanel{
		 
		 
		 @Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); //원래의 형태를 유지하고.. super=JPanel..
			//System.out.println("Frame:"+getWidth()+" "+getHeight());
			g.setColor(Color.blue);
			g.drawOval(x, y, 20, 20);
		}

		public DrawPane() { //drawpane의 super는 ...
			MyListener l = new MyListener();
			JButton btnRight = new JButton("Right");
			JButton btnDown = new JButton("Down");
			JButton btnLeft = new JButton("Left");
			JButton btnUp = new JButton("Up");
			add(btnRight); 
			add(btnDown);
			add(btnLeft);
			add(btnUp);
			btnRight.addActionListener(l);
			btnDown.addActionListener(l);
			btnLeft.addActionListener(l);
			btnUp.addActionListener(l);
			
		}
		
		class MyListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "Right": x=x+10; 
						if(x>getWidth()) x=5;
						repaint(); break;
				case "Down": y=y+10; 
						if(y>getHeight()) y=5;
						repaint(); break;
				case "Left": x=x-10; 
						if(x<=0) x=getWidth()-5;
						repaint(); break;
				case "Up": y=y-10; 
						if(y<=0) y=getHeight()-5;
						System.out.println(y);
						repaint(); break;
				
				}
				
			}
			
		}
	 }
	public static void main(String[] args) {
		new tch_01_GraphicEx_2();
	}
}