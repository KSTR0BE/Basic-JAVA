package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("a");
		l1.add("1");
		l1.add("10.5");
		
		
		String s1 = (String)l1.get(0);
			
		List<String> l2 = new ArrayList(); //스트링이라고 알고있기 때문에 꺼낼때 자동으로 스트링으로 됨
		l2.add("a1");
		l2.add("a2");
		l2.add("a3");
		
		String s2 = l2.get(0);
		
	}
}
