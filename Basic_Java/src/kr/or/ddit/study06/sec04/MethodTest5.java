package kr.or.ddit.study06.sec04;

public class MethodTest5 {
	public static void main(String[] args) {
		MethodTest5 mt = new MethodTest5();
		mt.method1();
		mt.method2(10);
		mt.method3();
	}
	
	public void method3() {
		
		return;
	}
	
	public int method2(int num) {
		//홀수면 홀수의 합
		//짝수면 짝수의 합
		
		if(num%2==0) {
			int sum = 0;
			for(int i = 2; i <= num; i +=2) sum += i;
			return sum;
		} else {
			int sum = 0;
			for(int i = 2; i <= num; i +=2) sum += i;
			return sum;
		}
	}
	
	
	public boolean method1() {
		
		
		
		return true;// 리턴을 하겠다는 메소드를 종료하겠다는 뜻
	}

}
