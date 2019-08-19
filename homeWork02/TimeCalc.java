package homeWork02;

import java.util.Scanner;

/*
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.print("초를 숫자만 입력하세요 : (종료 : 0)");
		int sec = scan.nextInt();
		if(sec == 0) {
			System.out.print("시스템 종료");
			return;
		}
		int hour = sec/60/60;
		int min = (sec/60)%60;
		System.out.print(hour+"시간 "+min+"분 " + sec%60 +"초");
		String result = String.valueOf(hour) + "시간 " + String.valueOf(min) + "분 " + sec%60 + "초";
		System.out.print(result);
	}
}
}