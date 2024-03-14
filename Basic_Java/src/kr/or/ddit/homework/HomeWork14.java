package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {	
	HomeWork14 hw = new HomeWork14();
	hw.process();
	}

	Mem[] memList = new Mem[100];
	int cur =0; 
	public void process() {
		
		int num;
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
			System.out.println("5. 종료");
			num = sc.nextInt();
			
			if(num == 1) addMember();
			else if(num == 2) removeMember();
			else if(num == 3) updateMember();
			else if(num == 4) printListMember();
			else if(num == 5) {
				System.out.println("시스템 종료");
				break;
			}
		}
	}

	public void addMember() {
		Mem mem = new Mem();
		// 정보 입력 
		System.out.println("ID: ");
		mem.setId(sc.next());
		System.out.println("PASSWORD: ");
		mem.setPass(sc.next());
		System.out.println("NAME: ");
		mem.setName(sc.next());
		System.out.println("AGE: ");
		mem.setAge(sc.nextInt());
		
		memList[cur++] = mem;
		System.out.println();
	
	}

	public void removeMember() {
		printListMember();
		System.out.println("삭제할 회원 정보 입력");
		//(GG)
		int num =sc.nextInt();
		int add=0;
		Mem[] newList = memList.clone();
		for(int i = 0; i<cur; i++) {
			if(i==num) {
				add = 1;
			}
			newList[i] = memList[i+add];
		}
		memList = newList;
		cur--;
		printListMember();
	}

	public void updateMember() {
	printListMember();
	System.out.println("수정할 회원 번호 입력");
	// 수정 적용
	int num = sc.nextInt();
	System.out.println("ID: ");
	memList[num].setId(sc.next());
	System.out.println("PASSWORD: ");
	memList[num].setPass(sc.next());
	System.out.println("NAME: ");
	memList[num].setName(sc.next());
	System.out.println("AGE: ");
	memList[num].setAge(sc.nextInt());
	
	
	}

	public void printListMember() {
		System.out.println("전체 회원 목록: ");
		for(int i=0; i<cur; i++) {
			Mem mem = memList[i];
			System.out.println(i+"번 "+"ID:"+mem.getId()+", PASSWORD: "+mem.getPass()+", NAME:"+mem.getName()+", AGE: "+mem.getAge());
		}
	}


	}
	class Mem{
		private String id;
		private String pass;
		private String name;
		private int age;
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		/*
		 *  생성자 사용 x
		 *  
		 *  toString 사용 x
		 */




	

}
