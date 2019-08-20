package study04;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0. 종료, 1. Join, 2. 정보보기, 3. 아이디찾기, 4. BMI, 5. ReportCard, 6. Tax");
			switch(scan.nextInt()) {
			case 0 : System.out.println("종료");
			return;
			case 1 : 
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디");
				member.setId(scan.next());
				System.out.println("비밀번호");
				member.setPw(scan.next());
				System.out.println("이름");
				member.setName(scan.next());
				System.out.println("주민번호");
				member.setSsn(scan.next());
				System.out.println("성인여부(성인true,미성년false) : ");
				member.setAdult(scan.nextBoolean());
				System.out.println("키");
				member.setHeight(scan.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scan.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scan.next());
				System.out.println("국어점수");
				member.setKor(scan.nextInt());
				System.out.println("영어점수");
				member.setEng(scan.nextInt());
				System.out.println("수학점수");
				member.setMat(scan.nextInt());
				System.out.println("연봉");
				member.setPay(scan.nextInt());
				break;
			case 2 :
				System.out.println(member.toString());
				break;
			case 3 :
				System.out.println("아이디, 이름을 입력하면 비번과 주민번호 알려줌");
				String searchName = scan.next();
				String searchID = scan.next();
				if(searchName.equals("a")&&searchID.equals("a")) {
					System.out.printf("찾는 비번 : %s \n"
							+ "주민번호 : %s \n", member.getPw(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
				break;
			case 4 :
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			case 5 :
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case 6 :
				System.out.print("세금 계산 프로그램입니다.");
				System.out.println(service.getTax(member));
			}		
		}
	}
}