package kr.or.ddit.study06.sec06;

public class Person {
	//이름 나이 성별 타입 을 각각 선언
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	public Person() {
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		if(age < 0) {
			System.out.println("입력할 수 없는 데이터 입니다.");
			return;
		}
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
