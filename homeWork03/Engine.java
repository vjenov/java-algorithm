package homeWork03;
import java.util.Scanner;
import homeWork03.Student;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student stu = new Student();
		String result = "";
		int flag = 0;
		String name = "";
		int kor = 0;
		int eng = 0;
		int mat = 0;
		while(true) {
		System.out.println("0. 종료, 1. arithmeticCalc, 2. getBMI, 3. howMuch, 4. join, 5. getLeapYear, 6. getMonthEndDay, 7. passOrFail, 8. getRank, "
				+ "9. getReportCard, 10. getScoreCalc, 11. getTax, 12. getTimeCalc");
		flag = scan.nextInt();
		switch(flag) {
		case 0 : System.out.println("종료");
			return;
		case 1 : System.out.println("ArithmeticCalc");
			System.out.println("계산기 프로그램 \n1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈");
			int tool = scan.nextInt();
			System.out.print("첫번 째 숫자를 입력하세요 : ");
			int a = scan.nextInt();
			System.out.print("두번 째 숫자를 입력하세요 : ");
			int b = scan.nextInt();
			result = stu.getArithCalc(tool, a, b);
			System.out.println(result);
			break;
			
		case 2 : System.out.println("BMI");
			System.out.println("BMI 측정시스템입니다\n이름을 입력하세요");
			name = scan.next();
			System.out.println("키를 입력하세요(단위 cm)");
			int height = scan.nextInt();
			System.out.println("몸무게를 입력하세요(단위 kg)");
			int weight = scan.nextInt();
			result = stu.getBmi(name, height, weight);
			System.out.println(result);
			break;
			
		case 3 :
			System.out.println("HowMuch");
			System.out.println("얼마예요?");
			int price = scan.nextInt();
			System.out.println(price + "원입니다.\n몇개 드릴까요?");
			int many = scan.nextInt();
			System.out.println(many + "개 주세요.");
			result = stu.howMuch(price, many);
			System.out.println(result);
			break;
			
		case 4 :
			System.out.println("Join");
			String[] info = new String[8];
			System.out.println("아래의 정보를 입력하세요");
			String[] menu = new String[8];
			menu[0] = "아이디 : ";
			menu[1] = "비밀번호 : ";
			menu[2] = "이름 : ";
			menu[3] = "생년월일(예) 1990-05-05 : ";
			menu[4] = "성인여부(성인true,미성년false) : ";
			menu[5] = "키(소수점 첫째자리까지) : ";
			menu[6] = "몸무게(소수점 첫째자리까지) : ";
			menu[7] = "혈액형(A) : ";
			for(int i = 0; i < info.length; i++) {
				System.out.print(menu[i]);
				info[i] = scan.next();
				}
			result = stu.join(menu, info);
			System.out.println(result);
			break;
			
		case 5 :
			System.out.println("윤년여부 확인 프로그램.");
			int year = scan.nextInt();
			result = stu.getLeapYear(year);
			System.out.println(result);
			break;
			
		case 6 :
			System.out.println("GetMonthEndDay");
			System.out.print("월을 입력하세요 : ");
			int mon = scan.nextInt();
			result = stu.getMonthEndDay(mon);
			System.out.println(result);
			break;
			
		case 7 :
			System.out.println("PassOrFail");
			System.out.println("학생 이름을 입력하세요");
			name = scan.next();
			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			mat = scan.nextInt();
			result = stu.passOrFail(name, kor, eng, mat);
			System.out.println(result);
			break;
			
		case 8 :
			System.out.println("Ranking");
			double[] records = new double[3];
			System.out.println("A 선수의 기록을 입력하세요 : ");
			records[0] = scan.nextDouble();
			System.out.println("B 선수의 기록을 입력하세요 : ");
			records[1] = scan.nextDouble();
			System.out.println("C 선수의 기록을 입력하세요 : ");
			records[2] = scan.nextDouble();
			result = stu.getRank(records);
			System.out.println(result);
			break;
			
		case 9 :
			System.out.println("ReportCard");
			System.out.println("학생 이름을 입력하세요");
			name = scan.next();
			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			mat = scan.nextInt();
			result = stu.getReportCard(name, kor, eng, mat);
			System.out.println(result);
			break;
		case 10 :
			System.out.println("GetScoreCalc");
			int sum = 0;
			int[] list = new int[100];
			for(int i = 0; i < list.length; i++) {
				System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
				list[i] = scan.nextInt();
				System.out.println("> "+ list[i]);
				sum += list[i];
				if(list[i] == -1) {
					break;
				}
			}
			result = stu.getScoreCalc(list, sum);
			System.out.println(result);
			break;
		case 11 :
			System.out.println("GetTax");
			System.out.print("세금 계산 프로그램입니다.\n이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("연봉을 입력하세요 : (단위 만원)");
			int pay = scan.nextInt();
			result = stu.getTax(name, pay);
			System.out.println(result);
			break;
			
		case 12 :
			System.out.println("GetTimeCalc");
			System.out.print("초를 숫자만 입력하세요 : (종료 : 0)");
			int sec = scan.nextInt();
			result = stu.getTimeCalc(sec);
			System.out.println(result);
			break;
		}
	}
}
}
