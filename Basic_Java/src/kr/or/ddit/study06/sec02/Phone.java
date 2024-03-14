package kr.or.ddit.study06.sec02;

public class Phone {
	String name;
	int year;
	String camera;
	
	@Override // 이걸 주석처리하면 주소값이 나온다
	public String toString() {
		return "폰 [이름=" + name + ", year=" + year + ", camera=" + camera + "]";
	} //알트 쉬프트 s 제너레이트 to String ㄱㄱ
	
	
}
