package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
//		obj.method01();
		obj.method02();
//		obj.method03();
//		obj.method04();
		
	}
	
	public void method01() {
//		/*
//		 * 스캐너를 통해입력 받은 단의 구구단 출력
//		 * ex) 4
//		 * 4*1= 4
//		 * 4*2= 8
//		 */
		System.out.println("출력할 구구단을 입력.");
		int dan = sc.nextInt();
			for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
	
	public void method02() {
		/*
		 * 구구단 전체 출력
		 * 2*1= 2 3*1 = ..... 9*1=9
		 * 2*2= 4 ...........9*2 =18
		 * 
		 * 2*9=8............9*9=81
		 */
		
		for(int num= 1; num <= 9; num++) {
			for(int i = 2; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", i, num, num * i);
			}
			System.out.println("");
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.println(j+"*"+i+"="+j*i+"\t");
//			}
//			System.out.println();
			
		
		}
		
	}
	
	public void method03() {
		/*
		 * 구구단 전체 출력
		 * 입력 받은 단 제외
		 * ex) 4
		 */
		System.out.println("구구단 단을 입력하세요");
		int all = sc.nextInt();
		for(int num= 1; num <=9; num++) {
			for(int i = 2; i <= 9; i++) {
				if(i !=all) {
					System.out.printf("%d * %d = %d\t", i, num, num * i);
				} else {
			}
			System.out.println("");
			}
	/*	for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
	 *			if(j!=dan)
	 *				System.out.println(j+"*"+i+"="+j*i+"\t");
	 */
		}
	}
	
	public void method04() {
		/*
		 * 스캐너를 통해서 숫자를 입력 받고
		 * 홀수일 경우
		 * ex) 11: 1+3+5+7+9+11
		 * 
		 * 짝수일 경우
		 * ex) 8: 2*2 + 4*4 + 6*6 + 8*8
		 * 
		 */
		System.out.println("숫자를 입력하세요 : ");
		int sum = 0;
		int num = sc.nextInt();
			if(num%2==1) {
				for(int i = 1; i <=num; i+=2) {
					sum += i;
						
				}
			}else{
				for(int i =2; i <=num; i+=2) {
				if(num%2==0) {
					sum += i * i;
					
				}
	/*	int num = sc.nextInt();
	 * 	int sum = 0;
	 * 	if(num%2==1) {
	 * 		for(int i=1; i<=num; i+=2) {
	 * 			sum+=i;
	 * 		}
	 * 	}
	 * 	if(num%2==1) {
	 * 		for(int i=2; i<=num; i=+2) {
	 * 			sum+=i*i
	 * 
	 */
				
			}
}
		System.out.println(sum);
	}

}
