package homeWork02;
import java.util.Scanner;
/*
 *  To. 개발자님
사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
 */
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("BMI 측정시스템입니다\n이름을 입력하세요(종료를 원하시면 0을 누르세요)");
		String name = scan.next();
		if(name.equals("0")) {
			System.out.print("시스템 종료");
			return;
		}
		System.out.println("키를 입력하세요(단위 cm)");
		int height = scan.nextInt();
		
		System.out.println("몸무게를 입력하세요(단위 kg)");
		int weight = scan.nextInt();
		
		double bmi = weight/(height*height/100/100);
		String fat = "";
			if(bmi > 30.0) {
				fat = "고도비만";
			}else if(bmi > 25.0) {
				fat = "비만";
			}else if(bmi > 23.0) {
				fat = "과체중";
			}else if(bmi > 18.5) {
				fat = "정상";
			}else {
				fat = "저체중";
			}
		System.out.printf("%s님은 %s입니다.", name, fat);
		}
	}
}
