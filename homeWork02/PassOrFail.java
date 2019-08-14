package homeWork02;
import java.util.Scanner;
/*
 * To. 개발자님
       * 프로그램을 하나 개발해야 합니다.
       * 교수는 학생과 국어, 영어, 수학점수만 입력하면
       * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
       * 오더는 다음과 같이 화면에 출력하라고 합니다.
       * 학생           국어        영어        수학        총점        평균        합격여부
       * =======================================================
       * 홍길동     90       90      90     270      90       (장학생)
       * 합격여부는 다음과 같다고 합니다.
       * 평균이 90점 이상이면 장학생
       * 70점 이상 90점미만 이면 합격
       * 70미만이면 불합격이라고 하네요.
       * 단) 평균에서 소수점이하는 절삭입니다.
 */
public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n학생 이름을 입력하세요(종료는 0)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("시스템 종료");
				return;
			}
			System.out.println("국어 점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int mat = scan.nextInt();
			int total = kor + eng + mat;
			int average = total / 3;
			String grade = "";
			if(average >= 90) {
				grade = "(장학생)";
			}else if(average >= 70) {
				grade = "(합격)";
			}else {
				grade = "(불합격)";
			}
			String[] menu = new String[7];
			menu[0] = "이름";
			menu[1] = "국어";
			menu[2] = "영어";
			menu[3] = "수학";
			menu[4] = "총점";
			menu[5] = "평균";
			menu[6] = "합격여부";
			
			String[] result = new String[7];
			result[0] = name;
			result[1] = String.valueOf(kor);
			result[2] = String.valueOf(eng);
			result[3] = String.valueOf(mat);
			result[4] = String.valueOf(total);
			result[5] = String.valueOf(average);
			result[6] = grade;
			
			for(int i = 0; i < menu.length; i++) {
				System.out.print(menu[i] + "    ");
			}
			System.out.print("\n================================\n");
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		}
		
	}
}
