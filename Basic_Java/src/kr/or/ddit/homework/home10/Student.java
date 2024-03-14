package kr.or.ddit.homework.home10;

public class Student {
	String subject;
	int num;
	
	public Student(String subject, int num) {
		this.subject = subject;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [과목 = " + subject + ", 학번 = " + num + "]";
	}
	

}
