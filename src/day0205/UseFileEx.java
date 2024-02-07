package day0205;

import java.io.File;

import javax.swing.JOptionPane;

public class UseFileEx {

	public static void main(String[] args) {
		
		try {
			String filePathName = JOptionPane.showInputDialog("삭제할 파일의 경로와 파일명을 입력하세요.", "/Users/juhee/eclipse-workspace/sist/temp/jh.txt");
			
			File file = new File(filePathName);
			
			if(!file.exists()) {
				JOptionPane.showMessageDialog(null, file + "은 존재하지 않습니다. 파일 경로나 파일명을 확인해주세요.");
				return;
			}	// end if
			
			int option = JOptionPane.showConfirmDialog(null, file.getName() + " 파일을 정말 삭제하시겠습니까?");
			switch(option) {
			case JOptionPane.OK_OPTION :
				file.delete();
				JOptionPane.showMessageDialog(null, file.getName() + " 파일이 삭제되었습니다.");
			}	// end case
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		}	// end catch
		
	}	// main 

}	// class