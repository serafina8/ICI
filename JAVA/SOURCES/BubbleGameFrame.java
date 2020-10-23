package chap13_silsup;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BubbleGameFrame extends JFrame {
	public BubbleGameFrame() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		GamePanel p = new GamePanel();
		setContentPane(p);
		
		setVisible(true);
	}
	
	class GamePanel extends JPanel {
		public GamePanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					BubbleThread bubbleThread = new BubbleThread(e.getX(), e.getY());
					bubbleThread.start();
				}
			});
		}
		
		class BubbleThread extends Thread {
			private JLabel bubble;
			public BubbleThread(int bubbleX, int bubblY) {
				ImageIcon img = new ImageIcon("images/bubble.jpg");
				bubble = new JLabel(img);
				bubble.setSize(img.getIconWidth(), img.getIconHeight());
				bubble.setLocation(bubbleX, bubblY);
				
				add(bubble);//GamePanel에 add()
				GamePanel.this.repaint();
			}
			
			@Override
			public void run() {
				while(true) {
					int x = bubble.getX();
					int y = bubble.getY()-5;
					if(y<0) {
						GamePanel.this.remove(bubble);
						GamePanel.this.repaint();
						return;//thread ends
					}
					bubble.setLocation(x,y);
					GamePanel.this.repaint();
					try {
						sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new BubbleGameFrame();
	}
}
