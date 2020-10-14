package Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class p618_ListChangeEx extends JFrame {
	public p618_ListChangeEx() {
		setTitle("ListChangeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 입력 후 <Enter> 키"));
		JTextField tf = new JTextField(10);
		c.add(tf);
		
		Vector<String> v = new Vector<String>();
		JList<String> nameList = new JList<String>(v);
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(10);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		
		setVisible(true);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				nameList.setListData(v);//벡터 v에 입력된 모든 이름으로 리스트 새로 만들기 
			}
		});
	}
	public static void main(String[] args) {
		new p618_ListChangeEx();
	}
}