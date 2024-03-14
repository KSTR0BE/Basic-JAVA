package kr.or.ddit.study06.sec02;

public class PhoneExample {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.name = "노트 20";
		p1.year = 2020;
		p1.camera = "500만화소";
		
		Phone p2 = new Phone();
		p2.name = "갤럭시 23";
		p2.year = 2023;
		p2.camera = "1000만화소";
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
