package kr.or.ddit.study06.sec03;
	
public class Tv {
	String company;
	int year;
	double size;
	
	public Tv(String company, int year, double size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}

	@Override // 부모클래스가 만든 내용이 맘에 안들면 재정의한다.
	public String toString() { //알트 쉬프트 s to String 제너레이트
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
	

}
