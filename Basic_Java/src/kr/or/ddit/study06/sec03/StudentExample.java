package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		//학생 2명의 클래스를 생성하고 데이터 입력하기
		
		Student stu1 = new Student(); //1.생성자 만들기
		stu1.name = "장민";
		stu1.phone = "010-3554-6544";
		stu1.gender = "남";
		
		Student stu2 = new Student("이태희", "010-5465-8546", "여"); //생성을 하면서 바로 데이터를 입력받음
		
		
		
	}

}
