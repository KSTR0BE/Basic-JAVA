package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process1();
	}
	
	public void process1() {
		/*
		 * 6개의 단어가 제공되며
		 * 이중 임의의 단어가 선택된다.
		 *	
		 * 사용자는 이를 보고 원래의 단어를 입력한다.
		 * 사용자가 단어를 맞출때까지 반복하며 단어를 맞추었을때
		 * 출력
		 */
		String[] words = {"deserve", "cart", "fright", "scrub", "amount", "laugh"};
		
//		int ran = new Random().nextInt(words.length);
//		(int)(Math.random()*words.lenght); 두 지문은 같은 뜻
		
		// 0~5까지 값이랜덤으로 나옴 5는 laugh
		int ran = new Random().nextInt(words.length);
		String select = words[ran];
		
//		//toCharArray : 문자열 -> 문자 배열로 변환
		char[] ch = select.toCharArray();
		for(int i = 0; i < 1000000; i++) {
			int ran2 = new Random().nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = temp;
		}
		System.out.println(ch);
	/*
	 * 	int count = 0;
	 * 	while(true) {
	 * 		for(int i = 0; i < ch.length; i ++) {
	 * 			System.out.print(ch[i])
	 * 		}
	 * 		System.out.println();
	 * 		System.out.print("영어 단어 입력: ");
	 * 		String answer = 
	 * 
	 */
		
		
		
		
		
		int count = 0;
		while(true) {
			System.out.println("정답을 입력하세요.");
			String answer = sc.nextLine();
			count += 1;
			if(select.contentEquals(answer)) {
					break;
			}
		}
		System.out.println(count + "회 시도에 정답.");
	}
}

		
		
		
//		
//		
//		int a = 0;
//		int b = 1;
//		System.out.println("a :" + a + " b: " + b);
		
//		int temp = a;
//		a		 = b;
//		b		 = temp; //값 치환할때 새로운 변수를 통해 바꾼다.
//		System.out.println("a :" + a + " b: " + b);
		
		
//		String[] words = {"t", "a", "r", "c"}
//		char[] ch = select.toCharArray();
//		for(int i = 0; i < 1000000; i++) {
//			int ran2 = new Random().nextInt(ch.length);
//			char temp = ch[0];
//			ch[0] = ch[ran2];
//			ch[ran2] = temp;
//			
			
			
			//예시 cart tarc를 주는데 cart로 맞출때까지 반복실행
			//문제 출력하기/
			
			//스캐너를 입력받기
			
			//스캐너 입력 받은 값과 정답 비교하기
			
			//정답이라면 while문 종료
			
		
		//시행 횟수 출력
		//System.out.println();
	
