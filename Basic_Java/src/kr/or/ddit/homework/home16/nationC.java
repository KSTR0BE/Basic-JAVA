package kr.or.ddit.homework.home16;

public class nationC extends Nation{

	@Override
	public int tax(int t) {
		return (int)(t*0.85-1000);
		
	}

	@Override
	public int game() {
		System.out.println("홀짝을 입력해 주세요");
		String guess = sc.next();
		int ran = (int)(Math.random()*100)+1;
		String result = (ran%1==0) ? "짝" : "홀";
		if(result.equals(guess)) {
			System.out.println("정답입니다.");
			System.out.println("정답은 " + result + "입니다.");
			reward = 15000;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 " + result + "입니다.");
			reward = 0;
		}
		return reward;
		
	}

}
