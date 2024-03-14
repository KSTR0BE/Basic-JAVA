package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
//		obj.method8();
//		obj.method9();
		}
	
	
	public void method9() {
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
			
		for(int i = 0; i < num.length-1; i++) {
			int minIndex = i;
			for(int j = i; j < num.length; j++ ) {
				if(num[j] < num[minIndex]) {
					minIndex =j;
				}
			}
			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}
		System.out.println(Arrays.toString(num));
			
			
	}
		
		
	public void method8() {
		// 버블정렬 //버블정렬 제일 간단한 알고리즘이지만 제일 느림
		// 원본 자료가 n개일때 n-1차 운행한다.
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은 값을 앞에 위치시킴
		// 버블 정렬이 완료되면 반복문을 종료시킨다.
			
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
			
		for(int i = 0; i < num.length-1; i++) { //맨마지막숫자를 앞으로땡겨오려고 총 길이 -1을 한거다.
			boolean flag = true; // 정렬이 끝나면(값이 안바뀌면)밑for문을 안한다.
			for(int j = 0; j < num.length-1; j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = false; //값을 바뀌면 위로
				}
			}
			if(flag) break; //정렬이 종료되면 for문을 종료한다.
		}
			
		
		
	}	public void method7() {
		// 버블정렬 //버블정렬 제일 간단한 알고리즘이지만 제일 느림
		// 원본 자료가 n개일때 n-1차 운행한다.
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은 값을 앞에 위치시킴
		
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length-1; i++) { //맨마지막숫자를 앞으로땡겨오려고 총 길이 -1을 한거다.
			for(int j = 0; j < num.length-1; j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					System.out.println();
				}
			}
		}
		
		
	}
	
	
	public void method6() {
		// 2. 깊은 복사
		// 배열 공간을 별도로 확보
		// a. 반복문 이용
		// b. System.arraycopy();
		// c. clone();
		int[] source = {1,2,3,4,5};
		//a. 반복문 이용
		int[] target1 = new int[source.length]; //별도공간을 만든다
		
		for(int i = 0; i < source.length; i ++) {
			target1[i] = source[i];
		}
		
//		System.out.println("변경 전");
//		System.out.println(Arrays.toString(source)); //배열을 문자열로 바꿔준다.
//		System.out.println(Arrays.toString(target1));
//		System.out.println();
//		
//		target1[2] = 10;
//		System.out.println("변경 후");
//		System.out.println(Arrays.toString(source)); //배열을 문자열로 바꿔준다.
//		System.out.println(Arrays.toString(target1));
//		System.out.println(); // 별도의 공간이 만들어졌기때문에 값이 같지 않다.
		
//		//b방법 System.arraycopy();
//		int[] target2 = new int [source.length];
////		System.arraycopy(source, 0, target2, 0, source.length);
//		System.arraycopy(source, 2, target2, 2, 3);//내가 짜르고 싶은만큼 짜를 수 있다.
//		// 1. 어디를 복사할꺼냐 2. 복사할 위치 어디부터 3. 어디에 붙여넣기할꺼냐 4. 저장할 위치 어디부터, 5.길이까지 저장할꺼다
//		System.out.println("변경 전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));
//		
//		target2[2] = 10;
//		System.out.println("변경 후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));
		
		
		//3. clone
		int[] target3 = source.clone(); // 깊은복사가 되긴하는데 이거로만으론 모든것이 깊은복사는 안됨 
		System.out.println("변경 전");    // ex)배열안의 배열은 안됨 겉배열을 바꾸다가 속배열의 배열값까지 고정안되고 다바뀜.
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));
		
		target3[2] = 10;
		System.out.println("변경 후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));		
		
		
		
	}
	
	
	public void method5() {
		
		//배열 복사: 얕은 복사(shallow cop), 깊은복사
		//1. 얕은복사 = 주소값 복사
		// 복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같이 변경
		
		int[] source = {1, 2, 3, 4, 5};
		int[] target = source;
		System.out.println("변경 전");
		System.out.println(Arrays.toString(source)); //배열을 문자열로 바꿔준다.
		System.out.println(Arrays.toString(target));
//		target[2] = 10; //타겟을 바꿔도 소스(원본)도 같이 바뀐다
//		for(int i = 0; i < source.length; i++) {
//			System.out.print(source[i] + "\t");
//		}
//		System.out.println();
//		for(int i = 0; i < target.length; i++) {
//			System.out.print(target[i] + "\t");
//		}
//		System.out.println();
		target[2] = 10;
				
		
		System.out.println("변경 후");
		System.out.println(Arrays.toString(source)); //배열을 문자열로 바꿔준다.
		System.out.println(Arrays.toString(target));
		System.out.println();
//		for(int i = 0; i < source.length; i++) {
//			System.out.print(source[i] + "\t");
//		}
//		System.out.println();
//		for(int i = 0; i < target.length; i++) {
//			System.out.print(target[i] + "\t");
//		}
	}
	
	
	public void method4() {
		//키보드로 금액을 입력 받고 알맞은 금액을 거슬러 주세요.
		
		int mon = sc.nextInt();
		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int i = 0; i < coin.length; i++) {
			int cnt = mon/coin[i];
			if(cnt == 0) continue;
			mon = mon%coin[i];
			System.out.println(coin[i] + " : " + cnt + "개");
		}
		
		
		// ex) 55400 -> 10000*5 + 5000 + 100*4
		
	}
	
	
	public void method3() {
		
//		int a;
//		a = 10;
//		
//		int a = 10;
		//{배열값 1 ,배열값 2, 배열값 3 ...}
		int[] score = {75, 80, 95, 81, 84};
		// 최대값 구하기
		// 최소값 구하기
		int max = score[0]; //배열은 for문과 같이 사용된다.
		for(int i =0; i<score.length; i++) {
			if(max < score[i]) {//0이랑 75와비교하면 75가 크기때문에 max는 75가 된다 그런식으로 쭉
				max = score[i];
			}
		}
		int min = score[0];
		for(int i = 0; i<score.length; i++) {
			if(min > score[i]) {
				min = score[i];
				
			}
		}
		
	}
	
	
	public void method2() {
		
		// 정수 5개 입력하고 출력해보세요.
		// 
		int[] array = new int[5];
		array[0] = 100;
		array[1] = 55;
		array[2] = 66;
		array[3] = 28;
		array[4] = 62;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}
	
	
	public void method1() {
		/*
		 * int 점수 5개 입력 후 총점, 평균 계산하기.
		 */
//		int a1 = 30;
//		int a2 = 45;
//		int a3 = 27;
//		int a4 = 56;
//		int a5 = 44;
//		
//		int sum = a1+a2+a3+a4+a5;
//		double avg = sum/5.0;
		
		// int 타입 
		// [] 배열 선언
		// new메모리 할당
		// int[변수 개수]
		//int[] array = new int[5]; 첫번째 방법 추천 타입을 바로 알 수 있기 때문에.
		int array[] = new int[5]; //힙영역에 생긴다
		array[0] = 100 ;  
		array[1] = 95 ;
		array[2] = 87 ;
		array[3] = 94 ;
		array[4] = 77 ;
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) { //포문으로 출력
			sum += array[i];
			
		}
		
	
		
	}

}
