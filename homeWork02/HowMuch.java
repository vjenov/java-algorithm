package homeWork02;
import java.util.Scanner;
/*
 * "얼마에요?
> 스캐너입력값 > 100
100원 입니다.
몇개 드릴까요?
> 스캐너입력값 > 5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
그럼 450원만 주세요"

[참고] 깍아주는 공식
int dc = total / 10;
total = total - dc;
 */
public class HowMuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("얼마예요?");
			int price = scan.nextInt();
			System.out.println(price + "원입니다.\n몇개 드릴까요?");
			int many = scan.nextInt();
			int total = price * many;
			int dc = total - (total / 10);
			System.out.println(many + "개 주세요.\n총 금액은 " + total + "원입니다.\n비싸요, 10% 깎아주세요.\n그럼 " + dc + "원만 주세요.");
		}
	}
}
