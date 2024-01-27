package kr.co.sist.memo;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class StudentInfo extends JFrame {
	
	public StudentInfo() {
		super("숙제");
		
		setLayout(null);	// 배치 초기화
		
		addJLable();
		addJTextField();
		addJComboBox();
		addJRadioButton();
		addJList();
		addJButton();
		
		setBounds(500, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	// StudentInfo
	
	/**
	 * JLabel 생성 및 위치 선정, 프레임에 배치
	 */
	public void addJLable() {
		String[] label = {"이름", "나이", "성별", "전화번호"};
		JLabel[] jlArr = new JLabel[label.length];
		for(int i = 0; i < label.length; i++) {
			jlArr[i] = new JLabel(label[i]);
			jlArr[i].setBounds(20, (i+1)*35, 180, 50);
			add(jlArr[i]);
		}	// end for
	}	// addJLabel
	
	/**
	 * JTextField 생성, 위치 선정, 프레임에 배치
	 */
	public void addJTextField() {
		JTextField jtfName = new JTextField(10);
		JTextField jtfPhoneNumber = new JTextField(15);
		jtfName.setBounds(60, 45, 150, 30);
		jtfPhoneNumber.setBounds(75, 150, 150, 30);
		add(jtfName);
		add(jtfPhoneNumber);
	}	// addJTextField
	
	/**
	 * JComboBox 생성, 위치 선정, 프레임에 배치
	 */
	public void addJComboBox() {
		DefaultComboBoxModel<Integer> dcbm = new DefaultComboBoxModel<Integer>();
		JComboBox<Integer> jcb = new JComboBox<Integer>(dcbm);
		for(int i = 20; i < 41; i++) {
			dcbm.addElement(i);
		}	// end for
		jcb.setBounds(60, 82, 150, 30);
		add(jcb);
	}	// addJComboBox
	
	/**
	 * JRadioButton 생성, 위치 선정, 프레임에 배치
	 */
	public void addJRadioButton() {
		JRadioButton jrbM = new JRadioButton("남자");
		JRadioButton jrbW = new JRadioButton("여자", true);
		ButtonGroup jrb = new ButtonGroup();
		jrb.add(jrbM);
		jrb.add(jrbW);
		jrbM.setBounds(60, 115, 60, 30);
		jrbW.setBounds(120, 115, 80, 30);
		add(jrbM);
		add(jrbW);
	}	// addJRadioButton
	
	/**
	 * JList 생성, Border 추가, 위치 선정, 프레임에 배치
	 */
	public void addJList() {
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList<String> jl = new JList<String>(dlm);
		dlm.addElement("1,진수현,남,010-1234-5678");
		dlm.addElement("2,김동섭,남,010-2345-6789");

		jl.setBorder(new LineBorder(Color.gray));
		
		jl.setBounds(260, 10, 200, 200);
		add(jl);
	}	// addJList
	
	/**
	 * JButton 생성 및 위치 선정, 프레임에 배치
	 */
	public void addJButton() {
		String[] btn = {"추가", "변경", "삭제", "종료"};
		JButton[] jbtnArr = new JButton[btn.length];
		for(int i = 0; i < btn.length; i++) {
			jbtnArr[i] = new JButton(btn[i]);
			jbtnArr[i].setBounds((i+1)*80, 225, 70, 30);
			add(jbtnArr[i]);
		}	// end for
	}	// addJButton
	
}	// class