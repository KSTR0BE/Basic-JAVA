package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle circle = new Circle();
		double r = 10;
		System.out.println("반지름 " + r + "짜리 원의 넓이는 " + circle.area(r));
		System.out.println("반지름 " + r + "짜리 원의 둘레는 " + circle.circumference(r));
		
		
	
		
		
		
	}
	//반지름을 매개변수 (파라미터)로 받아 넓이를 구하는 메소드를 작성하시오
	// r*r*pi
	public double area(double r) {
		return r*r*Math.PI;
	}
	//반지름을 매개변수 (파라미터)로 받아 원의 둘레를 구하는 메소드를 작성하시오
	// r*pi*2
	public double circumference(double r) {
		return r*2*Math.PI;
	}
}
