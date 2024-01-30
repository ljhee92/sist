package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *  이벤트를 모아 처리하기 위해 작성 
 */
public class NameManagementEvent extends WindowAdapter implements ActionListener {
	
	private NameManagementDesign nmd;
	
	public NameManagementEvent(NameManagementDesign nmd) {
		this.nmd = nmd;
	}	// NameManagementEvent 
	
	private void addName() {
		JTextField jtfName = nmd.getJtfName();
		String name = jtfName.getText().trim();	// 이름을 가져와서
		
		if(!name.isEmpty()) {	// 비어있지 않으면 
			nmd.getDlmName().addElement(name);
			jtfName.setText("");	// 값이 입력된 후 텍스트필드 초기화
			jtfName.requestFocus();	// 다음 입력이 편하도록 커서 위치
		}	// end if
	}	// addName
	
	private void removeName() {
		JTextField jtfName = nmd.getJtfName();
		String name = jtfName.getText().trim();
		DefaultListModel<String> dlmName = nmd.getDlmName();
		List<String> list = new ArrayList<String>();
		String tempName = "";
		
		// 하나만 삭제
//		dlmName.removeElement(name);
		
		// 다 삭제
		for(int i = 0; i < dlmName.size(); i++) {
			tempName = dlmName.getElementAt(i);
			if(!name.equals(tempName)) {	// J.T.F의 이름과 같지 않은 이름만
				list.add(tempName);			// 리스트에 추가
			}	// end if
		}	// end for
		
		dlmName.removeAllElements();	// 모든 아이템을 삭제하고
		for(String leftName : list) {	// 리스트에 저장된 값으로
			dlmName.addElement(leftName);	// Model에 추가
		}	// end for
		
		jtfName.setText("");
		jtfName.requestFocus();
		
	}	// removeName

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == nmd.getJbtnAdd()) {
			addName();
		}	// end if
		
		if(obj == nmd.getJbtnRemove()) {
			removeName();
		}	// end if
	}	// actionPerformed

	@Override
	public void windowClosing(WindowEvent e) {
		nmd.dispose();
	}	// windowClosing

}	// class