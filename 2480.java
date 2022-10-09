import java.util.*;

class Dice{
	private int num;
	private int cnt;
	static int biggest_Num = 0;			//가장 큰 수
	static int biggest_Cnt = 0;			//같은 눈이 나온 횟수
	static int biggest_Cnt_Num = 0;		//같은 눈
	
	Dice(int num){
		this.num = num;
		cnt = 0;
		biggest_Num = (biggest_Num > num) ? biggest_Num : num;
	}
	
	//중복 확인
	public void diceCheck(Dice[] d, int index) {
		for(int i = index; i - 1 >= 0; i--)
			if(d[index].num == d[i - 1].num)
				cnt++;
		
		if(biggest_Cnt < cnt) {
			biggest_Cnt = cnt;
			biggest_Cnt_Num = num;
		}
	}
	
	//상금 계산
	static int prizeMoney() {
		int result;
		switch(Dice.biggest_Cnt) {
		case 1: result = 1000 + Dice.biggest_Cnt_Num * 100; break;
		case 2: result = 10000 + Dice.biggest_Cnt_Num * 1000; break;
		default: result = Dice.biggest_Num * 100; break;
		}
		return result;
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice[] d = new Dice[3];
		
		d[0] = new Dice(sc.nextInt());
		for(int i = 1; i < 3; i++) {
			d[i] = new Dice(sc.nextInt());
			d[i].diceCheck(d, i);	
		}

		System.out.println(Dice.prizeMoney());
		sc.close();
	}
}