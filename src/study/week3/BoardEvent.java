package study.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoardEvent extends WindowAdapter implements ActionListener {
	
	private BoardDesign bd;
	private LoginDesign ld;
	
	public BoardEvent(BoardDesign bd, LoginDesign ld) {
		this.bd = bd;
		this.ld = ld;
	}	// BoardEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == bd.getJbtnWrite()) {
			new WriteDesign(bd, ld);
		}	// end if
		
		if(ae.getSource() == bd.getJbtnBoardExit()) {
			bd.dispose();
		}	// end if
	}	// actionPerformed

	@Override
	public void windowClosing(WindowEvent e) {
		bd.dispose();
	}	// windowClosing

}	// class
