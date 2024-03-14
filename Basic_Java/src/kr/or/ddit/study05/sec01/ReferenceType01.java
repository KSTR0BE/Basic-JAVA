package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType01 obj = new ReferenceType01();
		obj.method1();		
	}

	public void method1() {
		String str1 = "홍길동" ;
		String str2 = "홍길동" ;
		String str3 = "강감찬" ;
		String str4 = new String("강감찬") ;
		String str5 = new String("강감찬") ;
		
		//스택영역에 있는 주소값을 비교한거라 주소에 있는 값을 가져와서 true 그래서 두번적어도 결국 자바에서 저장되어있는건 단 1건
		System.out.println(str1 == str2); 
		//new String이 붙으면 새로 힙에 저장되어있어 서로다른값이된다. 따라서 값은 false로 뜬다. 강감찬은 3개저장되어있다
		System.out.println(str3 == str4); 
		System.out.println(str4 == str5);
		
		// equals 주소 값이 아닌 값을 비교. 주소가 다른게 아니라 강감찬 그대로의 값은 같아서 true
		System.out.println(str3.equals(str4));
		
		
		
		
	}
}
