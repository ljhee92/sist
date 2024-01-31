package kr.co.sist.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoInfoEvent extends WindowAdapter implements ActionListener {
	
	private MemoInfoDesign mid;
	
	public MemoInfoEvent(MemoInfoDesign mid) {
		this.mid = mid;
	}	// MemoHelpEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mid.getJbtnCloseInfo()) {
			closeInfo();
		}	// end if
	}	// actionPerformed
	
	private void closeInfo() {
		mid.dispose();
	}	// closeHelp

	@Override
	public void windowClosing(WindowEvent e) {
		mid.dispose();
	}	// windowClosing

}	// class