package kr.or.ddit.study06.sec03;

public class Student {
	String name;
	String phone;
	String gender;
	
	public Student() {
		
	}
	
	public Student(String name, String phone, String gender) { //괄호안에있는것을 파라미터 파라미터에 따라 호출하는게 달라짐
		this.name = name; //this는 생성자 클래스 그 자체인 name을 의미함 //이름만 같게 할수있지만 일반적으로 파라미터 name과 this name을 같게함
		this.gender = gender;
		this.phone = phone;
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(gender);
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.gender);
		
	}
}
