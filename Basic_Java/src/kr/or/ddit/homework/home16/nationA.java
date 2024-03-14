package kr.or.ddit.homework.home16;

public class nationA extends Nation {
	public nationA() {
		
	}
	@Override
	public int tax(int t) {
		return (int)(t*0.9-1000);
		
		
		
	}

	@Override
	public int game() {
		int ran1 = (int)(Math.random()*6)+1;
		int ran2 = (int)(Math.random()*6)+1;
		int sum = ran1 + ran2;
		
		System.out.println("주사위를 입력해 주세요.");
		int guess = sc.nextInt();
		if(sum == guess) {
			System.out.println("정답입니다.");
			reward = 30000;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 :" + (ran1+ran2));
			reward = 0;
		}
		return reward;
	
	}
	

}
