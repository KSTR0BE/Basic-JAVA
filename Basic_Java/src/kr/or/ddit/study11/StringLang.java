package kr.or.ddit.study11;

import java.io.File;
import java.util.Scanner;

public class StringLang {
	public static void main(String[] args) {
		StringLang obj = new StringLang();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 하시겠습니까? (y/n)");
			
			String yn = sc.next();
		//	if(yn.equals("n") || yn.equals("N")) {
			if(yn.equalsIgnoreCase("n")) { //대소문자 구분하지않겠다.
				break;
			}
		}
		System.out.println("종료 되었습니다.");
		
	}
	
	public void method6() {
		String test = "test1 , "
				+ "test2, "
				+ "test3, "
				+ "test4, "
				+ "test5";
		
		String[] tokens = test.split(","); //스플릿은 콤마기준으로 자르겠다/짜르는 대상은 사라진다
		
		for(String string : tokens) { //스프링 배열에다 짜른 값을 토큰에다 하나씩 담는다
			System.out.println(string.trim()); //공백이 생겨서 트림으로 처리한다 /데이터는 트림을 자주 쓰자
		}
		
	}
	
	public void method5() {
		String test = "가나다라마바보";
		
		System.out.println(test);
		test = test.replace("바보", "**");
		System.out.println(test);
		test = "  test test test  ";
		test = test.trim(); //트림안쓰면 앞뒤 콤마 생김
		test = test.replace(" ", ",");
		System.out.println(test);
		
		//test.replaceAll("정규식","바뀔문자"); 심화과정
		
	}
	
	public void method4() {
		String test = " test    \ntest \t  ";
		System.out.println(test);
		System.out.println("====================");
		test = test.trim(); //앞뒤 공백 없앰 줄바꿈 탭 다 제거함 글 중간에 있는 공백은 제거안됨
		System.out.println(test);
		System.out.println("====================");
		
	}
	
	public void method3() {//어퍼케이스는 
		String test = "Abcd";
		System.out.println(test);
		
		test = test.toUpperCase();
		System.out.println(test);
		
		if(test.contains("ABCD")) {
			System.out.println("포함됨");
		}
		
		test = test.toLowerCase();
		System.out.println(test);
	}
	
	public void method2() { 
		String test = "문자열 test 입니다."; 
		String start = "문자열"; //파일이름 검색할때 사용
		
		if(test.contains(start)); {
			System.out.println(start+"로 시작합니다.");
		}
		
		String end ="입니다."; //확장자 검색할때 사용
		
		if(test.contains(end)); {
			System.out.println(end + "로 끝납니다.");
		}
		
		
		//2024년으로 시작하는 엑셀 파일이름을 출력하시오.
		
		File dir = new File("원하는 파일 경로");
		
		for(String name : dir.list()) {
			if(!name.startsWith("2024")) continue;
			
			if(name.endsWith(".xls") || name.endsWith(".xlsx")) {
				System.out.println(name);
			}
		}
		
		
	}
	
	public void method1() {
		String test = "문자열 test 입니다.";
		String search = "test"; //test1이면 실행 x 해당 문자가 없어서.
		
		if(test.contains(search)) {
			System.out.println(search+ " 값이 포함되어 있습니다.");
			
		}
		
		
	}

}
