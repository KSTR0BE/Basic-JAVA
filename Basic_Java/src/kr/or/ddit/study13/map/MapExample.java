package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *	HasMap
 *	- key 와 value로 이루어짐
 *	- key 값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *
 *
 *
 *	Map 타입의 대표 컬렉션
 *
 *	주요 메소드
 *	.put(key, value)	: 데이터 입력 key값은 중복되지않음. value는 중복가능
 *	.get(key)			: 입력 받은 값을 key값을 통해 꺼내 올 수 있음.
 *	.clear()			: 데이터 초기화
 *	.keySet()			: key 값을 Set 타입으로 전부 가져옴.
 *
 *
 * 304호의 나 자신이라고 생각하면됨.
 * 304호의 번호1번 키값
 * 동명이인 value 
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		
		map.put("홍길동", 95); //데이터 넣을때 put으로
		map.put("이순산", 85);
		map.put("강감찬", 87);
		map.put("강감찬", 100); //맵에 똑같은 key가 나오면 덮어씌어짐
		// map도 제네릭이 있다.
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key =it.next();
			System.out.println(key + " : " + map.get(key)); 
		}
		
		
	}
	

}
