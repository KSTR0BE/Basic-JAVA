package kr.or.ddit.study06.sec04;

import java.util.Date;

public class MethodTest6 {
	public static void main(String[] args) {
		MethodTest6 mt = new MethodTest6();
		mt.process();
	}
	
	
	public void process() {
//		System.out.println(method1(10));
//		System.out.println(sum(10));
		
		Date d1 = new Date();
		
		System.out.println(febo(50));
		
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime()+"ms");
	}
	
	public int method1(int num) {
		// 1*2*3*...10
//		int mul = 1;
//		for(int i = 1; i <=10; i++) {
//			mul *= i;
//		}
		if(num == 1) return 1;
		
		return num*method1(num-1);
	}
	
	
	public int sum(int num) {
		//1+2+3+...+num
		
		if(num == 1) return 1; //재귀함수는 반드시 종료조건을 적어줘야한다.
		return num + sum(num-1);
		// return num == 1 ? 1: num + sum(num-1); 제일 간단한식
		
	}
	
//	public void findFile(File file) { 폴더인지 파일인지 찾기
//		if(file.isDirectory()) { 파일이면 쭈욱찾는다
//			findFile(file); 파일안에 폴더다 하면 다시 폴더안에 파일을 쭉
//		} else {
//			System.out.println(file); 
//		}
//	}
//	
//	
	
	
	//피보나치 수열 구하기.
	// 1 1 2 3 5 8 13 21 34 55...
	// 2= 1+1
	// 3= 2+1
	// 5= 3+2
	//앞의 두 수를 합하면 그다음 수가 나온다
	
	long[] feboResult = new long[10000]; //이미계산한 결과값은 이 배열에 저장한다. 중복계산방지
	
	public long febo(int num) {
		if(num<=2) return 1;
//		return febo(num-1)+febo(num-2);
		long f1 = 0;
		long f2 = 0;
		if(feboResult[num-1] != 0) {
			f1 = feboResult[num-1];
		} else {
			f1 = febo(num-1);
			feboResult[num-1] = f1;
		}
		if(feboResult[num-2] != 0) {
			f2 = feboResult[num-2];
		} else {
			f2 = febo(num-1);
			feboResult[num-2] = f2;
		}
		return f1+f2;
	}
	
}
