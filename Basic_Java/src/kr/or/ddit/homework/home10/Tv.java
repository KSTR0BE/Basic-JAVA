package kr.or.ddit.homework.home10;

public class Tv {
	String company;
	int year;
	double size;
	
	public Tv(String company, int year, double size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [회사 = " + company + ", 년도 = " + year + ", 사이즈 = " + size + "]";
	}
	
	

}
