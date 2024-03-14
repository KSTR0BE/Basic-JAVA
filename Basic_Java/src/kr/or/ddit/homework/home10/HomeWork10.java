package kr.or.ddit.homework.home10;

public class HomeWork10 {
	public static void main(String[] args) {
		//home 10 패키지에 클래스를 만들어서 제출 할 것.
		HomeWork10 hw = new HomeWork10();
		hw.method1();
//		hw.method2();
//		hw.method3();
//		hw.method4();
	}
	public void method4() {
		//원통을 나타내는 Cylinder 클래스는 Circle 형의 원과
		//실수형의 높이를 필드로 선언
		//원의 넓이
		//부피를 자동계산 할 것.
		Cylinder c2 = new Cylinder(5, new Circle(20));
		System.out.println(c2);
		//부피 구하는 공식 pi*r*r * 높이
		
		
		
	}
	
	
	public void method3() {
		//세과목의 성적을 입력 받고 총점과 평균을 출력할 수 있는 Grade 클래스를 설계하시오.
		Grade grade = new Grade(80, 75, 60);
		System.out.println(grade);
		
	}
	
	
	public void method2() {
		//제조사 생산년도 크기를 출력하는 Tv클래스를 설계 하시오.
		Tv tv = new Tv("삼성", 2024, 65);
		System.out.println(tv);
		
	}
	
	
	public void method1() {
		// 1.다음을 만족하는 Student 클래시를 작성하시오.
		// String 학과 정수형의 학번을 필드로 선언
		// 해당 메소드에서 클래스를 생성 및 적당한 값을 입력후 출력
		Student stu = new Student("국어국문학과", 1753035);
		System.out.println(stu);
		
	}
}
