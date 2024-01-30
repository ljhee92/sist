package kr.co.sist.memo;

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
		
		if(!name.isEmpty() && obj == sid.getJbtnAdd()) {
			addInfo();
		}	// end if
		if(!name.isEmpty() && obj == sid.getJbtnEdit()) {
			editInfo();
		}	// // end if
		if(!name.isEmpty() && obj == sid.getJbtnRemove()) {
			removeInfo();
		}	// end if
		if(obj == sid.getJbtnExit()) {
			sid.dispose();
		}	// end if
	}	// actionPerformed
	
	private void addInfo() {
		String name = sid.getJtfName().getText().trim();
		int age = (int)sid.getDcbmAge().getSelectedItem();
		String phoneNumber = sid.getJtfPhoneNumber().getText().trim();
		DefaultListModel<String> dlm = sid.getDlm();
		
		if(sid.getJrbM().isSelected()) {
			dlm.addElement(name + "," + age + "," + sid.getJrbM().getText() + "," + phoneNumber);
		}	// end if
		if(sid.getJrbW().isSelected()) {
			dlm.addElement(name + "," + age + "," + sid.getJrbW().getText() + "," + phoneNumber);
		}	// end if
	}	// addInfo
	
	private void editInfo() {
		String name = sid.getJtfName().getText().trim();
		int age = (int)sid.getDcbmAge().getSelectedItem();
		String phoneNumber = sid.getJtfPhoneNumber().getText().trim();
		DefaultListModel<String> dlm = sid.getDlm();
		String tempEl = "";
		
		for(int i = 0; i < dlm.size(); i++) {
			tempEl = dlm.getElementAt(i);
			if(tempEl.contains(name) && tempEl.contains("남") && sid.getJrbM().isSelected()){
				dlm.setElementAt(name + "," + age + "," + sid.getJrbM().getText() + "," + phoneNumber, i);
			}	// end if
			if(tempEl.contains(name) && tempEl.contains("여")  && sid.getJrbW().isSelected()) {
				dlm.setElementAt(name + "," + age + "," + sid.getJrbW().getText() + "," + phoneNumber, i);
			}	// end if
		}	// end for
	}	// editInfo
	
	private void removeInfo() {
		String name = sid.getJtfName().getText().trim();
		DefaultListModel<String> dlm = sid.getDlm();
		List<String> list = new ArrayList<String>();
		String tempList = null;
		
		for(int i = 0; i < dlm.size(); i++) {
			tempList = dlm.getElementAt(i);
			if(!tempList.contains(name)) {
				list.add(tempList);
			}	// end if
		}	// end for
		
		dlm.removeAllElements();
		for(String leftList : list) {
			dlm.addElement(leftList);
		}	// end for
	}	// removeInfo

	@Override
	public void windowClosing(WindowEvent e) {
		sid.dispose();
	}	// windowClosing
	
}	// class