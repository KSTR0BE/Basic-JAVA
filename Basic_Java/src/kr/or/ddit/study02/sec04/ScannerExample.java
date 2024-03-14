package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScannerExample {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.method1();
//		obj.method2();
	}
	
	
	public void method2() {
		System.out.println("메소드 2");
	}
	
	public void method1() {
		// 국영수 점수 입력 받아 int로 변환 -> Integer.parseInt사용
		System.out.println("국어 점수를 입력하세요 : ");
		String kor_str = sc.nextLine();
		int kor = Integer.parseInt(kor_str);
		
		System.out.println("영어 점수를 입력하세요 : ");
		String eng_str = sc.nextLine();
		int eng = Integer.parseInt(eng_str);
		
		System.out.println("수학 점수를 입력하세요 : ");
		String math_str = sc.nextLine();
		int math = Integer.parseInt(math_str);
		
		
		// 점수 총합 구하기
		int sum = kor+math+eng; 
		// 평균 구하기.
		double avg = sum/3.0;
		System.out.println("총점은 : "+sum+", 평균은 : "+avg );
		
		
		
	}
	
}
