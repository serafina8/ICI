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
	
	class MenuPane extends JPanel {
		public MenuPane() {
			setBackground(Color.DARK_GRAY);
			ButtonGroup btnGroup = new ButtonGroup();
			JRadioButton btnCircle = new JRadioButton(" 원  ", true);
			JRadioButton btnRect = new JRadioButton("사각형");
			JRadioButton btnTri = new JRadioButton("삼각형");
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
			g.fillOval(x, y, 20, 20);
		}
		
		class MyListener extends MouseAdapter {

			@Override
			public void mousePressed(MouseEvent e) {
				int mx=e.getX();
				int my=e.getY();
				x=mx-10;
				y=my-10;
				//tch_02_RadioBtn_Figure.this.repaint();//mouseAdapter에는 리페인트가 없으므로 바깥에 있으므로...
				//클래스이름 쩜 디스 쩜 리페인트.. 전체를 다시그리므로 리페인트를 다시 호출..
				//repaint 만 쓰면...
				getParent().repaint(); //요거는 부모님을 찾아주는
				//repaint();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new tch_02_RadioBtn_Figure();

	}
}