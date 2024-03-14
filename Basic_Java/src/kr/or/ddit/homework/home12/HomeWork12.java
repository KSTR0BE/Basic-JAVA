package kr.or.ddit.homework.home12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork12 hw = new HomeWork12();
		hw.process();
	}
	// 사람 클래스 만들고
	// 필드값으로는 돈, 이름 입력 받고 시작 스캐너로
	public void process() {
		String name;
		int money;
		
		System.out.println("플레이어 이름: ");
		name = sc.nextLine();
		
		System.out.println("보유금액 : ");
		money = sc.nextInt();
		
		Person p = new Person(name, money);
		int[][][] bundle;
		int price;
		int num = 0;
		int luckyBoy;
		
		while (num != -1) {
			if(p.money < 10000) {
				System.out.println("구매할 돈이 부족합니다.");
				break;
			}
			System.out.println("구매할 돈 입금: ");
			price = sc.nextInt();
			if(p.money < price) {
				System.out.println("잔고가 부족합니다.");
				continue;
			}
			bundle = lottoBundle(price);
			p.money -= price;
			luckyBoy = printBundle(bundle);
			
			if(luckyBoy > 0) {
				System.out.println("★☆★당첨★☆★");
				p.money += luckyBoy;
				System.out.println("잔고: " +p.money);
			} else {
				System.out.println("XXX꽝XXX");
			}
			
			System.out.println("re? (yes: 1 or no: -1)");
			num = sc.nextInt();
		
		}
		
	
	}
	
		
	public int[] generateLotto() {
		//로또번호가 1~8까지
		//6개의 번호를 뽑아서 만들것
		int[] lotto = new int [6];
		
		for(int i =0; i < lotto.length; i ++) {
			int ran = new Random().nextInt(8)+1;
			lotto[i] =ran;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(lotto);
		return lotto;
		
		
	}
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for(int i = 0; i < paper.length; i++) {
			paper[i] = generateLotto();
		}
		
		return paper;
		
	
	}
	public int[][] lottoPaper() { 
		return lottoPaper(5);
		
		
	}
	// while문을 통해 로또 구매할 숫자를 선택하고
	// 구매후에 로또 추첨을 진행한다.
	
	public int[][][] lottoBundle(int money) {
		int papers = money/5000;
		if(money%5000 != 0) papers++;
		int[][][] bundle = new int [papers][5][6];
		for(int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000 != 0)
			bundle[papers-1] = lottoPaper(money/1000%5);
		
		return bundle;
		
	}
	
	public int printBundle(int[][][]bundle) {
		int money = 0;
		int[] comLotto = generateLotto();
		System.out.println("========[me]=======");
		for(int[][] lottoPaper : bundle) {
			for(int[] mylotto : lottoPaper) {
				System.out.println(Arrays.toString(mylotto));
				if(Arrays.equals(mylotto, comLotto)) {
					money += 100000;
				}
			}
		}
		System.out.println("=======[com]=======");
		System.out.println(Arrays.toString(comLotto));
		System.out.println("===================");
		return money;
	}
	//로또6개 번호가 다 맞는다면
	//100000(10만원) 상금 지급
	//종료 진행시 끝
}

