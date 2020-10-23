package chap13_silsup;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame {
	public VibratingFrame() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new VibPane());
		setSize(300,300);
		setLocation(100,100);
		setVisible(true);
	}
	
	class VibPane extends JPanel {
		
		public VibPane() {
			setLayout(null);
			JLabel label = new JLabel("진동 레이블");
			label.setFont(new Font("고딕",Font.PLAIN, 20));
			label.setLocation(100, 100);
			label.setSize(150, 20);
			add(label);
			
			VibratingThread thread = new VibratingThread(label);
			thread.start();
		}
		
		class VibratingThread extends Thread {
			private Component comp; // Component를 상속받은 어떤 컴포넌트
	        public VibratingThread(Component comp) {
	            this.comp = comp;
		}
	         @Override
	        public void run() {
	        	Random r = new Random();
	        	int y = comp.getY();
	        	int x = comp.getX();
	        	
	        	
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
        		
        		comp.setLocation(tmpX,tmpY);
        	}
        	}
	        }
	}
	
	public static void main(String[] args) {
		new VibratingFrame();
	}
}
