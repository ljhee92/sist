package day0119;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import java.util.*;

/**
 *  다른 패키지에 존재하는 클래스를 가져다 사용할 때. <br>
 *  정리 단축키: shift + ctrl + o
 */

public class TestImport {

	public static void main(String[] args) {
		
		Date d = new Date();
		java.sql.Date d2 = null;	// util.Date가 아닌 sql.Date를 사용하고 싶다. -> full path로 입력
		Date d3 = null;
		
		List l = new ArrayList();
		Map m = new HashMap();

	}	// main

}	// class