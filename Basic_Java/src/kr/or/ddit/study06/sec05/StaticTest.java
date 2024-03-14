package kr.or.ddit.study06.sec05;

public class StaticTest {
	static int a;
	int b;
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		
	}
	
	static void method() {
		System.out.println(a);
//		System.out.println(b); // 어떤 b값을 가져올지 모른다
		StaticTest st1 = new StaticTest();
		System.out.println(st1.b);
		
	}
	
	void method2() {
		System.out.println(a);
		System.out.println(b);
		
	}

}
