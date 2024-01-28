package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UseMap {
	
	/**
	 *  기본 생성자를 사용하여 생성하면 11개의 행이 생성되는 Hashtable의 사용 <br>
	 *  동기화가 되므로 속도가 느림
	 */
	public void useHashtable() {
		
		// 1. Map 생성
		Map<String, String> map = new Hashtable<String, String>();
		
		// 2. Map 값 설정) map.put(키, 값); - 순서대로 입력되지 않는다.
		map.put("A", "세심하다, 친절하다. ^ㅇ^b");
		map.put("B", "성질드럽다. ㅡ,.ㅡ");
		map.put("AB", "싸이코 @,.@");
		map.put("O", "우유부단 ~(^^~)(~^^)~");
		
		// 키가 중복되면 같은 키에 덮어쓴다.
		map.put("A", "소심하다 👉(^-^)👈");
		
		// 키가 다르면 중복값을 허용한다.
		map.put("a", "소심하다 👉(^-^)👈");
		
		System.out.println(map);
		
		// 맵에 키가 존재하는지?
		System.out.println(map.containsKey("A") + " " + map.containsKey("o"));
		
		// 3. 검색) 키를 사용하여 값을 검색 - map.get(키)
		String key = "ab";
		if(map.containsKey(key)) {
			String value = map.get(key);	// 키가 존재하지 않으면 객체이기 때문에 null 반환
			System.out.println(key + "의 특징은 " + value);
		} else {
			System.out.println(key + "에 대한 값은 준비되어 있지 않습니다.");
		}	// end else
		
		// 4. 값 삭제) map.remove(키), map.clear()
		map.remove("a");
		map.clear();
		
		System.out.println("map이 비었니? " + map.isEmpty());
		
	}	// UseMap

	
	/**
	 *  기본 생성자를 사용하여 생성하면 16개의 행이 생성되는 HashMap의 사용 <br>
	 *  동기화가 되지 않으므로 속도 빠름 <br>
	 *  속도가 빠르므로 자주 사용
	 */
	public void useHashMap() {

		// 1. Map 생성
		Map<String, String> map = new HashMap<String, String>();
		
		// 2. Map 값 설정) map.put(키, 값); - 순서대로 입력되지 않는다.
		map.put("A", "세심하다, 친절하다. ^ㅇ^b");
		map.put("B", "성질드럽다. ㅡ,.ㅡ");
		map.put("AB", "싸이코 @,.@");
		map.put("O", "우유부단 ~(^^~)(~^^)~");
		
		// 키가 중복되면 같은 키에 덮어쓴다.
		map.put("A", "소심하다 👉(^-^)👈");
		
		// 키가 다르면 중복값을 허용한다.
		map.put("a", "소심하다 👉(^-^)👈");
		
		System.out.println(map);
		
		// 맵에 키가 존재하는지?
		System.out.println(map.containsKey("A") + " " + map.containsKey("o"));
		
		// 3. 검색) 키를 사용하여 값을 검색 - map.get(키)
		String key = "ab";
		if(map.containsKey(key)) {
			String value = map.get(key);	// 키가 존재하지 않으면 객체이기 때문에 null 반환
			System.out.println(key + "의 특징은 " + value);
		} else {
			System.out.println(key + "에 대한 값은 준비되어 있지 않습니다.");
		}	// end else
		
		// 4. 값 삭제) map.remove(키), map.clear()
		map.remove("a");
		map.clear();
		
		System.out.println("map이 비었니? " + map.isEmpty());
		
	}	// UseMap
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("--------------------------------Hashtable--------------------------------");
		um.useHashtable();
		System.out.println("--------------------------------HashMap--------------------------------");
		um.useHashMap();
	}	// main 

}	// class