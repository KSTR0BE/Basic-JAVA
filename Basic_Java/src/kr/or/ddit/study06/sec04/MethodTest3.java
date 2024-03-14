package kr.or.ddit.study06.sec04;

public class MethodTest3 {
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		int method1 = mt.method1(10, 10);
		System.out.println(method1);
		System.out.println(mt.method2(10, 10));
		System.out.println(mt.method3(10, 10));
		System.out.println(mt.method4(10, 10));
		
		
	}
	//a+b메소드르르 만들고 결과값을 메인에 받아서 출력
	public int method1(int a, int b) {
		return a + b;
		
		
	}
	//a-b메소드르르 만들고 결과값을 메인에 받아서 출력
	public int method2(int a, int b) {
		return a - b;
		
		
	}
	//a/b메소드르르 만들고 결과값을 메인에 받아서 출력
	public int method3(int a, int b) {
		return a / b;
			
		}
	//a*b메소드르르 만들고 결과값을 메인에 받아서 출력
	public int method4(int a, int b) {
		return a * b;
		
	}
	
}
