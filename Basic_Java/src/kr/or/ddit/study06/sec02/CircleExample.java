package kr.or.ddit.study06.sec02;

public class CircleExample {
	public static void main(String[] args) {
		// 클래스 하나 생성 후 데이터를 입력 및 출력 할것.
		// 원의 넓이 = pi*r*r
		double PI = Math.PI;
		System.out.println(PI);
		
		Circle c1 = new Circle(); //객체를 하나 만든다 클래스 자체도 하나의 타입이다.
		c1.x = 0; //타입이다
		c1.y = 0;
		c1.r = 10;
		c1.area = c1.r*c1.r*PI;
		
		System.out.println(c1);
		
		

		
	}

}
