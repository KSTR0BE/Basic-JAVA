package kr.or.ddit.study05.sec03;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double result1 = cal.cal(3, CalType.ADD, 4);
		double result2 = cal.cal(3, CalType.SUB, 4);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
