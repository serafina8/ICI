package Tch;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tch_02_RandomWord extends JFrame {
	Vector<String> vec = new Vector<>();
	public tch_02_RandomWord() {
		setTitle("Randon Word");
		Container cp = getContentPane();
		wordToVector();//word.txt ���Ͽ� �ִ� ����Ÿ�� Vector�� ����
		NorthPane npane = new NorthPane();
		CenterPane cpane = new CenterPane();
		SouthPane spane = new SouthPane();
		
		cp.add(npane, BorderLayout.NORTH);
		cp.add(cpane, BorderLayout.CENTER);
		cp.add(spane, BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
	
	void wordToVector() {
		try {
			FileReader fr = new FileReader("WordPool\\words.txt");
			Scanner sc = new Scanner(fr);
			String word;
			//while(word=sc.nextLine()!=Null)
			while(sc.hasNext()) { //������ ������
				vec.add(sc.nextLine()); //������ Vector�� ����
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.....");
	}
	JTextField tfJumsu;
	class NorthPane extends JPanel {
		public NorthPane() {
			JLabel lblJumsu = new JLabel("���� : ");
			tfJumsu = new JTextField(6);
			tfJumsu.setEditable(false);
			add(lblJumsu); add(tfJumsu);
		}
	}
	
	JTextField tfWord;
	class CenterPane extends JPanel {
		public CenterPane() {
			JLabel lblWord = new JLabel("��������");
			tfWord = new JTextField(25);
			tfWord.setEditable(false);
			add(lblWord); add(tfWord);
		}
	}
	class SouthPane extends JPanel {
		JTextField tfInput;
		public SouthPane() {
			JLabel lblInput = new JLabel("�Է� : ");
			tfInput = new JTextField(15);
			tfInput.addActionListener(new MyListener2());
			JButton btnShuffle = new JButton("����");
			btnShuffle.addActionListener(new MyListener());
			add(lblInput); add(tfInput); add(btnShuffle);
		}
		class MyListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(vec);//���´�
				int randomNum = (int)(Math.random()*vec.size());
				String selectedWord = vec.get(randomNum); //���Ϳ��� ������ ������ �ֱ�
				tfWord.setText(selectedWord);
			}
			
		}
		class MyListener2 implements ActionListener {
			int jumsu;
			@Override
			public void actionPerformed(ActionEvent e) {
				String str1 = tfWord.getText();
				String str2 = tfInput.getText();
				if(str1.equals(str2)) {
					jumsu+=10;
				}
				tfJumsu.setText(jumsu+"");
				tfInput.setText("");
			}
			
		}
		
	}
	public static void main(String[] args) {
		new tch_02_RandomWord();
	}
}
