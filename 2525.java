import java.util.*;

class Time{
	private int clock, min, cook;
	
	Time(int clock, int min, int cook){
		this.clock = clock;
		this.min = min;
		this.cook = cook;
	}
	
	public void CookTimeCheck() {		//요리 시간 계산
		for(; cook >= 60; cook -= 60)	//요리 시간이 1시간 이상인 경우
			ClockTimeCheck();			//시 단위만 증가
		
		if(cook > 0)					//그 외의 경우 분 단위만 증가
			MinTimeCheck();
	}
	
	private void ClockTimeCheck() {		//시 단위 증가
		if((clock += 1) > 23)
			clock = 0;
	}
	
	private void MinTimeCheck() {		//분 단위 증가
		if((min += cook) > 59) {
			min -= 60;
			ClockTimeCheck();
		}
	}
	
	public int getClock() {
		return clock;
	}
	
	public int getMin() {
		return min;
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		t.CookTimeCheck();
		System.out.println(t.getClock() + " " + t.getMin());
		sc.close();
	}
}