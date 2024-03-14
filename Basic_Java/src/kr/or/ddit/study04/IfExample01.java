package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample01 obj = new IfExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
	}
	
	
	public void method6() {
		/*
		 *  점수를 입력받고 학점을  출력하시오.
		     90 이상 A, 80 이상 B, 70 이상 c, 60 이상 D, 60미만 F 학점
		 *   0~2 - 
		 *   3~6 0 
		 *   7~9 +
		 *   85 -> B0 출력할것. 
		 */
		
		String grade ="";
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score==100) {
			grade ="A+";
		}
		else if(score>=90) {
			grade = "A";
		}
		else if(score>=80) {
			grade = "B";
		}
		else if(score>=70) {
			grade = "C";
		}
		else if(score>=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		if(score != 100 && score >60) {
			if(score%10>=0  && score%10<=2) {
				grade +="-";
			}
			if(score%10>=3  && score%10<=6) {
				grade +="0";
			}
			if(score%10>=7  && score%10<=9) {
				grade +="+";
			}
		}
		
		
	}
	
	
	
	public void method5() {
		// 점수를 입력받고 학점을  출력하시오.
		// 90 이상 A, 80 이상 B, 70 이상 c, 60 이상 D, 60미만 F 학점
		
		String grade ="";
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score>=90) {
			grade = "A";
		}
		else if(score>=80) {
//		if(score>=80 && score<90) {
			grade = "B";
		}
		else if(score>=70) {
//		if(score>=70 && score<80) {
			grade = "C";
		}
		else if(score>=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println(score +"점은 "+grade+" 학점");
		
		
		
		
	}
	
	public void method4() {
		// 달을 입력 받아서 
		// 봄,여름,가을,겨울을 출력
		// 겨울 12~2 봄 3~5 여름 6~8 가을 9~11 
		
		System.out.println("달을 입력하세요");
		String season ="";
		int month = sc.nextInt();
		if(month == 12 || month ==1 || month==2) {
			season ="겨울";
		}
		// 3보다 크거나 같고 5보다 작거나 같다
		if(month>=3 && month<=5) {
			season = "봄";
		}
		if(month ==6 || month ==7 || month ==8) {
			season ="여름";
		}
		if(month ==9 || month ==10 || month ==11) {
			season ="가을";
		}
		
		System.out.println(month +"월은 "+ season +"입니다.");
		
		
		
		
	}
	
	public void method3() {
		// 점수를 입력받아서 60점 이상이면 합격 
		//                   아니면 불합격을 출력 
		String message;
		System.out.print("점수를 입력하세요");
		int score = sc.nextInt();
		if(score>=60) {
			message ="합격";
		}else {
			message ="불합격";
		}
		System.out.println(score+"점은 "+message);
		
	}
	
	public void method2() {
		// if(조건식){
		//    조건식이 참일때 실행됨.
		//
		// }else{
		//    조건식이 거짓일때 실행됨.
		// }
		System.out.println("1");
		if(false) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println("2");
		
	}
	
	public void method1() {
		// if(조건식){
		//    조건식이 참일때 실행됨.
		//
		// }
		System.out.println("1");
		if(false) {
			System.out.println("실행 됨");
		}
		System.out.println("2");
		
		
	}
	
	
}
