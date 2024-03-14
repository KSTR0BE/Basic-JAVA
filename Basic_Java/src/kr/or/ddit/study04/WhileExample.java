package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method01();
//		obj.method02();
//		obj.method03();
		obj.method04();
		
	}
	public void method04() {
		int i = 1;
		do {
			System.out.println(i++ + "번 실행");
		} while (i<10);
		
		
	}
	
	public void method03() {
		String menu ="** 커피메뉴 **\n";
		menu += "1. 아메리카노\t 3000원\n";
		menu += "2. 카페라떼\t 3500원\n";
		menu += "3. 카라멜 마끼아또\t 4000원\n";
		menu += "4. 딸기 에이드\t 4000원\n";
		menu += "5. 종료\n";
//		for(; ;) { for문을 while문과 같게 쓸때	
		int sum =0;
		String bill ="";
		while(true) {
			System.out.println(menu);
			System.out.println("음료를 선택 하세요.");
			int choice = sc.nextInt();
			if(choice ==1) {
				sum +=3000;
				bill +="아메리카노\n";
			}
			if(choice ==2) {
				sum +=3500;
				bill +="카페라떼\n";
			}
			if(choice ==3) {
				sum +=4000;
				bill +="카라멜 마끼아또\n";
			}
			if(choice ==4) {
				sum +=4000;
				bill +="딸기 에이드\n";
			}
			if(choice ==5) {
				break;
			}
		}
		System.out.println("총 결제금액은 : "+sum);
		System.out.println("---------------");
		System.out.println(bill);
		
	}
	
	public void method02() {
		int i =0;
		while(i>0) {
			i=i+100;
			if(i<0) break;
			System.out.println(i);
		}
	}
	
	public void mothod01() {
		
		
		System.out.println("10번 찍어 안넘어가는 나무 없다.");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i+"번");
		}
		System.out.println("나무가 넘어갔습니다.");
		
		
	}
}
