package kr.or.ddit.homework.home16;

public class nationB extends Nation{

	@Override
	public int tax(int t) {
		return (int)(t*0.8-3000);
		
	}

	@Override
	public int game() {
		while(true) {
			String[] choices = {"가위","바위","보"};
			System.out.println("가위 바위 보 게임을 시작합니다. 당신의 선택은?");
			String userChoice = sc.next();
			int com = (int)(Math.random()*3);
			String comChoice = choices[com];
			
			if (userChoice.equals(comChoice)) {
	            System.out.println("무승부");
	            System.out.println("다시");
	            continue;
			} 
			else if ((userChoice.equals("가위")) && (comChoice.equals("보"))
					|| (userChoice.equals("바위")) && (comChoice.equals("가위")) 
					|| (userChoice.equals("보")) && (comChoice.equals("바위"))){
						System.out.println("승리");
						return reward = 20000;
				} else {
					System.out.println("패배");
					System.out.println("상대는 " + comChoice + "입니다.");
					return reward = 0;
				}


			
		}
	}

}
