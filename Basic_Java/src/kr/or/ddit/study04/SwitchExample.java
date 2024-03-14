package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}
	
	public void method3() {
		// 각 달을 입력하여 끝자리를 출력하세요. 
		// 1,3,5,7,8,10,12 : 31일
		// 4,6,9,11  : 30일 
		// 2 : 28, 29일
		System.out.println("달을 입력하세요");
		int month = sc.nextInt();
		switch (month) {
		case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("끝자리 31일");
			break;
		case 4: case 6 : case 9 : case 11 :
			System.out.println("끝자리 3일");
			break;
		case 2:
			System.out.println("끝자리 28, 29일");
			break;	
		default:
			break;
		}
		
		
	}
	
	
	public void method2() {
		// 국가 영문 약자를 입력 받고 국가명을 출력   
		// kor -> 한국 
		// jpn -> 일본
		// chn -> 중국
		
		String nation = sc.nextLine();
		switch (nation) {
		case "kor":
			System.out.println("한국");
			break;
		case "jpn":
			System.out.println("일본");
			break;
		case "chn":
			System.out.println("중국");
			break;
		default:
			break;
		}
		
		
	}
	
	
	public void method1() {
		System.out.print("회원 등급코드(1-3) : ");
		int grade = sc.nextInt(); 
		
		switch (grade) {
		case 1:
			System.out.println("VIP 회원입니다.");
			break;
		case 2:
			System.out.println("우수 회원입니다.");
			break;
		case 3:
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("잘못된 등급입니다.");
			break;
		}
		
		
	}
	
}
