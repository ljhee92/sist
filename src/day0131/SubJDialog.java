package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  부가적인 기능을 제공하기 위해 제작하는 창: Dialog
 */
@SuppressWarnings("serial")
public class SubJDialog extends JDialog implements ActionListener {
	
	public SubJDialog(ParentFrame pf) {	// Frame의 자식창
		super(pf, "부가적인 기능", true);	// modal
//		super(pf, "부가적인 기능", false);	// non-modal
		
		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img3.png");
		JLabel jlblBack = new JLabel("자식창에서 제공하는 이미지", ii, JLabel.CENTER);
		
		JButton jbtn = new JButton("닫기");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		add("Center", jlblBack);
		add("South", jp);
		
		// JDialog는 이벤트 등록 코드를 항상 setVisible 전에 정의해야 한다.
		jbtn.addActionListener(this);
		// JDialog의 종료 : DISPOSE_ON_CLOSE 사용
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setBounds(pf.getX()+125, pf.getY()+150, 244, 200);	// 항상 Frame 안으로 띄우고 싶다면 부모의 좌표를 얻어온다!
		setVisible(true);	// 사용자에게 보여지는 일.
		
	}	// SubJDialog

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
//		System.exit(JFrame.ABORT);	// JVM에 있는 것들 다 죽여! -> 사용하지 않는다. 
	}	// actionPerformed

}	// class