package day0126;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame {
	
	public UseJTable() {
		
		super("MVC 패턴을 도입한 JTable");
		
		// 1. Model 객체 생성
		String[] columnName = {"번호", "이름", "나이", "이메일"};
		String[][] data = {
				{"1", "루피", "24", "test@test.com"},
				{"2", "히루루크", "50", "hihi@test.com"},
				{"3", "쵸파", "13", ""},
				{"4", "샹디", "27", "cook@test.com"},
		};	// data
		DefaultTableModel dtm = new DefaultTableModel(data, columnName);
		
		// 2. Model과 has a 관계를 가진 View 클래스 생성 
		JTable jt = new JTable(dtm);
		
		// 3. Model 객체를 통해 데이터 추가
		String[] tempData = {"5", "샹크스", "40", ""};
		dtm.addRow(tempData);
		
		Vector<String> vec = new Vector<String>();
		vec.add("6");
		vec.add("윤웅찬");
		vec.add("27");
		vec.add("chan@sist.co.kr");
		dtm.addRow(vec);
		
		JScrollPane jsp = new JScrollPane(jt);
		jsp.setBorder(new TitledBorder("해적왕 후보자"));
		
		// 보여지는 것을 제어 : View
		jt.setRowHeight(25);
		
		add(jsp);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseJTable

	public static void main(String[] args) {
		new UseJTable();
	}	// main

}	// class