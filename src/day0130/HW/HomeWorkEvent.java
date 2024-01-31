package day0130.HW;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HomeWorkEvent extends WindowAdapter implements ActionListener, MouseListener {

	private HomeWorkDesign hwd;
	
	public HomeWorkEvent(HomeWorkDesign hwd) {
		this.hwd = hwd;
	}	// HomeWorkEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == hwd.getAddButon()) {
			addMember();
		}	// end if
		if(ae.getSource() == hwd.getChangeButon()) {
			modifyMember();
		}	// end if
		if(ae.getSource() == hwd.getDeleteButon()) {
			removeMember();
		}	// end if
		if(ae.getSource() == hwd.getEndButon()) {
			closeWin();
		}	// end if
	}	// actionPerformed
	
	private void addMember() {
		JTextField jtfName = hwd.getJtfName();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JRadioButton jrbMan = hwd.getMan();
		JRadioButton jrbWman = hwd.getWman();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultComboBoxModel<String> dcbAge = hwd.getAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if(name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력 입니다.");
			jtfName.requestFocus();
			return;
		}	// end if

		// MVC Pattern 도입된 컴포넌트
		String selectedAge = dcbAge.getElementAt(jcbAge.getSelectedIndex());
		
		String gender = jrbWman.getText();
		if(jrbMan.isSelected()) {
			gender = jrbMan.getText();
		}	// end if
		
		String tell = jtfCallNum.getText().trim();
		
		// 유효성 검증 성공 후 데이터를 채우는 일
		StringBuilder sbSetData = new StringBuilder();
		sbSetData.append(name).append(",");
		sbSetData.append(selectedAge).append(",");
		sbSetData.append(gender).append(",");
		sbSetData.append(tell);
		
		// JList에 설정
		dlmData.addElement(sbSetData.toString());
		
		// 컴포넌트를 초기화
		jtfName.setText("");
		jtfCallNum.setText("");
		jrbMan.setSelected(true);
		jcbAge.setSelectedIndex(0);
		jtfName.requestFocus();
	}	// addMember

	private void modifyMember() {
		// 이름, 나이, 전화번호를 입력받아 이름과 같은 사람의 나이와 전화번호를 변경한다.
		JTextField jtfName = hwd.getJtfName();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultComboBoxModel<String> dcbAge = hwd.getAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if(name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력 입니다.");
			jtfName.requestFocus();
			return;
		}	// end if
		
		// MVC Pattern 도입된 컴포넌트
		String selectedAge = dcbAge.getElementAt(jcbAge.getSelectedIndex());

		String tell = jtfCallNum.getText().trim();
		
		// 리스트에서 값을 얻어 이름이 같은지(시작하니?) 시작한다면 입력된 값으로 변경한다.
		String item = "";
		StringBuilder sbSetData = new StringBuilder();
		String gender = "";
		
		for(int i = 0; i < dlmData.size(); i++) {
			item = dlmData.getElementAt(i);
			if(item.startsWith(name)) {
				gender = item.split(",")[2];	// 기존의 값 사용
				sbSetData.append(name).append(",")
				.append(selectedAge).append(",")
				.append(gender).append(",").append(tell);
				
				dlmData.removeElementAt(i);
				dlmData.add(i, sbSetData.toString());
			}	// end if
		}	// end for
		
	}	// modifyMember

	private void removeMember() {
		// 입력된 이름에 해당하는 아이템을 JList에서 삭제
		JTextField jtfName = hwd.getJtfName();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if(name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력 입니다.");
			jtfName.requestFocus();
			return;
		}	// end if
		
		Object[] obj = new Object[dlmData.size()]; // 배열 생성
		obj = dlmData.toArray();	
		String item = "";
		
		dlmData.removeAllElements();	
		for(int i = 0; i < obj.length; i++) {
			item = (String) obj[i];
			if(!item.startsWith(name)) {
				dlmData.addElement(item);
			}	// end if
		}	// end for
	}	// removeMember
	
	private void closeWin() {
		hwd.dispose();
	}	// closeWin
	
	@Override
	public void windowClosing(WindowEvent we) {
		hwd.dispose();
	}	// windowClosing

	@Override
	public void mouseClicked(MouseEvent e) {
		JTextField jtfName = hwd.getJtfName();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();
		JRadioButton jrbMan = hwd.getMan();
		JRadioButton jrbWman = hwd.getWman();
		JList<String> jlData = hwd.getJlData();
		
		switch(e.getButton()) {
		case MouseEvent.BUTTON1 :
			if(e.getSource() == jlData) {
				int ind = jlData.getSelectedIndex();
				if(ind != -1) {
					jtfName.setText(dlmData.getElementAt(ind).split(",")[0]);
					jcbAge.setSelectedItem(dlmData.getElementAt(ind).split(",")[1]);
					switch(dlmData.getElementAt(ind).split(",")[2]) {
					case "남":
						jrbMan.setSelected(true);
						break;
					case "여":
						jrbWman.setSelected(true);
					}
					jtfCallNum.setText(dlmData.getElementAt(ind).split(",")[3]);
				}	// end if
			}	// end if
		}	// switch~case
	}	// mouseClicked


	@Override
	public void mousePressed(MouseEvent e) {
		
	}	// mousePressed


	@Override
	public void mouseReleased(MouseEvent e) {
		
	}	// mouseReleased
	

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}	// mouseEntered


	@Override
	public void mouseExited(MouseEvent e) {
		
	}	// mouseExited


	
	@Override
	public void windowActivated(WindowEvent e) {
		hwd.getJtfName().requestFocus();
	}	// windowActivated
	
}	// class