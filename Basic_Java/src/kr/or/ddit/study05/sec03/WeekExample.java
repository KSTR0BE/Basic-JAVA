package kr.or.ddit.study05.sec03;

//import java.util.Scanner;

public class WeekExample {
	public static void main(String[] args) {
		//월화수목금토일을 입력을 각각 받고
		//출력하는 프로그램 만들기/
		//월 =1, 화 =2, ... 일 =7
		
//		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		
//		if(num==1) System.out.println("월요일입니다.");
//		if(num==2) System.out.println("화요일입니다.");
//		if(num==3) System.out.println("수요일입니다.");
//		if(num==4) System.out.println("목요일입니다.");
//		if(num==5) System.out.println("금요일입니다.");
//		if(num==6) System.out.println("토요일입니다.");
//		if(num==7) System.out.println("일요일입니다.");
		
//		String str = sc.next();
//		if(str.equals("mon")) System.out.println("월요일입니다.");
//		if(str.equals("tue")) System.out.println("화요일입니다.");
//		if(str.equals("wed")) System.out.println("수요일입니다.");
//		if(str.equals("thu")) System.out.println("목요일입니다.");
//		if(str.equals("fri")) System.out.println("금요일입니다.");
//		if(str.equals("sat")) System.out.println("토요일입니다.");
//		if(str.equals("sun")) System.out.println("일요일입니다.");
		
//		Week week = Week.MON;
//		if(Week.MON == week) System.out.println("월요일입니다."); //타입을 명확하게 정의할때 enum을 사용한다.
//		
		for(Week week : Week.values()) {
			System.out.println(week + ", " + week.kor);
		}
		
		
		
		
		
	}

}
