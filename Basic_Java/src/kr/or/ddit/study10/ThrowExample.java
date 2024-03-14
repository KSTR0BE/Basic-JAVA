package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {
		ThrowExample te = new ThrowExample();
		try {
			String nickname = te.inputNick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String inputNick() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String nickname = sc.next();
		if(nickname.contains("18")) {
			throw new Exception(); //에러가 아니지만 에러처럼 만들어서 처리하게 만들 수 있다.			
		}
		return nickname;
	}
	
	
}
