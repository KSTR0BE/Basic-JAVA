package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {
	public static void main(String[] args) {
		LottoMain lm = new LottoMain();
//		int[] lotto = lm.generateLotto();
//		System.out.println(Arrays.toString(lotto));
//		String result = lm.arrayToString(lotto);
//		System.out.println(result);
//		int[][] paper = lm.lottoPaper();
//		for(int[] lotto : paper) {
//		System.out.println(Arrays.toString(lotto));
		int[][][] bundle = lm.lottoBundle(30000);
		lm.printBundle(bundle);

		
	}
	public void printBundle(int[][][]bundle) {
		for(int[][] paper: bundle) {
			System.out.println("========================");
			for(int[] lotto : paper) {
				System.out.println(Arrays.toString(lotto));
				
			}
			System.out.println("========================");
		}
	}
	
	
	public String arrayToString(int[] lotto) {
		String result = "[";
		
		for(int i = 0; i < lotto.length; i++) {
			result += lotto[i];
			if(i != lotto.length-1) result +=", ";
			
		}
		result +="]";
		
		return result;
	}
	
	public int[][][] lottoBundle(int money) {
		
		//13000 이면?
		// 나머지가 있는지 체크
		int papers = money/5000; //papers는 로또 한세트할때마다 할 수 있는 횟수
		if(money%5000 !=0) papers++; //즉 5000원당 몇번 할수 있는지 횟수 인덱스
		int[][][] bundle = new int [papers][5][6];
		
		for(int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000 != 0)
			bundle[papers-1] = lottoPaper(money/1000%5);
		
		return bundle;
		
	}
	public int[][] lottoPaper(int num) { //메소드에선 메소드끼리 호출가능
		int[][] paper = new int[num][6];
		
		for(int i = 0; i < paper.length; i++) {
//			int[] lotto = generateLotto(); //이미 만든것을 불러온다
//			paper[i] = lotto; //이렇게 불러와서 압축시킬수있지만
			paper[i] = generateLotto(); //이렇게 더 압축시킬수 있다	
		}
		
		return paper;
	}
	
	
	
	public int[][] lottoPaper() { 
		return lottoPaper(5);
		
		
	}
	
	
	
	public int[] generateLotto() { //리턴을 안해주는게 void
		//로또 번호 6개 만들고 리턴할 것 .
		int[] lotto = new int [6];
		
		
		for(int i= 0; i<lotto.length; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
//		Arrays.sort(lotto);
//		sort(lotto);
		return lotto;
		
		
	}
	
	
	
	public void sort(int[] lotto) { //얕은복사  
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = 0; j < lotto.length-1; j++) {
				if(lotto[j] > lotto[i]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	}
	

}
