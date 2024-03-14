package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점, 평균, 등수를 구하여 출력하시오.
		
		String[] stuName = {"미연", "민니", "소연", "우기", "슈화"};
		//국어 영어 수학 총점 평균 등수
		//80, 70, 80, 0, 0, 1
		int[][] scores = {{80, 70, 80, 0, 0, 1},
						 {90, 85, 90, 0, 0, 1},
						 {90, 70, 75, 0, 0, 1},
						 {65, 75, 70, 0, 0, 1},
						 {80, 85, 75, 0, 0, 1}};
		// 1 총점구하기
		// 2 평균구하기
		for(int people = 0; people < scores.length; people++) {
			int sum = scores[people][0] + scores[people][1] + scores[people][2];
			scores[people][3] = sum;
			scores[people][4] = sum/3;
		}
		
		// 3 등수구하기
		for(int i = 0; i < scores.length; i++) {
			int rank = 1;
			for(int j =0; j < scores.length; j++) {
				if(scores[j][4] > scores[i][4]) {
					rank++;
				}
			}
			scores[i][5] = rank;
			
		/*
		 * for(int i = 0; i < scores.length; i++) {
		 * 	   for(int j =0; j < scores.length; j++) {
		 * 	1.	  if(scores[i][4] < scores[j][4]) { 평균기준으로 정한거
		 * 	2.	  if(scores[i][3] < scores[j][3]) { 총점기준으로 정한거
		 * 			 scores[i][5]++;
		 */			 
		}
		
		// 4 출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(stuName[i]+"\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 5 정렬하기
		for(int i = 0; i < scores.length-1; i++) {
			for(int j = i; j < scores.length-1; j++) {
				if(scores[j][5] > scores[j+1][5]) { //총점으로 해도됨 [5]-> [3]
					int[] temp  = scores[j];
					scores[j]   = scores[j+1];
					scores[j+1] = temp; //점수 치환
					
					String str   = stuName[j];
					stuName[j]   = stuName[j+1];
					stuName[j+1] = str; //이름 치환
					System.out.println(); 
				}
			}
		}
		
		
		// 6 출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(stuName[i]+"\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("어렵다");
	}
	
}
