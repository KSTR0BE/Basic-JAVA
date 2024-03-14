package kr.or.ddit.homework.home11;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.process();
	}
	
	public void process() {
		// 카드 리스트 호출
		Card[] card = cardList();
		
		// 카드 섞기 (메소드생성)
		shuffle(card);
		
		// 승패 비교 (메소드 생성)
		String result = result(card);
		
		// 랜덤한 카드 뽑기(내카드),맨위카드(컴퓨터)
		// 내카드 숫자가 높을 경우 승리
		System.out.println(result);
	}
	
	
	public Card[] cardList() {
		Card[] cardList = new Card[52];
		String[] types = {"♠", "◆", "♥", "♣"};
		int cur =0;
		for (String type : types) {
			for(int i=1; i<=13; i++) {
				cardList[cur++] = new Card(i,type);
				// 완성 할 것
				
			}
		}
		return cardList;
	}
	public void shuffle(Card[] cardList) { 
		for(int i = 0; i < 1000; i++) {
			int ran = (int)(Math.random()*52);
			Card temp = cardList[ran];
			cardList[ran] = cardList[0];
			cardList[0] = temp;
		}
		
	}
	
	public String result(Card[] cardList) {
		
		String result = "패";
		int ran;
		 do {
			 ran = (int)(Math.random()*52)+1;
		    } while (ran == 0);

		    if(cardList[ran].num > cardList[0].num)
		        result = "승";
		    if(cardList[ran].num == cardList[0].num)
		    	result = "무";

		    System.out.println("내 카드 : " + cardList[ran].type + cardList[ran].num);
		    System.out.println("컴 카드 : " + cardList[0].type + cardList[0].num);

		    return result;
		}
	
	
}
