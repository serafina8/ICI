package Tch;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tch_02_RandomWordTyping extends JFrame {
	public tch_02_RandomWordTyping() {
		setTitle("RandomWordTyping");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		
		NorthPanel nP = new NorthPanel();
		CenterPanel cP = new CenterPanel();
		SouthPanel sP= new SouthPanel();
		add(nP, BorderLayout.NORTH);
		add(cP, BorderLayout.CENTER);
		add(sP, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setLayout(new GridLayout(0,1));
			add(new JLabel("·£´ý ¹®ÀÚ", JLabel.CENTER));
			JPanel score = new JPanel();
			add(score);
			score.setLayout(new FlowLayout(FlowLayout.RIGHT));
			score.add(new JLabel("Á¡¼ö"));
			JTextField score_tf = new JTextField(5);
			score.add(score_tf);
		}
	}
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(0,1));
			add(new JLabel("·£´ý ¹®ÀÚ", JLabel.CENTER));
			JTextField wordOut_tf = new JTextField(15);
			add(wordOut_tf);
		}
	}
	class SouthPanel extends JPanel {
		public SouthPanel() {
			add(new JLabel("ÀÔ·Â "));
			JTextField wordTyping_tf = new JTextField(15);
			add(wordTyping_tf);
			JButton shuffle_btn = new JButton("¼¯±â");
			add(shuffle_btn);
		}
	}
	
	
	public static void main(String[] args) {
		new tch_02_RandomWordTyping();
		Vector<String> word = new Vector<>();
		
		try {
			InputStream is = new FileInputStream("Words.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
