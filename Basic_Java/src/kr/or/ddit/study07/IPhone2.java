package kr.or.ddit.study07;

public class IPhone2 extends IPhone{
	
	
	
	@Override //부모클래스에서 만든 기능을 가져와서 자식클래스에서 재구성한다.
	public void camera() {
		super.camera(); //super는 내 부모를 뜻함 부모에 있는 카메라기능을 사용
		System.out.println("모션 인식 기능 추가");
	}

}
