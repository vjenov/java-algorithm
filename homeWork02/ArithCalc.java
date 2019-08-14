package homeWork02;
import java.util.Scanner;
/*
 * To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.

 */
public class ArithCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("계산기 프로그램 \n1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈, 0. 종료");
			int tool = scan.nextInt();
			if(tool == 0) {
				System.out.print("시스템 종료");
				return;
			}
			System.out.print("첫번 째 숫자를 입력하세요 : ");
			int a = scan.nextInt();
			System.out.print("두번 째 숫자를 입력하세요 : ");
			int b = scan.nextInt();
			int result = 0;
			String resultString = "";
			switch(tool) {
			case 1 : result = a + b;
			break;
			case 2 : result = a - b;
			break;
			case 3 : result = a * b;
			break;
			case 4 : resultString = a / b + "[" + a % b + "]";
			break;
			default : resultString = "wrong type";
			break;
			}
			if(tool == 4 || tool == 5) {
				System.out.println(resultString);
			} else if(tool == 1 || tool == 2 || tool ==3) {
				System.out.println(result);
			}
		}
	}
}
