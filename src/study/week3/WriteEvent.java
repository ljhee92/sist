package study.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WriteEvent extends WindowAdapter implements ActionListener {
	
	private WriteDesign wd;
	private BoardDesign bd;
	private LoginDesign ld;
	
	public WriteEvent(WriteDesign wd, BoardDesign bd, LoginDesign ld) {
		this.wd = wd;
		this.bd = bd;
		this.ld = ld;
	}	// WriteEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == wd.getJbtnApply()) {
			int currentNum = Integer.parseInt(bd.getJlbNum().getText());
			bd.getJlbNum().setText(String.valueOf(currentNum+1));
			
			bd.getJlbTitle().setText(wd.getJtfTitle().getText());
			bd.getJlbWriter().setText(ld.getJtfLogID().getText().trim());
			bd.getJlbContents().setText(wd.getJtfContents().getText());
			
			wd.dispose();
		}	// end if
		
		if(ae.getSource() == wd.getJbtnWriteExit()) {
			wd.dispose();
		}	// end if
	}	// actionPerformed

	@Override
	public void windowClosing(WindowEvent e) {
		wd.dispose();
	}	// windowClosing

}	// class