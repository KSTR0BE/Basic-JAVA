package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType04 obj = new ReferenceType04();
		obj.method1();
		obj.method2();
	}
	public void method2() {
		
		String s1 = null;
		//1번
		
		int a1 = 100;
		int a2 = -a1;
		//2번
		
		int sum = 0;
		//3번
		
		for(int i=0; i<10; i++) {
			sum+=i;
			//4번  //i값은 스택에 0 1 2 순으로올라감 sum도 마찬가지
		}
		s1 = "테스트";
		//5번 힙에 테스트 생기고 s1 주소값에 테스트와 연결됨 그리고 for문을 벗어났기에 i가 사라짐 하지만 sum값은 살아있다.
		
		String s2 = new String("테스트");
		//6번 힙에 테스트가 하나 더생김 new를 썼기때문. 스택에 s2가 생기고 주소값 2가 생김 s1은 주소값 1
	}
	public void method1() {
		int a1 = 10;
		int a2 = 11;
		//1번
		
		String s1 = null;
		
		//2번
		s1 = "테스트"; //null만들어간다
		
		//
		if(true) {
			int a3 = 12;
			int a4 = 13;
			//3번
		}//블록을 나가는순간 a3 a4 스택에서 사라짐
		//4번
		
		a1 = 15;
		a2 = 17;
		
		
		String s2 = "테스트"; //같은 텍스트가 힙으로 들어가면 s1 null이었던게 테스트 주소값으로 저장된다. 같은문자라
		//5번
	}
}
