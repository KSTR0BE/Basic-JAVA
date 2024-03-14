package kr.or.ddit.study06.sec05;

public class StaticTest2 {
	int a1 = 1;
	static int a2 = 2;
	
	
	public static void main(String[] args) {
		StaticTest2 st = new StaticTest2();
		st.method1();
		st.smethod2();
	}
	
	public void method1() {
		
	}
	
	public void method2() {
		
	}
	
	
	public static void smethod1(StaticTest2 st) { //스태틱값은 모든곳에서 부를수있다 그래서 다른 스태틱에있어도 부를수있음.
		System.out.println(st.a1);
		
	}
	
	public static void smethod2() {
		
		
	}
	

}
