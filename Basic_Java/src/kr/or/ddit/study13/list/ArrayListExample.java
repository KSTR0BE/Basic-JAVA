package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

/**
 *알트 쉬프트 J 도큐먼트 주석
 *
 *  ArrayList
 * - 1차원 배열구조
 * - 중복을 허용하고 순서화 제공
 * - List 타입의 컬렉션
 * 
 * 
 * 주요 메소드
 * .add		 : 데이터삽입
 * .clear	 : 모든데이터삭제
 * .contains : 포함 여부 확인
 * .get 	 : idx 자료 반환
 * .remove	 : idx 자료 반환 후 삭제
 * 
 * 출석부를 떠올리면 됨 같은 이름이 있다 중복, 번호순서로 아는 것
 */
public class ArrayListExample { //메소드쓸때 f2하면 도큐먼트 주석을 외부에서도 볼 수 있다.
	public static void main(String[] args) {
		
		List l = new ArrayList();
		for(int i = 0; i < 10; i++) {
			l.add("회원"+i);
		}
		for(int i = 0; i < 10; i++) {
			l.add(i);
		}
		for(int i = 0; i < 10; i++) {
			l.add(i+0.5);
		}
		
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		String a = "a0";
		if(l.contains(a)) {
			System.out.println(a+"값이 포합되어 있음.");
			
		}
//		String result = (String)l.get(0); //오브젝트는 모든값을 받을 수 있다
//		l.remove(0);
		String result = (String)l.remove(0);//값을 받고 반환하기 때문에 remove를 바로 사용해도된다.
		System.out.println(result);
		
	}
	

}
