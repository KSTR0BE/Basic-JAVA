package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해 숫자를 입력 받고 
		 *  소수점 2째 자리에서 버림
		 *  ex) 12.23123 -> 12.23
		 */
		System.out.println("실수를 입력해 주세요.");
		
		String num = sc.nextLine();
		double num1 = Double.parseDouble(num);
		
		int i = (int)(num1*100);
		System.out.println(i);
		num1 = i/100.0;
		System.out.println(num1);
		
	}
	
	public void method2() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex ) a -> A 
		 */
		
		System.out.println("소문자를 입력하세요");
		
		String str = sc.nextLine();
		char c = (char)(str.charAt(0)-32);
		System.out.println(c);
		
		
	}
	
	public void method3() {
		/*
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex ) F -> f 
		 */
		System.out.println("소문자를 입력하세요");
		String str = sc.nextLine();
		char c = (char)(str.charAt(0)+32);
		System.out.println(c);
	}
	
	public void method4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오.
		 *  ex) 123 -> 1+2+3 =6 
		 */
		
		System.out.println("3자리 정수 입력");
		String num = sc.nextLine();
		
//		char c1 = num.charAt(0);
//		char c2 = num.charAt(1);
//		char c3 = num.charAt(2);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c1-'0'+c2-'0'+c3-'0');
		
//		int num2 = Integer.parseInt(num);
//		int result = num2/100;
		
		
		
	}
	
	public void method5() {
		/*
		 *  스캐너를 통해서 숫자를 입력 받고. 
		 *  소수점 2째 자리에서 반올림.
		 *  ex) 12.2623 -> 12.3
		 */
		
		
		System.out.println("실수 입력");
		double num = sc.nextDouble();
		num = num+0.5;
		int n1 = (int)num;
//		//12
//		int n1 = (int)num;
//		
//		//0.5623
//		double num2 = num-n1;
//		
//		//1.1246
//		num2 = num2*2; 
//		
//		//  12 +1
//		n1 = n1+(int)num2;
		
	}
	
	
}
