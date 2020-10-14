package Tch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tch_01_ComboListEx extends JFrame {
	JLabel lblMsg;
	public tch_01_ComboListEx() {
		setTitle("ComboListEx");
		setSize(300, 300);
		Container cp= getContentPane();
		
		lblMsg = new JLabel("Msg:");
		cp.add(new CenterPane(), BorderLayout.CENTER);
		cp.add(lblMsg, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	class CenterPane extends JPanel {
		JComboBox<String> cmbCity;
		JComboBox<String> cmbGu;
		String city[] = {"인천", "서울", "부천"};
		String inchonGu[] = {"서구","동구", "남구"};
		String seoulGu[] = {"강동구","강남구", "강서구"};
		String buchonGu[] = {"원미구","소사구"};
		
		public CenterPane() {
			setLayout(new GridLayout(3,2));
			JLabel lblCity = new JLabel("도시명");
			JLabel lblGu = new JLabel("구명");
			
			cmbCity = new JComboBox<String>(city);
			cmbCity.addActionListener(new MyAction());
			cmbGu = new JComboBox<String>(inchonGu);
			cmbGu.addActionListener(new MyAction2());
			
			add(lblCity);
			add(lblGu);
			add(cmbCity);
			add(cmbGu);
		}
		
		class MyAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				cmbGu.removeAllItems();
				if(cmbCity.getSelectedIndex()==0) {
					for(int i=0; i<inchonGu.length; i++)
						cmbGu.addItem(inchonGu[i]);
				}else if(cmbCity.getSelectedIndex()==1) {
					for(int i=0; i<seoulGu.length; i++)
						cmbGu.addItem(seoulGu[i]);
				}else {
					for(int i=0; i<buchonGu.length; i++)
						cmbGu.addItem(buchonGu[i]);
				}
			}
		}
		
		class MyAction2 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText((String)cmbCity.getSelectedItem()+" "+cmbGu.getSelectedItem()+"를 선택하셨습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new tch_01_ComboListEx();
	}
}