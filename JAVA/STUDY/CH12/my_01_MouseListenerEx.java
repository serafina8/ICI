import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class my_01_MouseListenerEx extends JFrame implements MouseMotionListener {
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		
		
	}

	JPanel p = new JPanel();
	int x=0, y=0;
	
	public my_01_MouseListenerEx() {
		setLayout(null);
		p.setBounds(x, y, 50, 50);
		p.setBackground(Color.red);
		addMouseListener((MouseListener) this);
		add(p);
		
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new my_01_MouseListenerEx();
	}

}
