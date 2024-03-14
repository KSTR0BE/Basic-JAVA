package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("클래스를 생성합니다.");
		BigLoadSingleTon bs1 = BigLoadSingleTon.getInstance();
		System.out.println("클래스를 생성합니다.");
		BigLoadSingleTon bs2 = BigLoadSingleTon.getInstance();
		System.out.println("클래스를 생성합니다.");
		BigLoadSingleTon bs3 = BigLoadSingleTon.getInstance();
		Date date2 = new Date();
		BigLoadSingleTon.getInstance();  //알트 쉬프트 A 통편집 가능
		BigLoadSingleTon.getInstance();	//알트 쉬프트 R 같은 변수 명을 동시에 여러개를 전부 바꿀수 있다.
		BigLoadSingleTon.getInstance();
		BigLoadSingleTon.getInstance();
		BigLoadSingleTon.getInstance();
		
		
		System.out.println(date2.getTime() - date.getTime() + "ms");
		
	}

}
