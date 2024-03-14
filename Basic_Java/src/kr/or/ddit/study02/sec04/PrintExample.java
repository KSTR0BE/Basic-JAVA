package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		obj.method1();
//		obj.method2();
//		obj.method3();
	}
	
	public void method3() {
		/*
		 *   본인 이름과, 나이를 스캐너를 통해 입력 받아 볼것.
		 *   printf를 활용하여 출력하기. printf는 괄호안의 처선째 문자열 형시대로 내용을 출력 문자열 표현 s
		 */
		
		System.out.print("이름 : ");		
		String name = sc.nextLine();
		
		System.out.print("나이 : ");		
		String age = sc.nextLine();
		
		System.out.printf("이름 : %s, 나이 %s", name, age);
		
	}
	
	
	public void method2() {
//		System.out.printf("형식지정문자열", 변수 리스트)
		
		// - 왼쪽 정렬
		// 0 남은 왼쪽 빈공간에 0 채움
		// 8 <- 8개의 공간 십진수 표현 d
		
		System.out.printf("숫자 : %d %d 입니다.\n", 1000 ,2000);
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000);
		
		
		
	}
	
	
	public void method1() {
		// System.out.println() <- 줄바꿈 기능 있음.
		System.out.println("홍길동");
		System.out.println(" 34061");
		System.out.println(" 대전시 중구 계룡로");
		System.out.println();
		
		// System.out.print() <- 줄바꿈 기능 없음.
		System.out.print("홍길동\n");
		System.out.print(" 34061");
		System.out.print(" 대전시 중구 계룡로");
		System.out.println();
		
		
	}
	
	
}
