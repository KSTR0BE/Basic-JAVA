package kr.or.ddit.study06.sec04;

public class MethodTest4 {
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.add(10, 10);
		mt.add(10.5, 10);
		mt.add(10f, 10f);
	}
	
	public int add(int a, int b) { //리턴타입과 파라미터가 다를경우 오버로딩 안됨.
		return a+b;					//리턴타입이 같으면 오버로딩안됨.
		
	}
	public double add(double a, double b) {//위에서 인트로 넣어도 자동으로 더블변환됨.
		return a+b;
		
	}
	public float add(float a, float b) { 
		return a+b;
	}
	
//	public int add(int a, String b) { // 파라미터 안 타입이 달라도 오버로딩됨.
//		return 0;				
//	}
//	public int add(int b, int a) { //파라미터 안 타입이 같은데 순서가 다르면 오버로딩 안됨.
//		return a+b;				

}
