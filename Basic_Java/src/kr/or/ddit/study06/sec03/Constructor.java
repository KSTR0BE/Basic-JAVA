package kr.or.ddit.study06.sec03;

public class Constructor {
	
	public Constructor(){ //우리가 안만들어도 자동으로 생긴다.
		
	}
	
	public Constructor(String test) {
		//생성자를 만들면 위의 기본생성자(기본생성자=괄호안에 아무것도 안들어가있는것)가 적용이 안된다
	}
	
	//생성자를 여러개만드는게 오버로딩
	//오버로딩과 오버라이딩의 차이점
	// (생성자 괄호안)파라미터에 따라 호출하는게 달라지는게 오버로딩
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		
	}

}
