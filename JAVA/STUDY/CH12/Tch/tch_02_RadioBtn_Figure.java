package Tch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class tch_02_RadioBtn_Figure extends JFrame {
	public tch_02_RadioBtn_Figure() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		
		MenuPane menuPane = new MenuPane();
		DrawPane drawPane = new DrawPane();
		add(menuPane, BorderLayout.NORTH);
		add(drawPane, BorderLayout.CENTER);
		
		setVisible(true);
	}
	JRadioButton btnCircle, btnRect,btnTri;
	class MenuPane extends JPanel {
		public MenuPane() {
			setBackground(Color.DARK_GRAY);
			ButtonGroup btnGroup = new ButtonGroup();
			btnCircle = new JRadioButton(" ��  ", true);
			btnRect = new JRadioButton("�簢��");
			btnTri = new JRadioButton("�ﰢ��");
			btnGroup.add(btnCircle);
			btnGroup.add(btnRect);
			btnGroup.add(btnTri);
			
			add(btnCircle);
			add(btnRect);
			add(btnTri);
		}
	}
	
	class DrawPane extends JPanel{
		int x=-30, y=-30;
		public DrawPane() {
			addMouseListener(new MyListener());
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			if(btnCircle.isSelected()) {
				g.fillOval(x-10, y-10, 20, 20);
					for(int i=0; i<3; i++) {
						if(x==-30) break;
						g.fillOval((int)(Math.random()*360), (int)(Math.random()*200), 10, 10);
				}
			}		
			else if(btnRect.isSelected()) {
				g.fillRect(x-10, y-10, 20, 20);
					for(int i=0; i<3; i++) {
						g.fillRect((int)(Math.random()*360), (int)(Math.random()*200), 10, 10);
					}
			}
			else {
				int[] xx = {x+20, x, x+40};
				int[] yy= {y, y+30, y+30};
				g.fillPolygon(xx, yy, 3);
					for(int i=0; i<3; i++) {
						x=(int)(Math.random()*360);
						y=(int)(Math.random()*200);
						int[] xs = {x+10, x, x+20};
						int[] ys= {y, y+15, y+15};
						g.fillPolygon(xs, ys, 3);
					}
				/*
				 * g.drawLine(x, y-10, x+10, y+10); g.drawLine(x+10, y+10, x-10, y+10);
				 * g.drawLine(x-10, y+10, x, y-10);
				 */
			}
		}
		
		class MyListener extends MouseAdapter {

			@Override
			public void mousePressed(MouseEvent e) {
				int mx=e.getX();
				int my=e.getY();
				x=mx-10;
				y=my-10;
				//tch_02_RadioBtn_Figure.this.repaint();//mouseAdapter���� ������Ʈ�� �����Ƿ� �ٱ��� �����Ƿ�...
				//Ŭ�����̸� �� �� �� ������Ʈ.. ��ü�� �ٽñ׸��Ƿ� ������Ʈ�� �ٽ� ȣ��..
				//repaint �� ����...
				getParent().repaint(); //��Ŵ� �θ���� ã���ִ�
				//repaint();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new tch_02_RadioBtn_Figure();

	}
}