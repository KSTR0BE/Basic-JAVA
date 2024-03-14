package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
		
		//int 4byte 정수형 타입
	}
	
	public void method5() {
		/*
		 *  1~100 홀수의 합을 구하시오.
		 */
		int sum =0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	public void method4() {
		// 1~10까지 짝수의 합을 구하시오.
		
		int sum =0; 
//		for(int i=1; i<=10; i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
		
		for (int i = 2; i<=10; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}
	
	public void method3() {
		// 11~20까지의 숫자를 더하시오.
		
		int sum = 0;
		for(int i =11; i<=20; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
	}
	
	public void method2() {
		// 1~5 까지의 숫자를 더하시오.
		
		int sum =0;
		for(int i =1; i<=5; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
		System.out.println(sum);
		
		
	}
	
	
	public void method1() {
		/*
		 *  반복문 
		 *  for, while문 
		 *  
		 *  i=0  <- 초기화식 : 시작조건        1
		 *  i<10  <- 조건식    : (종료조건) 2
		 *  실행문                                         3
		 *  i++  <- 증감식    : 반복시 실행 4
		 * 
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		
		
	}
	
}
