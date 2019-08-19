package study03;
import java.util.Scanner;
import study03.Student;

public class Engine {
	public static void main(String[] args) {
		String result = "";
		int flag = 0;
		//flag, scan = 로컬 변수
		Student stu = new Student(); //reference
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println("메뉴 : 0. 종료,  1. BMI, 2. Ranking, 3. HowMuch, 4. ReportCard");
			flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");
				return;
			case 1 : System.out.println("BMI");
				System.out.println("BMI 측정시스템입니다\n이름을 입력하세요");
				String name = scan.next();
				System.out.println("키를 입력하세요(단위 cm)");
				int height = scan.nextInt();
				System.out.println("몸무게를 입력하세요(단위 kg)");
				int weight = scan.nextInt();
				result = stu.getBmi(name, height, weight);
				System.out.println(result);
				break;
			case 2 :
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
				System.out.println("ReportCard");
				System.out.println("학생 이름을 입력하세요");
				String sName = scan.next();
				System.out.println("국어 점수를 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어 점수를 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학 점수를 입력하세요");
				int mat = scan.nextInt();
				result = stu.getReportCard(sName, kor, eng, mat);
				System.out.println(result);
				break;
			}
		}
	}
}
