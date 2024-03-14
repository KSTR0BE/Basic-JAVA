package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
//		p1.name = "홍길동";
		p1.setName("홍길동");
//		p1.gender ="남";
		p1.setGender("남");
		p1.setAge(20);
		System.out.println("나이를 입력하세요");
		
//		
//		Person p2 = new Person();
//		p2.name = "홍길동2";
//		p2.gender ="남";
//		System.out.println("나이를 입력하세요");
		
		
	}
}

