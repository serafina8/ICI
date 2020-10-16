package Silsup;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;

import java.awt.*;
import java.awt.event.*;


public class silsup_06_JTextArea_KeyListener_JSlider extends JFrame {
	JTextArea ta = new JTextArea(7,20);
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0,100,0);
	public silsup_06_JTextArea_KeyListener_JSlider() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		add(new JScrollPane(ta), BorderLayout.CENTER);
		
		add(slider, BorderLayout.SOUTH);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setPaintTrack(true);
			slider.setMajorTickSpacing(20);
			slider.setMinorTickSpacing(5);
			
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s= (JSlider)e.getSource();
				if(ta.getText().length() <= s.getValue())
					s.setValue(ta.getText().length());
				else {
					try {
						ta.setText(ta.getText(0, s.getValue()));
					}catch (BadLocationException e1) {}
				}
			}
		});
		
		ta.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				JTextArea t = (JTextArea)e.getSource();
				int size = t.getText().length();
				try {
					if(size >=100)
						t.setText(t.getText(0,100));
				}catch(BadLocationException ex) {}
				slider.setValue(size);
			}
		});
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new silsup_06_JTextArea_KeyListener_JSlider();
	}
}