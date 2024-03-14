package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}
	
	public void process() {
		// 0 -> 가위 1 -> 바위 2 -> 보 
		
		// 컴퓨터가 랜덤으로 내는 가위 바위 보랑 
		// 내가 입력한 가위 바위 보를 비교해서 승패를 출력 하시오 
		
		// ex) 컴퓨터 : 가위, 사람 : 보 
		//     -> 결과 졌다/이겼다/비겼다.
		
		// math 랜덤을 사용해서 컴퓨터가 가위바위보를 내게 할것.
		
		while(true) {
			int com = (int) (Math.random()*3);
			if(com==2)break;
			System.out.println(com);
		}
	}
}
