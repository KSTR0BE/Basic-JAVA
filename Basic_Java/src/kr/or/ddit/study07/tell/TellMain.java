package kr.or.ddit.study07.tell;

import java.util.Scanner;

import kr.or.ddit.study07.animal.Cat;

public class TellMain {
	public static void main(String[] args) {
		System.out.println("전화 상담 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJab");
		System.out.println("P : PriorityAlocatoin");
		
		
		Scheduler s = null;
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		if(result.equals("R")) s = new RoundRobn();
		if(result.equals("L")) s = new LeastJab();
		if(result.equals("P")) s = new PriorityAlocatoin();
		
		s.getNextCall();
		s.sendCalToAgent();
		
		
		/*
		 * 
		 * Scheduler클래스
		 * getNextCall();
		 * sendCalToAgent();
		 * 
		 * 
		 * RoundRobn, LeastJab, PriorityAlocatoin 클래스는 각각
		 * Scheduler클래스 상속 후 각 메세지를 출력할 것.
		 * 
		 * PriorityAlocatoin
		 * 1-> 우선순위가 높은 상담전화를 대기열에서 가져옴.
		 * 2-> 업무스킬이 가장 우수한 상담원에게 상담전화 분배.
		 * 
		 * 
		 * LeastJab
		 * 1-> 상담전화를 대기열에서 차례대로 가져옴.
		 * 2-> 대기열이 가장 짧은 상담원에게 상담전화를 분배.
		 * 
		 * RoundRobn
		 * 1-> 상담전화를 대기열에서 차례대로 가져옴.
		 * 2-> 차례대로 상담원에게 상담전화를 분배.
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
