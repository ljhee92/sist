package day0130.HW;

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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class StudentInfoDesign extends JFrame {
	
	private JTextField jtfName, jtfPhoneNumber;
	private DefaultComboBoxModel<Integer> dcbmAge;
	private JComboBox<Integer> jcbAge;
	private JRadioButton jrbM, jrbW;
	private DefaultListModel<String> dlmList;
	private JList<String> jlList;
	private JButton jbtnAdd, jbtnEdit, jbtnRemove, jbtnExit;
	
	public StudentInfoDesign() {
		super("숙제");
		setDesign();
		StudentInfoEvent sie = new StudentInfoEvent(this);
		runEvent(sie);
	}	// StudentInfo
	
	public void setDesign() {
		addJLable();
		addJTextField();
		addJComboBox();
		addJRadioButton();
		addJList();
		addJButton();
		setLayout(null);
		setBounds(500, 100, 500, 300);
		setResizable(false);
		setVisible(true);
	}	// setDesign
	
	public void runEvent(StudentInfoEvent sie) {
		addWindowListener(sie);
		jbtnAdd.addActionListener(sie);
		jbtnEdit.addActionListener(sie);
		jbtnRemove.addActionListener(sie);
		jbtnExit.addActionListener(sie);
	}	// runEvent
	
	public void addJLable() {
		String[] label = {"이름", "나이", "성별", "전화번호"};
		JLabel[] jlArr = new JLabel[label.length];
		for(int i = 0; i < label.length; i++) {
			jlArr[i] = new JLabel(label[i]);
			jlArr[i].setBounds(20, (i+1)*35, 60, 45);
			add(jlArr[i]);
		}	// end for
	}	// addJLabel
	
	public void addJTextField() {
		jtfName = new JTextField(10);
		jtfPhoneNumber = new JTextField(15);
		jtfName.setBounds(80, 40, 150, 30);
		jtfPhoneNumber.setBounds(80, 150, 150, 30);
		add(jtfName);
		add(jtfPhoneNumber);
	}	// addJTextField
	
	public void addJComboBox() {
		dcbmAge = new DefaultComboBoxModel<Integer>();
		jcbAge = new JComboBox<Integer>(dcbmAge);
		for(int i = 20; i < 41; i++) {
			dcbmAge.addElement(i);
		}	// end for
		jcbAge.setBounds(80, 78, 150, 30);
		add(jcbAge);
	}	// addJComboBox
	
	public void addJRadioButton() {
		jrbM = new JRadioButton("남");
		jrbW = new JRadioButton("여", true);
		ButtonGroup jrb = new ButtonGroup();
		jrb.add(jrbM);
		jrb.add(jrbW);
		jrbM.setBounds(80, 112, 60, 30);
		jrbW.setBounds(140, 112, 80, 30);
		add(jrbM);
		add(jrbW);
	}	// addJRadioButton
	
	public void addJList() {
		dlmList = new DefaultListModel<String>();
		jlList = new JList<String>(dlmList);
		dlmList.addElement("진수현,20,남,010-1234-5678");
		dlmList.addElement("김동섭,21,남,010-2345-6789");
		JScrollPane jsp = new JScrollPane(jlList);
		jlList.setBorder(new LineBorder(Color.gray));
		jsp.setBounds(260, 10, 200, 200);
		add(jsp);
	}	// addJList
	
	public void addJButton() {
		jbtnAdd = new JButton("추가");
		jbtnEdit = new JButton("변경");
		jbtnRemove = new JButton("삭제");
		jbtnExit = new JButton("종료");
		jbtnAdd.setBounds(80, 225, 70, 30);
		jbtnEdit.setBounds(160, 225, 70, 30);
		jbtnRemove.setBounds(240, 225, 70, 30);
		jbtnExit.setBounds(320, 225, 70, 30);
		add(jbtnAdd);
		add(jbtnEdit);
		add(jbtnRemove);
		add(jbtnExit);
	}	// addJButton

	public JTextField getJtfName() {
		return jtfName;
	}

	public JTextField getJtfPhoneNumber() {
		return jtfPhoneNumber;
	}

	public DefaultComboBoxModel<Integer> getDcbmAge() {
		return dcbmAge;
	}
	
	public JComboBox<Integer> getJcbAge() {
		return jcbAge;
	}

	public JRadioButton getJrbM() {
		return jrbM;
	}

	public JRadioButton getJrbW() {
		return jrbW;
	}

	public DefaultListModel<String> getDlmList() {
		return dlmList;
	}

	public JList<String> getJlList() {
		return jlList;
	}

	public JButton getJbtnAdd() {
		return jbtnAdd;
	}

	public JButton getJbtnEdit() {
		return jbtnEdit;
	}

	public JButton getJbtnRemove() {
		return jbtnRemove;
	}

	public JButton getJbtnExit() {
		return jbtnExit;
	}
	
}	// class