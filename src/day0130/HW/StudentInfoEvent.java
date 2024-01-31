package day0130.HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

public class StudentInfoEvent extends WindowAdapter implements ActionListener {
	
	private StudentInfoDesign sid;
	
	public StudentInfoEvent(StudentInfoDesign sid) {
		this.sid = sid;
	}	// StudentInfoEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String name = sid.getJtfName().getText().trim();
		int age = (int)sid.getDcbmAge().getSelectedItem();
		String gender;
		String phoneNumber = sid.getJtfPhoneNumber().getText().trim();
		DefaultListModel<String> dlmList = sid.getDlmList();
		
		if(sid.getJrbM().isSelected()) {
			gender = "남";
		} else {
			gender = "여";
		}	// end else
		
		if(!name.isEmpty() && obj == sid.getJbtnAdd()) {
			addInfo(name, age, gender, phoneNumber, dlmList);
		}	// end if
		if(!name.isEmpty() && obj == sid.getJbtnEdit()) {
			editInfo(name, age, phoneNumber, dlmList);
		}	// end if
		if(!name.isEmpty() && obj == sid.getJbtnRemove()) {
			removeInfo(name, dlmList);
		}	// end if
		if(obj == sid.getJbtnExit()) {
			sid.dispose();
		}	// end if
		
	}	// actionPerformed
	
	private void addInfo(String name, int age, String gender, String phoneNumber, DefaultListModel<String> dlmList) {		
		dlmList.addElement(name + "," + age + "," + gender + "," + phoneNumber);
		resetInput();
	}	// addInfo
	
	private void editInfo(String name, int age, String phoneNumber, DefaultListModel<String> dlmList) {
		String tempEl = "";
		String exGender = "";
		
		for(int i = 0; i < dlmList.size(); i++) {
			tempEl = dlmList.getElementAt(i);
			exGender = tempEl.split(",")[2];	// 기존 입력 값 사용
			if(tempEl.contains(name)){
				dlmList.setElementAt(name + "," + age + "," + exGender + "," + phoneNumber, i);
			}	// end if
		}	// end for
		resetInput();
	}	// editInfo
	
	private void removeInfo(String name, DefaultListModel<String> dlmList) {
		List<String> list = new ArrayList<String>();
		String tempList = "";
		
		for(int i = 0; i < dlmList.size(); i++) {
			tempList = dlmList.getElementAt(i);
			if(!tempList.contains(name)) {
				list.add(tempList);
			}	// end if
		}	// end for
		
		dlmList.removeAllElements();
		for(String leftList : list) {
			dlmList.addElement(leftList);
		}	// end for
		resetInput();
	}	// removeInfo
	
	private void resetInput() {
		sid.getJtfName().setText("");
		sid.getJtfPhoneNumber().setText("");
		sid.getJrbW().setSelected(true);
		sid.getJcbAge().setSelectedIndex(0);
		sid.getJtfName().requestFocus();
	}	// resetInput
	
	@Override
	public void windowOpened(WindowEvent e) {
		sid.getJtfName().requestFocus();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		sid.dispose();
	}	// windowClosing
}	// class