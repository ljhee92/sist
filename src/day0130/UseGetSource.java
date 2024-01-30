package day0130;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseGetSource extends JFrame implements ActionListener {
	
	private JButton jbtn, jbtn2;
	private JTextField jtf; 
	
	public UseGetSource() {
		super("주소를 사용한 이벤트 발생 객체 비교");
		
		jbtn = new JButton("버튼");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
		// 컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jtf);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
		
	}	// UseGetSource

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
//		System.out.println(obj);	// // getSource()는 이벤트를 발생시킨 객체의 주소가 반환
		if(obj == jbtn) {
			System.out.println("버튼이 눌렸을 때 제공할 코드");
		}	// end if
		if(obj == jbtn2) {
			System.out.println("버튼2가 눌렸을 때 제공할 코드");
		}	// end if
		if(obj == jtf) {
			System.out.println("텍스트 필드에서 엔터가 눌렸을 때 제공할 코드");
		}	// end if
	}	// actionPerformed

	public static void main(String[] args) {
		new UseGetSource();
	}	// main

}	// class