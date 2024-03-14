package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType05 obj = new ReferenceType05();
		obj.method1();
	}
	
	
	public void method1() {
		
		String str1 = "";
		String str2 = null;
		
//		if(str1.equals(str2) || str1 == null) { //서로다른값이라 출력 안됨
//			System.out.println("빈문자열1");
//		}
//		
//		if(str2.equals(str1) || str2 == null) { //힙영역에 아무것도없어서 이퀄스가 근접할수없다
//			System.out.println("빈문자열2");
//		}
//		
		if(str2 == null || str2.equals(str1)) { //위랑 차이는 논리합일때 앞에서 true가 되면 바로 다음단계가 되서 굳이 ||뒤를 안본다.
			System.out.println("빈문자열3");		// null은 앞으로 오게 해라. 순서바꾸면 안됨.
		}
		
		
	}
}
