package kr.or.ddit.homework.home16;

import java.util.Scanner;

public abstract class Nation {
	int reward;
	Scanner sc = new Scanner(System.in);
	public abstract int tax(int t);
	
	public abstract int game();

}
