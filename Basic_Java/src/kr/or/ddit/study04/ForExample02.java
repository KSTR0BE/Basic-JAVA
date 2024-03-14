package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	
	}
	
	public void method4() {
		//스캐너를 통해 입력한 숫자까지 출력하기
		// ex) 30-> 1 2 .... 30
		
		int num1 = sc.nextInt();
		for(int i=0; i<1000; i++) {
			if(num1<i) {
				continue;
			}
			System.out.println(i);
		}
		
//		for(int i=0; i<1000; i++) {
//			System.out.println(i);
//			if(i==stop) {
//				break;
//			}
//		}
	}
		
	
	public void method3() {
		/*
		 * 홀수만 출력
		 */
//		첫번째 방법
//		for(int i =1;  i<10; i+=2) {
//			System.out.println(i);
//			}
//		
//		두번째 방법
//		for(int i=1; i<10; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
//		얜 짝수
		for(int i=1; i<10; i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}
	
	public void method2() {
		/*
		 * 구구단 출력
		 */
		
		for(int dan =2 ; dan<=9 ; dan++) {
			for(int i =1 ;i<=9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println("-------------------");
			
		}
	
		
		
		
	}
	
	public void method1() {
		//영어에 포함된 모음의 수를 구하시오
		// 모음: a e i o u
		// ex) lenght -> 1개
		
		String s = sc.nextLine();
		
		//stirng.lenght() -> 문자열 길이
		int lenght= s.length();
		int count =0;
		
		for(int i=0; i<lenght; i++) {
			char c = s.charAt(i);
			if(c =='a' || c == 'e' || c=='i' || c =='u') {
				count++;
			}
		}
		System.out.printf(s+"에 포함된 모음의 수는 : "+count);
		
		
		
		
	}
}
