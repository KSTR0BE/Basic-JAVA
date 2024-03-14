package kr.or.ddit.study13.list;

public class ArrayExample {
	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
		for(int i = 0; i < 20; i++) {
		obj.add(i);
		}
	}
	
	//나중에 배울 ArrayList논리구조가 이런식으로 돼있다.
	
	
	int[] array = new int[10]; //기존 범위를 벗어나면 배열크기를 10만큼 증가하게 하는 구조
	int cur = 0;
	public void add(int num) { 
		if(cur == array.length) {
			int[] temp = new int[cur+10];
			for(int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[cur++] = num;
	}
	
	
	public int size() {
		return cur;
	}
	
	public boolean contains(int num) {
		for(int i : array) // 이게 오라클에선 where문
			if(num==i)return true;
		return false; //특정한 배열을 확인하는것
	}
	
	
	public void remove(int num) { //배열 삭제
		int[] temp = new int[array.length];
		int add = 0;
		for(int i = 0; i < temp.length; i++) {
			if(i == num) add = 1;
			if(i + add == temp.length-1) continue;
			temp[i]= array[i + add];
		}
	}
	
}
