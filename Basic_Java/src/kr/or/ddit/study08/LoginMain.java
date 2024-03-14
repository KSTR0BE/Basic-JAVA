package kr.or.ddit.study08;

public class LoginMain {
	public static void main(String[] args) {
		
		// 0 PC, 1모바일
		int state = 0;
		
		ILogin login = null;
		String id ="";
		String pass = "";
		if(state == 0) {
			login = new LoginImple();
			System.out.println("스캐너로 입력");
			id = "id";
			pass = "pass";
		}
		if(state == 1) {
			login = new MoblieLoginImple();
			System.out.println("모바일 키패드 입력");
			id = "id";
			pass = "pass";
		}
		login.login(id,pass);
		
	}
}
