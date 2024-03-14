package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Reserve r = Reserve.getInstance();
			System.out.println("1. 예약");
			System.out.println("2. 완료");
			System.out.println("3. 종료");
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.println("예약자명 입력: ");
				Person p = new Person(sc.next());
				r.reservation(p);
			} else if(sel==2){
				r.out();
			}
		}
	}
}
class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
}
class Reserve{ // 1명 예약시스템 만들기
	Person person = null;
	
	
	private static Reserve instance = null;

	private Reserve() {
		

	}

	public static Reserve getInstance() {

		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
	//싱글톤 이용해서 만들기
	
	
	public void reservation(Person P) {
		//예약 했던적이 있는지 검사. 사람클래스 1인숍 1명만 예약가능 사람이 있다라면 예약 x 
		//누구누구님이 예약이 되어있습니다 출력/ 아무도 없으면 예약 가능

		if(person != null) {
			System.out.println(person.name+"이미 예약된 방입니다.");
			return;
		}	
		person = P;
		System.out.println(P.name+"님 예약완료.");

	}
	
	public void out() {
		//완료했다 하면 아웃으로가고 펄슨값이 널로 바뀐다-> 예약가능해지는상태로만들어짐
		if(person == null) {
			System.out.println("아무도 없습니다.");
			return;
		}
		System.out.println(person.name+"님 체크아웃");
		person = null;
	}
	
}
