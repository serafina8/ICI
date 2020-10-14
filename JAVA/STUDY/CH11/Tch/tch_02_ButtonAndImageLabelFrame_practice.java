package Tch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class tch_02_ButtonAndImageLabelFrame_practice extends JFrame {
	private JLabel imageLabel; // 이미지 레이블
	private ImageIcon [] images = new ImageIcon [4]; // 이미지 객체 배열
	int currentId; // 현재 선택된 이미지 번호(0~3).
	
	public tch_02_ButtonAndImageLabelFrame_practice() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 컨텐트팬 얻기
		c.setLayout(new BorderLayout()); // 컨텐트팬에 BorderLayout 설정

		 // 이미지 파일 로딩.
		// 프로젝트의 images 폴터의 images0.jpg, image1.jpg, image2.jpg, image3.jpg
		for(int i=0; i<images.length; i++)  
			images[i] = new ImageIcon("images/image" + i + ".jpg");

		currentId = 0; // 현재 선택된 이미지 번호
		imageLabel = new JLabel(images[currentId]); // 현재 선택된 이미지를 레이블에 출력
		c.add(imageLabel, BorderLayout.CENTER); // 이미지 레이블을 CENTER에 부착
		c.add(new MenuPanel(), BorderLayout.SOUTH); // 2 개의 화살표 버튼을 가진 MenuPanel 부착
		
		setSize(300,400);
		setVisible(true);
	}

	// 두 개의 화살표 버튼을 가진 메뉴 패널
	class MenuPanel extends JPanel {
		JButton leftBtn,rightBtn;
		public MenuPanel() {
			setBackground(Color.GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png"); // 왼쪽 화살표 이미지 로딩
			ImageIcon rightIcon = new ImageIcon("images/right.png"); // 오른쪽 화살표 이미지 로딩
			leftBtn = new JButton(leftIcon); // 왼쪽 버튼 생성
			rightBtn = new JButton(rightIcon); // 오른쪽 버튼 생성
			MyListener listener=new MyListener();
			leftBtn.addActionListener(listener );
			rightBtn.addActionListener(listener);
			add(leftBtn);	
			add(rightBtn);
			
			/* 왼쪽 화살표 버튼에 Action 리스너 달기
			leftBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentId --; // 이미지 번호 감소. 이전 이미지
					if(currentId==-1)
						currentId=3;
					//currentId += images.length;	// currentId가 음수가 될 수 있기 때문에 4를 더함
					//currentId %= images.length; // 4 가 넘는 것을 막기 위해 이미지 개수로 나머지 구함
					imageLabel.setIcon(images[currentId]); // 이미지 레이블에 이미지 변경
				}
			});
			
			// 오른쪽 화살표 버튼에 Action 리스너 달기
			rightBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentId ++; // 이미지 번호 증가. 다음 이미지
					if(currentId==4)
						currentId=0;
					//currentId %= images.length; // 4 가 넘는 것을 막기 위해 이미지 개수로 나머지 구함 
					imageLabel.setIcon(images[currentId]); // 이미지 레이블에 이미지 변경
				}
			}); 
			//*/
		}
		class MyListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==leftBtn) {
					currentId --; // 이미지 번호 감소. 이전 이미지
					if(currentId==-1)
						currentId=3;
					//currentId += images.length;	// currentId가 음수가 될 수 있기 때문에 4를 더함
					//currentId %= images.length; // 4 가 넘는 것을 막기 위해 이미지 개수로 나머지 구함
					imageLabel.setIcon(images[currentId]); // 이미지 레이블에 이미지 변경
				}else {
					currentId ++; // 이미지 번호 증가. 다음 이미지
					if(currentId==4)
						currentId=0;
					//currentId %= images.length; // 4 가 넘는 것을 막기 위해 이미지 개수로 나머지 구함 
					imageLabel.setIcon(images[currentId]); // 이미지 레이블에 이미지 변경
				}
			}
		}
	}
	
	public static void main(String [] args) {
		new tch_02_ButtonAndImageLabelFrame_practice();
	}
} 