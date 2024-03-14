package kr.or.ddit.study07;

public class PhoneExample {
	public static void main(String[] args) { //부모의 속성을 물려받는걸 상속
		Phone phone = new Phone();
		phone.medel = "폰";
		phone.color = "검정";
		
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("smartPhone");
		smartPhone.medel = "스마트폰";
		smartPhone.color = "흰색";
		smartPhone.call();
		smartPhone.internet();
		smartPhone.touch();
		
		
		System.out.println("dmb");
		DmbPhone dmbPhone = new DmbPhone();
		dmbPhone.call();
		dmbPhone.dmb();
		
		System.out.println("iphone");
		IPhone iphone = new IPhone();
		iphone.camera();
		System.out.println("iphone2");
		IPhone2 i2 = new IPhone2();
		i2.camera();
	}

}
