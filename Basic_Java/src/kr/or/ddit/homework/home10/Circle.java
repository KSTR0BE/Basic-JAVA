package kr.or.ddit.homework.home10;

public class Circle {
	double pi =Math.PI;
	double radious;
	double area;
	
	//원의 넓이 구하는 생성자 만들것.
	// 원의 넓이 r*r*pi
	public Circle(double radious) {
		this.radious = radious;
		this.area = pi*radious*radious;
	}
	
	

}
