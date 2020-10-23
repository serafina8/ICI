package chap13_silsup;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class RandomCircle0 extends JFrame {
	
	public RandomCircle0() {
		CirclePane c =  new CirclePane();
		setContentPane(c);
		
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	
	class CirclePane extends JPanel {
		int x=100, y=100;
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.fillOval(x, y, 50, 50); // 지름이 50, 스레드에서 x,y값을 변경할거이므로 밖에 선언
		}

		public CirclePane() {
			setBackground(Color.LIGHT_GRAY);
			addMouseListener(new MyListener()); //리스너에서는 스레드를 동작시키고
		}
		
		class MyListener extends MouseAdapter { 
			MyThread th;
			@Override
			public void mouseClicked(MouseEvent e) {
				//MyThread th = new MyThread(); //스레드 만들고
				//MyThread th =null; //밖으로 꺼낸다
				if(e.getClickCount()==2)
					th.interrupt(); //
				if(th==null || !th.isAlive()) { //!th.isAlive()는...
					th= new MyThread();
					th.start(); //쿡찍으면 스레드 실행
				}
			}
			
		}
		
		class MyThread extends Thread {
			@Override
			public void run() {
				while(true) {
					
					x=(int)(Math.random()*getWidth()); //getWidth는 자기몸안에 없으므로 밖에서 찾는다. 
					//이건 Frame이 갖고있는거다 RandomCircle0.this.getWidth
					y=(int)(Math.random()*getHeight());
					repaint();
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						return;
					}//스레드에있는 스태틱메소드 슬립
				}
				
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new RandomCircle0();
	}
}
