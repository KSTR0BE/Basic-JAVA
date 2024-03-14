package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
//		obj.method1();
		obj.method2();
	}
	public void method2() {
		// a, b 값을 int로 입력받고 
		// a값이 짝수일때는  a+b
		// a값이 홀수일때는  a*b 연산을 하여 결과를 출력하시오.

		System.out.println("a값 입력");
		int a = sc.nextInt();
		System.out.println("b값 입력");
		int b = sc.nextInt();
		
		int result = a%2==0 ? a+b : a*b;
		
		System.out.println(a+", "+b+ " 결과값은 : "+result);
		
		
		
	}
	
	public void method1() {
		// 삼항 연산자  : 3개의 피연산자를 필요로 하는 연산 
//		                         삼항연산자는 ? 앞의 조건식의 결과에 따라 콜론 앞뒤의 
//		                         피연산자가 선택 조건 연삭식이라고도 함. 

//		String result =  false ? "참" : "거짓";
//		System.out.println(result);
		
		// 나이를 입력 받고 
		// 18보다 크거나 같을경우 성년을 출력
//		                         작을경우 미성년을 출력 
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt(); 
		String result = 18<= age ? "성년" : "미성년";
		System.out.println(age+"세는 "+result+"입니다.");
		
	}
}
