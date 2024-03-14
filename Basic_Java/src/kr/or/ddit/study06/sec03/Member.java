package kr.or.ddit.study06.sec03;

public class Member {
	String nation;
//	String nation= "한국";디폴트 값을 지정가능하다
	String group;
	String name;
	int age;
	
	//국가 그룹 이름 나이 입력
	public Member (String nation, String group, String name, int age) {
		this.nation = nation;
		this.group = group;
		this.name = name;
		this.age = age;
	}
	//그룹 이름 나이 <- 국가 기본값 한국
	public Member (String group, String name, int age) {
		this("한국", group, name, age);
	}
	
	//이름 나이 <- 기본 값 304호
	public Member (String name, int age) {
		this("304호", name, age);
	}
}
