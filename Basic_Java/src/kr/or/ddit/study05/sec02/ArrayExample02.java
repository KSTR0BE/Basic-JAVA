package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	
	public void method6() {
		
		int[] array = {1,3,5,2,4};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
	}
	
	
	public void method5() {
	//1차원 배열건너뛰기
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[5];
		
	}
	
	public void method4() {
		int[][] numList1 = new int [5][5];
		
		int k = 1;
		for(int i = 0; i < numList1.length; i++) {
			for(int j = 0; j < numList1[i].length; j++ ) {
				numList1[i][j] = k++;
			}
		}
		
		for(int i = 0; i < numList1.length; i++) {
			for(int j = 0; j < numList1[i].length; j++ ) {
				System.out.print(numList1[i][j]+ "\t");
			}
			System.out.println();
		}
		
		int[][] numList2 = new int [5][5];
		
		for(int i = 0; i < numList2.length; i++) {
			for(int j = 0; j < numList2[i].length; j++ ) {
				numList1[i][j] = i+1 +j*5;
			}
		}
		System.out.println("=========================");
		for(int i = 0; i < numList2.length; i++) {
			for(int j = 0; j < numList1[i].length; j++ ) {
				System.out.print(numList2[i][j]+ "\t");
			}
			System.out.println();
			
		}
		
		
		int[][] numList3 = new int [5][5];
		
		int k3 = 1;
		for(int i = 0; i < numList3.length; i++) {
			for(int j = 0; j < numList3[0].length; j++ ) {
				if(i%2==0) {
					numList3[i][j] = k3++;
				} else {
					numList3[i][numList3[0].length-1-j] = k3++;
				}
				
			}
		}
		System.out.println("=========================");
		for(int i = 0; i < numList2.length; i++) {
				for(int j = 0; j < numList1[i].length; j++ ) {
					System.out.print(numList2[i][j]+ "\t");
				}
		}
		
		
	
				
		
		
	}
	
	
	public void method3() { //2차원배열에 바로 값넣는법
		int[][] scoreList = { {100, 70, 98}, 
							  {85, 80, 60}, 
							  {100, 68, 84}, 
							  {98, 77, 80}, 
							  {57, 97, 99} };
	
		//국어 점수 총합 구하기
		int kor_sum = 0;
		for(int i = 0; i < scoreList.length; i++) {  // scoreList안에있는 길이는 3이고 인덱스는 0 1 2 3개라 스코어 길이로 해도 된다.
			kor_sum += scoreList[i][0];
		}
		System.out.println("국어 총점 : " + kor_sum);
	
		// 영어 점수 평균 구하기
		double eng_sum = 0;
		for(int i = 0; i < scoreList.length; i++) {
			eng_sum += scoreList[i][1];
		}
		eng_sum = scoreList.length;
		System.out.println("영어 평균 : " + eng_sum/5);
		
		//각 사람별  평균 구하기
		for(int i = 0; i < scoreList.length; i++) {
			double avg = 0;
			for(int j =0; j < scoreList[i].length; j++) {
				avg += scoreList[i][j];
			}
			System.out.println(i+1+"번째 학생의 평균은 : " + avg/scoreList[i].length);
			
		}
		
	}	
	
	
	public void method2() {
		
		//5명의 국어 영어 수학 점수 만들기.
		
		//1. 1차원 배열5개 만들기
		int [] score1 = {100, 70, 98};
		int [] score2 = {85, 80, 60};
		int [] score3 = {100, 68, 84};
		int [] score4 = {98, 77, 80};
		int [] score5 = {57, 97, 99};
		
		int[][] scoreList = new int[5][3];
		scoreList[0] = score1;
		scoreList[1] = score2;
		scoreList[2] = score3;
		scoreList[3] = score4;
		scoreList[4] = score5;
		
		// 1번째 학생의 국어 점수 출력
		int firstKor =scoreList[0][0]; //스코어1에 있는 0번을 뽑을 수 있다.
		System.out.println("1번째 학생의 국어 점수 : " + firstKor);
		
		// 2번째 학생의 수학 점수 출력
		int secondMath = scoreList[1][2];
		System.out.println("2번째 학생의 수학 점수 : " + secondMath);
		
		// 3번째 학생의 영어 점수 출력
		int thirdEng = scoreList[2][1];
		System.out.println("3번째 학생의 영어 점수 : " + thirdEng);
		
		// 4번째 학생의 총점 구하기.
		int sum = 0;
		for(int i = 0; i < scoreList[3].length; i++) { //scoreList[3]세로길이 x 가로 길이
			sum += scoreList[3][i];
		}
		System.out.println("4번째 학생의 총점 : " + sum);
		// 5번째 학생의 평균 구하기
		int avg = 0;
		for(int i = 0; i < scoreList[4].length; i++) {
			avg += scoreList[4][i];
		}
		System.out.println("5번째 학생의 평균 : " + avg/3.0);
		
		
		
	}
	
	
	public void method1() {
		
		int[][] arr = new int [3][3]; //앞에 몇다스를 담는지(배열갯수), 배수 뒤 연필이몇갠지
		
		int[] sub1 = new int [3];
		int[] sub2 = new int [3];
		int[] sub3 = new int [3];
		
		arr[0] = sub1; //배열에 배열을 담을 수 있다. 한박스에 한다스 10개
		arr[1] = sub2;
		arr[2] = sub3;
		
		
	}
}
