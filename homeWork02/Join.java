package homeWork02;
import java.util.Scanner;
/*
 * to. 개발자님
여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요
=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 
입력이 종료되면 ...아래처럼 보이게 해주세요
=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형
 */
public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
		String[] menu = new String[8];
			menu[0] = "아이디 : ";
			menu[1] = "비밀번호 : ";
			menu[2] = "이름 : ";
			menu[3] = "생년월일(예) 1990-05-05 : ";
			menu[4] = "성인여부(성인true,미성년false) : ";
			menu[5] = "키(소수점 첫째자리까지) : ";
			menu[6] = "몸무게(소수점 첫째자리까지) : ";
			menu[7] = "혈액형(A) : ";
		String[] info = new String[8];
		System.out.print("아래의 정보를 입력하세요 (종료는 0)\n");
		for(int i = 0; i < info.length; i++) {
			System.out.print(menu[i]);
			info[i] = scan.next();
			if(info[i].equals("0")) {
				System.out.print("시스템 종료");
				return;
			}
		}
		for(int i = 0; i < info.length; i++) {
			System.out.print(menu[i]);
			System.out.println(info[i]);
		}
		}
	}

}