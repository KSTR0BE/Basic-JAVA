package kr.or.ddit.study10;

import java.util.Scanner;

/*
 * 
 * throw : 예외 강제 발생
 * 		- 일반 메소드 내부에서 사용
 * 		- 사용 형식
 * 		 throw 예외 클래스
 * 		 ex) throw new Exception();
 * 
 * throws : 예외 미루기
 * 		 try ~ catch 블록을 예외 발생 가능성이 있는 명령문이 있는 곳에서
 * 		 처리하지 않고
 * 
 * 
 * 		 해당 메소드를 호출한 곳에서 예외처리를 강요할때 사용.
 * 
 * 		 메소드명() throw 예외클래스명 {
 * 
 * 
 * 		 }
 * 
 * 
 */
public class ThrowsExample {
	static String[] name = {"홍길동", "이순신", "강감찬"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			String n;
			try {
				n = getArray(num);
			} catch (Exception e) {
				System.out.println("숫자가 범위를 벗어 났습니다.");
				continue;
				
			}
			System.out.println("회원 이름" + n);
			break;
		}
	}
	public static String getArray(int num) throws ArrayIndexOutOfBoundsException {
		return name[num];
		
	}
}
