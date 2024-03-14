package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0, 0, 10, 0, 0, 10);
		
		System.out.println(t1);
		
		Point p1 = new Point (0, 0); //이렇게 직접넣어도되고
		Triangle t2 = new Triangle(p1, new Point(10, 0), new Point (0, 10)); //바로 넣어도됨
		
		System.out.println(t2);
		
	}

}
