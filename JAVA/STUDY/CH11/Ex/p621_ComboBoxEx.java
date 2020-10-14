package Ex;

import javax.swing.*;
import java.awt.*;

public class p621_ComboBoxEx extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private String[] names = {"kitae", "jaemoon", "hyosoo", "namyun", "Serafina", "�����"};
	
	public p621_ComboBoxEx() {
		setTitle("ComboBoxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>(); // �� �޺��ڽ� ����
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);//�޺��ڽ��� ���ڿ� ������ ����
		c.add(nameCombo);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new p621_ComboBoxEx();
	}
}