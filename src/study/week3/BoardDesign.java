package study.week3;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class BoardDesign extends JDialog {
	
	private JLabel jlbNum, jlbTitle, jlbWriter;
	private JTextArea jtaContents;
	private JButton jbtnWrite, jbtnBoardExit;
	
	public BoardDesign(LoginDesign ld) {
		
		super(ld, "게시판", true);
		
		jlbNum = new JLabel("0");
		jlbTitle = new JLabel();
		jlbWriter = new JLabel();
		jtaContents = new JTextArea();
		JScrollPane jsp = new JScrollPane(jtaContents);
		
		jbtnWrite = new JButton("글쓰기");
		jbtnBoardExit = new JButton("종료");
		
		jlbNum.setBorder(new TitledBorder("번호"));
		jlbTitle.setBorder(new TitledBorder("제목"));
		jlbWriter.setBorder(new TitledBorder("작성자"));
		jsp.setBorder(new TitledBorder("내용"));
		jtaContents.setEditable(false);
		
		jlbNum.setBounds(15, 10, 60, 40);
		jlbTitle.setBounds(15, 50, 350, 40);
		jlbWriter.setBounds(380, 50, 100, 40);
		jsp.setBounds(15, 100, 470, 230);
		jbtnWrite.setBounds(190, 340, 60, 30);
		jbtnBoardExit.setBounds(260, 340, 60, 30);
		
		BoardEvent be = new BoardEvent(this, ld);
		jbtnWrite.addActionListener(be);
		jbtnBoardExit.addActionListener(be);
		
		add(jlbNum);
		add(jlbTitle);
		add(jlbWriter);
		add(jsp);
		add(jbtnWrite);
		add(jbtnBoardExit);
		
		setLayout(null);
		setBounds(100, 100, 500, 400);
		setResizable(false);
		setVisible(true);
		
	}	// BoardDesign

	public JLabel getJlbNum() {
		return jlbNum;
	}

	public JLabel getJlbTitle() {
		return jlbTitle;
	}

	public JLabel getJlbWriter() {
		return jlbWriter;
	}

	public JTextArea getJtaContents() {
		return jtaContents;
	}

	public JButton getJbtnWrite() {
		return jbtnWrite;
	}

	public JButton getJbtnBoardExit() {
		return jbtnBoardExit;
	}

}	// class