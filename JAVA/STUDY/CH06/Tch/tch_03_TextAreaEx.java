package Tch;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tch_03_TextAreaEx extends JFrame {
	public tch_03_TextAreaEx() {
		setTitle("TextAreaEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel nP = new JPanel();
		JPanel cP = new JPanel();
		add(nP, BorderLayout.NORTH);
		add(cP, BorderLayout.CENTER);
		
		nP.add(new JLabel("문장입력"));
		JTextField input = new JTextField(30);
		nP.add(input);
		
		JTextArea ta = new JTextArea(7, 30);
		cP.add(new JScrollPane(ta));
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=input.getText();
				ta.setText(str+"\n");
				for(int i=0; i<str.length(); i++) {
					String first = str.substring(0, str.length()-1);
					String last = str.substring(str.length()-1);
					str=last+first;
					ta.append(str+"\n");
					System.out.println("first: "+first);
					System.out.println("last:"+last);
				}
			}
			
		});
		
		setVisible(true);
	}
	


	public static void main(String[] args) {
		new tch_03_TextAreaEx();
	}

}


