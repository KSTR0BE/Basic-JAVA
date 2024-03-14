package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType03 obj = new ReferenceType03();
		obj.method1();
	}
	
	public void method1() {
		String str1 = ""; // 주소값은 있는데 데이터가 없다.
		String str2 = null; //힙영역에 연결자체가 없다. 주소값이 없다.
	}

}
