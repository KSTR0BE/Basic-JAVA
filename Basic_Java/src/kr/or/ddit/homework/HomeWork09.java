package kr.or.ddit.homework;

public class HomeWork09 {
	
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.method1();
	}
	
	public void method1() {
		//학생 5명을 만들고각각 데이터를 입력할것.
		Student s1 = new Student();
		s1.name = "미연";
		s1.kor = 80;
		s1.eng = 70;
		s1.math = 80;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = s1.sum/3;
		s1.rank = 1;
		
		Student s2 = new Student();
		s2.name = "민니";
		s2.kor = 90;
		s2.eng = 85;
		s2.math = 90;
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = s2.sum/3;
		s2.rank = 1;
		
		Student s3 = new Student();
		s3.name = "소연";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 75;
		s3.sum = s3.kor + s3.eng + s3.math;
		s3.avg = s3.sum/3;
		s3.rank = 1;
		
		Student s4 = new Student();
		s4.name = "우기";
		s4.kor = 65;
		s4.eng = 75;
		s4.math = 70;
		s4.sum = s4.kor + s4.eng + s4.math;
		s4.avg = s4.sum/3;
		s4.rank = 1;
		
		Student s5 = new Student();
		s5.name = "슈화";
		s5.kor = 80;
		s5.eng = 85;
		s5.math = 75;
		s5.sum = s5.kor + s5.eng + s5.math;
		s5.avg = s5.sum/3;
		s5.rank = 1;
		
		Student[] scores = {s1, s2, s3, s4, s5};
		
		//총점 구하기
		//평균 구하기
		//등수 구하기
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores.length; j++) {
				if(scores[i].avg < scores[j].avg) {
					scores[i].rank++;
				}
			}
		}
		
		//출력하기
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
//		System.out.println("===================================================");
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		//정렬하기
		for(int i = 0; i < scores.length -1; i++) {
			for(int j = 0; j < scores.length -1; j++) {
				if(scores[i].rank > scores[j+1].rank) {
					Student temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
					
				}
			}
		}
		
		//출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}
	
	class Student{
		//홈워크 8번에 각 데이터를 타입으로 입력할 것
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		int rank;
		@Override
		public String toString() {
			return name + "\t" +  kor + "\t" +  eng + "\t" +  math + "\t" + sum
					+ "\t" + avg + "\t" + rank;
		}
		
	}
	
}
