package chap13_silsup;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

import chap13_silsup.VibratingFrame.VibPane;

public class SnowFrame extends JFrame {
	public SnowFrame() {
		super("눈 내리는 샤갈의 마을");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new SnowPanel());
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	}
	
	class SnowPanel extends JPanel {

		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private final int SNOWS = 50;
		private final int SNOW_SIZE = 10;
		private Vector<Point> snowVector = new Vector<Point>();//눈송이의 왼쪽좌표 Point
		
		boolean first = true;
		@Override
		protected void paintComponent(Graphics g) {
			if(first) {
				addSnow();//눈의 위치를 만들고
				new SnowThread().start();
				first = false;
			}
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			drawSnow(g);
			//배경이미지를 먼저 그리고 눈을 그린다
		}
		
		private void addSnow() {
			for(int i=0; i<SNOWS; i++) {
				Point p = new Point((int)(Math.random()*getWidth()),
						(int)(Math.random()*getHeight()));
				snowVector.add(p);
			}
		}
		
		private void drawSnow(Graphics g) {
			g.setColor(Color.white);
			for(int i=0; i<snowVector.size(); i++) {
				Point p = snowVector.get(i);
				g.fillOval(p.x, p.y, SNOW_SIZE, SNOW_SIZE);
			}
		}
		
		private void changeSnowPosition() {
			for(int i=0; i<SNOWS; i++) {
				Point p = snowVector.get(i);
				int xDir = Math.random()>0.5 ? 1 : -1;
				int offsetX = (int)(Math.random()*3)*xDir;
				int offsetY = (int)(Math.random()*7);
				p.x +=offsetX;
				if(p.x<0) p.x=0;
				p.y +=offsetY;
				if(p.y>getHeight()) {
					p.x = (int)(Math.random()*getWidth());
					p.y = 5;
				}
			}
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
					changeSnowPosition();
					SnowPanel.this.repaint();
				}
				
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new SnowFrame();
	}
}
