package Tch;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tch_02_TimeZoneEx2 extends JFrame {
	
	String setTimeText(TimeZone tz) {
		Calendar now = Calendar.getInstance();
		now.setTimeZone(tz);
		int year= now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		return year + "년 " + month + "월" + day + "일"
				+ hourOfDay + "시 " + minute + "분 ";
	}
	
	JLabel compareZone;
	public tch_02_TimeZoneEx2() {
		setTitle("timeZoneEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLayout(new GridLayout(0,1));
		
		add(new JLabel("현재시각"));
		JLabel myZone = new JLabel();
		compareZone = new JLabel();
		MyButtonPanel myButtonPanel = new MyButtonPanel(); 
		add(myZone); 
		add(compareZone);
		add(myButtonPanel);
		
		myZone.setBackground(Color.yellow);
		myZone.setOpaque(true);
		compareZone.setBackground(Color.cyan);
		compareZone.setOpaque(true);
		
		myZone.setText("대한민국 : " + setTimeText(TimeZone.getTimeZone("Asia/Seoul")));
		
		setVisible(true);
	}
	
	class MyButtonPanel extends JPanel {
		public MyButtonPanel() {
			setLayout(new FlowLayout());
			setBackground(new Color(100,100,100));
			JButton btn1 = new JButton("LA");
			JButton btn2 = new JButton("런던");
			JButton btn3 = new JButton("시드니");
			JButton btn4 = new JButton("도쿄");
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			
			MyListener listener=new MyListener();
			btn1.addActionListener(listener);
			btn2.addActionListener(listener);
			btn3.addActionListener(listener);
			btn4.addActionListener(listener);
			
		}
		
		class MyListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "LA" :
					compareZone.setText("LA : " + setTimeText(TimeZone.getTimeZone("America/Los_Angeles")));
					break;
				case "런던" :
					compareZone.setText("런던 : " + setTimeText(TimeZone.getTimeZone("Europe/London")));
					break;
				}
								
			} //actionPerformed
			
		} //MyListener
		
	} //MyButtonPanel
	
	public static void main(String[] args) {
		new tch_02_TimeZoneEx2();
	}

}
