package chap13_silsup;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame2 extends JFrame {
	public VibratingFrame2() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new VibPane());
		setSize(300,300);
		setLocation(100,100);
		setVisible(true);
	}
	
	class VibPane extends JPanel {
		VibratingThread thread;
		JLabel label;
		public VibPane() {
			setLayout(null);
			label = new JLabel("진동 레이블");
			label.setFont(new Font("고딕",Font.PLAIN, 20));
			label.setLocation(100, 100);
			label.setSize(150, 20);
			add(label);
			
			thread = new VibratingThread();
			thread.start();
		}
		
		class VibratingThread extends Thread {
			/*
			 * private JLabel label; // Component를 상속받은 어떤 컴포넌트 public
			 * VibratingThread(JLabel label) { this.label = label; }
			 */
	         @Override
	        public void run() {
	        	Random r = new Random();
	        	int y = label.getY();
	        	int x = label.getX();
	        	
	        	
        	while(true) {
        		try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					return ;
				}
        		
        		int sign=(r.nextBoolean())? 1:-1; 
        		//랜덤 클래스 대신 (Math.random()>0.5) 사용가능
        		int tmpX = x+r.nextInt(5)*sign;
        		
        		sign=(r.nextBoolean())? 1:-1;
        		int tmpY = y+r.nextInt(5)*sign;
        		
        		label.setLocation(tmpX,tmpY);
        	}
        	}
	        }
	}
	
	public static void main(String[] args) {
		new VibratingFrame2();
	}
}
