package kr.or.ddit.homework.home10;

public class Grade {
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = sum/3.0;
	}

	@Override
	public String toString() {
		return "Grade [총점 = " + sum + ", 평균 = " + avg + "]";
	}
	
	
}
