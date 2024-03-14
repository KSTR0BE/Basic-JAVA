package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "학생";
		stu1.kor = 80;
		stu1.eng = 90;
		stu1.math = 85;
		stu1.avg = (stu1.kor+stu1.eng+stu1.math)/3.0;
		
		
		System.out.println(stu1.name + ", " + stu1.kor + ", " + stu1.eng + ", " + stu1.math + ", " + stu1.avg);
		
		Student stu2 = new Student();
		stu2.name = "무야호";
		stu2.kor = 90;
		stu2.eng = 90;
		stu2.math = 85;
		stu2.avg = (stu2.kor+stu2.eng+stu2.math)/3.0;
		
		
		System.out.printf("이름 %s , 국어: %d, 영어: %d, 수학: %d, 평균: %f ", stu2.name, stu2.kor, stu2.eng, stu2.math, stu2.avg);
		//%s 문자열 %d 정수 %f 실수
	}

}
