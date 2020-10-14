package Tch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class tch_02_ButtonAndImageLabelFrame_practice extends JFrame {
	private JLabel imageLabel; // �̹��� ���̺�
	private ImageIcon [] images = new ImageIcon [4]; // �̹��� ��ü �迭
	int currentId; // ���� ���õ� �̹��� ��ȣ(0~3).
	
	public tch_02_ButtonAndImageLabelFrame_practice() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // ����Ʈ�� ���
		c.setLayout(new BorderLayout()); // ����Ʈ�ҿ� BorderLayout ����

		 // �̹��� ���� �ε�.
		// ������Ʈ�� images ������ images0.jpg, image1.jpg, image2.jpg, image3.jpg
		for(int i=0; i<images.length; i++)  
			images[i] = new ImageIcon("images/image" + i + ".jpg");

		currentId = 0; // ���� ���õ� �̹��� ��ȣ
		imageLabel = new JLabel(images[currentId]); // ���� ���õ� �̹����� ���̺� ���
		c.add(imageLabel, BorderLayout.CENTER); // �̹��� ���̺��� CENTER�� ����
		c.add(new MenuPanel(), BorderLayout.SOUTH); // 2 ���� ȭ��ǥ ��ư�� ���� MenuPanel ����
		
		setSize(300,400);
		setVisible(true);
	}

	// �� ���� ȭ��ǥ ��ư�� ���� �޴� �г�
	class MenuPanel extends JPanel {
		JButton leftBtn,rightBtn;
		public MenuPanel() {
			setBackground(Color.GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png"); // ���� ȭ��ǥ �̹��� �ε�
			ImageIcon rightIcon = new ImageIcon("images/right.png"); // ������ ȭ��ǥ �̹��� �ε�
			leftBtn = new JButton(leftIcon); // ���� ��ư ����
			rightBtn = new JButton(rightIcon); // ������ ��ư ����
			MyListener listener=new MyListener();
			leftBtn.addActionListener(listener );
			rightBtn.addActionListener(listener);
			add(leftBtn);	
			add(rightBtn);
			
			/* ���� ȭ��ǥ ��ư�� Action ������ �ޱ�
			leftBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentId --; // �̹��� ��ȣ ����. ���� �̹���
					if(currentId==-1)
						currentId=3;
					//currentId += images.length;	// currentId�� ������ �� �� �ֱ� ������ 4�� ����
					//currentId %= images.length; // 4 �� �Ѵ� ���� ���� ���� �̹��� ������ ������ ����
					imageLabel.setIcon(images[currentId]); // �̹��� ���̺� �̹��� ����
				}
			});
			
			// ������ ȭ��ǥ ��ư�� Action ������ �ޱ�
			rightBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentId ++; // �̹��� ��ȣ ����. ���� �̹���
					if(currentId==4)
						currentId=0;
					//currentId %= images.length; // 4 �� �Ѵ� ���� ���� ���� �̹��� ������ ������ ���� 
					imageLabel.setIcon(images[currentId]); // �̹��� ���̺� �̹��� ����
				}
			}); 
			//*/
		}
		class MyListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==leftBtn) {
					currentId --; // �̹��� ��ȣ ����. ���� �̹���
					if(currentId==-1)
						currentId=3;
					//currentId += images.length;	// currentId�� ������ �� �� �ֱ� ������ 4�� ����
					//currentId %= images.length; // 4 �� �Ѵ� ���� ���� ���� �̹��� ������ ������ ����
					imageLabel.setIcon(images[currentId]); // �̹��� ���̺� �̹��� ����
				}else {
					currentId ++; // �̹��� ��ȣ ����. ���� �̹���
					if(currentId==4)
						currentId=0;
					//currentId %= images.length; // 4 �� �Ѵ� ���� ���� ���� �̹��� ������ ������ ���� 
					imageLabel.setIcon(images[currentId]); // �̹��� ���̺� �̹��� ����
				}
			}
		}
	}
	
	public static void main(String [] args) {
		new tch_02_ButtonAndImageLabelFrame_practice();
	}
} 