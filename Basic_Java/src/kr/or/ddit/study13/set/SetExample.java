package kr.or.ddit.study13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 
 *	HashSet
 *	- key로 이루어짐
 *	- key값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *
 *	Set 타임의 대표 컬렉션
 * 
 *   주요 메소드
 *   s.add()
 *   s.remove()
 *   s.contains();
 *   s.iterator();
 * 
 * 자신이 혼자서 못꺼내고 조력자인 Iterator한테 부탁해서 가져와야함
 * 구슬주머니에 손을 넣어서 있는지 없는지 확인 hasnext()
 * 구슬이 있어서  딱 꺼내는 것이 next()
 *
 */
public class SetExample {
	public static void main(String[] args) {
//		Set s = new HashSet();
//		s.add("a");
//		s.add("a");
//		s.add(1);
//		s.add(1);
//		s.add(10.5);
//		s.add(10.5);
//		s.add("b");
//		s.add("b");
//		s.add("가");
//		s.add("가");
//		s.add("나");
//		s.add("나");
//		s.add("다");
//		s.add("다");
//		
//		
//		Iterator it = s.iterator(); //순서가 보장하지않음 // 중복을 허용하지 않음
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Set<Integer> s = new HashSet();
		while(s.size()<6) {
			s.add(new Random().nextInt(45)+1);
		}
		
		Iterator it = s.iterator();
		while(it.hasNext()) { //hasNext 값이 있다면 참, 값이 있을 때 까지 참이다.
			System.out.print(it.next() + ", "); //map에서는 set있는 것을 그대로 사용함.
		}
		
		
		
		
	}
}
