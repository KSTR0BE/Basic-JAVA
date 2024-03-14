package kr.or.ddit.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년은 365.2422일이다. 
		// 1년은 xxx일 x시간 x분 x초 입니다. 출력 할것
		
		double year = 365.2422;
		
		int days = (int)year; //year 을 정수값으로만 표현
		year = (year-days)*24; //-> 365x24
		
		int hours = (int)year;
		year = (year-hours)*60;
		
		int mins = (int)year;
		year =(year-mins)*60;
		
		int secs = (int)year;
		
		System.out.println(days+"일 "+hours+"시 "+mins+"분 "+secs +"초");
//		System.out.println(hours);
//		System.out.println(mins);
//		System.out.println(secs);
		
		
	}
}
