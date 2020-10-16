package Ex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class p654_Checktime extends JFrame {
	MyPanel panel = new MyPanel();
	public p654_Checktime() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setContentPane(panel);
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel{

		public MyPanel() {
			addMouseMotionListener(new MouseAdapter() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseMoved(e);
					setTitle("("+e.getX()+","+ e.getY()+")");
				}
			});
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow);
			g.drawLine(10, 10, 300, 300);
			g.drawOval(10, 15, 200, 100);
			g.setColor(Color.red);
			int[] x = {10, 5, 15};
			int[] y = {10, 15, 20};
			g.fillPolygon(x, y, 3);
			g.fillArc(50, 230, 200, 200, 90, 120);
			g.setColor(Color.blue);
			g.fillArc(50, 230, 200, 200, 210, 120);
			g.setColor(Color.yellow);
			g.fillArc(50, 230, 200, 200, 330, 120);
			
		}
	}
	
	public static void main(String[] args) {
		new p654_Checktime();
	}
}