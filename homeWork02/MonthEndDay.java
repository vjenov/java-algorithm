package homeWork02;
import java.util.Scanner;
/*
 * To. 개발자님
월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다."

 */
public class MonthEndDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("월을 입력하세요 : (종료는 0)");
			int mon = scan.nextInt();
			String eval = "";
			switch(mon) {
			case 0 : eval = "시스템 종료";
				System.out.println(eval);
			return;
			case 1 : eval = "1월은 31일 까지입니다.";
			break;
			case 2 : eval = "2월은 28일 까지입니다.";
			break;
			case 3 : eval = "3월은 31일 까지입니다.";
			break;
			case 4 : eval = "4월은 28일 까지입니다.";
			break;
			case 5 : eval = "5월은 31일 까지입니다.";
			break;
			case 6 : eval = "6월은 30일 까지입니다.";
			break;
			case 7 : eval = "7월은 31일 까지입니다.";
			break;
			case 8 : eval = "8월은 31일 까지입니다.";
			break;
			case 9 : eval = "9월은 30일 까지입니다.";
			break;
			case 10 : eval = "10월은 31일 까지입니다.";
			break;
			case 11 : eval = "11월은 30일 까지입니다.";
			break;
			case 12 : eval = "12월은 31일 까지입니다.";
			break;
			default : eval = "Wrong Type";
			break;
			}
			System.out.println(eval);
		}
	}

}
