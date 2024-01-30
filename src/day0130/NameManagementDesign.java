package day0130;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class NameManagementDesign extends JFrame {
	
	private JTextField jtfName;
	private JButton jbtnAdd, jbtnRemove;
	private DefaultListModel<String> dlmName;
	
	public NameManagementDesign() {
		super("이름 관리");
		
		jtfName = new JTextField(10);
		jbtnAdd = new JButton("추가");
		jbtnRemove = new JButton("삭제");
		dlmName = new DefaultListModel<String>();
		
		JList<String> jlName = new JList<String>(dlmName);
		JScrollPane jspJlName = new JScrollPane(jlName);
		
		JPanel jpNorth = new JPanel();
		
		jpNorth.add(new JLabel("이름"));
		jpNorth.add(jtfName);
		jpNorth.add(jbtnAdd);
		jpNorth.add(jbtnRemove);
		
		jpNorth.setBorder(new TitledBorder("입력"));
		jspJlName.setBorder(new TitledBorder("출력"));
		
		add("North", jpNorth);
		add("Center", jspJlName);
		
		// has a 관계로 이벤트 등록
		NameManagementEvent nme = new NameManagementEvent(this);
		addWindowListener(nme);
		jtfName.addActionListener(nme);
		jbtnAdd.addActionListener(nme);
		jbtnRemove.addActionListener(nme);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		
	}	// NameManagementDesign

	/**
	 * @return the jtfName
	 */
	public JTextField getJtfName() {
		return jtfName;
	}

	/**
	 * @return the jbtnAdd
	 */
	public JButton getJbtnAdd() {
		return jbtnAdd;
	}

	/**
	 * @return the jbtnRemove
	 */
	public JButton getJbtnRemove() {
		return jbtnRemove;
	}

	/**
	 * @return the dlmName
	 */
	public DefaultListModel<String> getDlmName() {
		return dlmName;
	}
	
}	// class