package kr.or.ddit.study05.sec03;

public enum Week {
	MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토"), SUN("일");
	
	String kor; //직접만들경우는 많지는 않다.
	Week(String kor){
		this.kor = kor;
	}

}
