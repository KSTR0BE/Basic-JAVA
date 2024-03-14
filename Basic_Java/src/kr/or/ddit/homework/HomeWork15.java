package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
		hw.process();
	}
	
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		//주사위 던진 전체 값을 히스토그램으로 나타내기
		/* 주사위 랜덤값 1~6하나 던지고1~6짜리 하나 더 던지게
		 * 		몇개나왔나 퍼센트로
		 *    2:** 
		 *    3:****
		 *    4:******
		 * 	  5:********
		 * 	  6:**********
		 *    7:*************
		 *    8:**********
		 *    9:********
		 * 	 10:******
		 * 	 11:****
		 *   12:**
		 */

		System.out.println("시행횟수를 입력하세요.");
		long num = sc.nextInt();
		rollNum(num);
		
		
		
	}
	
	public int throwOneDice() {
		int ran1 = (int)(Math.random()*6)+1;
		return ran1;
		
	}
	public int throwTwoDice() {
		return throwOneDice()+throwOneDice();
	}
	
	
	
	// 시행 회수 n 리턴 값 완성
	public void rollNum(long num) {
		double[] Result = new double[11];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int n = throwTwoDice();
			Result[n - 2]++;
		}
		
		for (int i = 0; i < 11; i++) {
			sum += Result[i];
		}
		
		for (int i = 0; i < 11; i++) {
			Result[i] = Math.round((double) Result[i] / sum * 100);
			System.out.print("합 "+(i+2)+"\t");
			for (int j = 0; j < Result[i]; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
	
}
