package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	public static void main(String[] args) {
		HomeWork17 hw = new HomeWork17();
		hw.process();
	}
	
	public void process() {
		//달력 출력하기.
		//다음달을 입력하면 다음달 달력 출력
		//이전달을 입력하면 이전달 달력 출력
		//오늘에 해당하는 요일을 알아야 된다.
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		
		while(true) {
			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH)+1;

			System.out.println("======================= "+year+"년 "+month+"월 =======================");
			System.out.println("<이전달                                                                                          다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("========================================================");
			
			//달의 마지막 일
			int last = cal.getActualMaximum(Calendar.DATE);
			int day = cal.get(Calendar.DAY_OF_WEEK); //요일 구하는 방법 일1, 월2...토7
			
			//첫날까지 공백채우기
			if(day<7) {
				for(int i = 0; i < day; i++) {
					System.out.print("\t");
				}		
			}
			//날짜 출력
			for(int i = 1; i <=last; i++) {
				if((day+i-1)%7==0) {
					if(day>=7 && i>=7) System.out.println();
					else if(day !=7) System.out.println();
				}
				System.out.print(i + "\t");
			}
			String select = sc.next();
			if(select.equals("<"))
				cal.add(Calendar.MONTH, -1);
			else if(select.equals(">"))
				cal.add(Calendar.MONTH, +1);
			else if(select.equals("종료"))
			break;
		}
	}
}
