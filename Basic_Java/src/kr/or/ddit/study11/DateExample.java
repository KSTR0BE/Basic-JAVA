package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
		
	}
	public void method6() {
		Calendar cal = Calendar.getInstance();//캘린더는 싱글톤형식으로 돼있다.
		//cal.add
//		cal.add(Calendar.HOUR, -2); //뒤 숫자를 더하거나 뺌
		//car.set
		cal.set(Calendar.YEAR, 2025);// 뒤 숫자를 정함
		Date date = cal.getTime();
		System.out.println(date);
	}
	
	
	
	public void method5() {
		//앞으로 100일 뒤는 몇일일까
		Date d1 = new Date();
		System.out.println(d1);
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = (long)(day*365);
		Date d2 = new Date(d1.getTime()+1000);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String result = sdf.format(d2.getTime()+100*day);
		System.out.println(result);
		//디버그 f6은 한줄한줄보는거 f8은 멈추는곳까지 스킵하고넘어감
	}
	
	public void method4() {
		String str = "2024.09.23";
		//String ->Date
		//parse(String)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
//			long sec = 1000;
//			long min = sec*60;
//			long hour = min*60;
//			long day = hour*24;
//			long year = (long)(day*365);
			Date date = sdf.parse(str);
			Date cur = new Date();
			long time = date.getTime()- cur.getTime();
			System.out.println("수료일 까지 " + time/1000/60/60/24 + "일 남았습니다.");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void method3() {
		Date date = new Date();
		
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss"); 
		//Date -> String
		//format(Date)
		String result = sdf.format(date);
		System.out.println(result); //날짜는 오라클 자바 리눅스 MySQL등 다 다르다
		
	}
	
	public void method2() {
		//Date의 getTime은 특정 지점으로부터 지난 시간이다.
		//몇년 몇일 몇시간 몇분 몇초 지났는지 출력해보시오.
		Date date = new Date();
		long time = date.getTime();
		
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = (long)(day*365);
		
		System.out.print(time/year+"년 ");
		time%=year;
		System.out.print(time/day+"일 ");
		time%=day;
		System.out.print(time/hour+"시 ");
		time%=hour;
		System.out.print(time/min+"분 ");
		time%=min;
		System.out.print(time/sec+"초 ");
		time%=sec;
		
		
		
		
		
	}
	
	
	public void method1() {
		Date date = new Date();
		System.out.println(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		System.out.println(date2);
		long time = date2.getTime() - date.getTime();
		System.out.println(time);
		
		System.out.println(date.getTime());
		
		
		
	}

}
