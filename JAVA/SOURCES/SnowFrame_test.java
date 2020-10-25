package SnowFrame;
import java.awt.*;
import java.util.Vector;
import javax.swing.*;

public class SnowFrame_test extends JFrame {
	
	public SnowFrame_test() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setResizable(false);
		
		setContentPane(new SnowPanel());
		
		setVisible(true);
	}
	
	class SnowPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private final int SNOW_NUM = 50;
		private final int SNOW_SIZE = 10;
		private Vector<Point> snowVector = new Vector<Point>();
		
		private void addPoints() {
			for(int i=0; i<SNOW_NUM; i++) {
				Point p = new Point((int)(Math.random()*getWidth()),
						(int)(Math.random()*getWidth()));
				snowVector.add(p);
			}
		}
		
		private void drawSnows(Graphics g) {
			g.setColor(Color.white);
			for(int i=0; i<SNOW_NUM; i++) {
				Point p = snowVector.get(i);
				g.fillOval(p.x, p.y, SNOW_SIZE, SNOW_SIZE);
			}
		}
		
		private void changeSnowsPositions() {
			for(int i=0; i<SNOW_NUM; i++) {
				Point p = snowVector.get(i);
				int xDir = Math.random()>0.5 ? 1 : -1;
				int offsetX = (int)(Math.random()*3)*xDir;
				int offsetY = (int)(Math.random()*7);
				p.x += offsetX;
				if(p.x<0) p.x=0;
				p.y += offsetY;
				if(p.y>getHeight()) {
					p.x = (int)(Math.random()*getWidth());
					p.y = 5;
				}
			}
		}
			
		
		@Override
		protected void paintComponent(Graphics g) {
			boolean first = true; //이걸 안으로 넣으면 눈이 마구 떨어지는 이유 ???
			
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			if(first) {
				addPoints();
				new SnowThread().start();
				first=false;
			}
			drawSnows(g);
		}
		
		class SnowThread extends Thread {
			@Override
			public void run() {
				while(true) {
					try {
						sleep(300);
					} catch (InterruptedException e) {
						return;
					}
					changeSnowsPositions();
					SnowPanel.this.repaint();
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new SnowFrame_test();
	}
}
