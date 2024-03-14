package kr.or.ddit.homework.home10;

public class Cylinder {
	double height;
	double volume;
	
	public Cylinder(int height, Circle c1) {
		this.height = height;
		this.volume = c1.area * height;
		
		
	}

	@Override
	public String toString() {
		return "Cylinder [원의 부피 =" + volume + "]";
	}
	

}
