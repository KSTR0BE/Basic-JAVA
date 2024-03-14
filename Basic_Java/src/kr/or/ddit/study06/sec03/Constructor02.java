package kr.or.ddit.study06.sec03;

public class Constructor02 {
	
	String a;
	String b;
	
	public Constructor02() { // this는 파라미터 맞는 갯수를 찾아간다. 그래서 밑에로 넘어감
		this("a");
	}
	
	public Constructor02(String a) {
		this(a, "b");
	}

	public Constructor02(String a, String b) {
		this.a = a;
		this.b = b;
	}

}
