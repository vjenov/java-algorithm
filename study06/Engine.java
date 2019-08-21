package study06;
import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = null;
		Service service = new Service();
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료, 1. Join, 2. MyPage, 3. 아이디찾기, 4. BMI, 5. ReportCard, 6. Tax")) {
			case "0" : System.out.println("종료");
			return;
			case "1" : 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPw(JOptionPane.showInputDialog("PassWord입력"));
				member.setName(JOptionPane.showInputDialog("Name입력"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, "MyPage\n" + member.toString());
				break;
			case "3" :
				System.out.println("아이디, 이름을 입력하면 비번과 주민번호 알려줌");
				/*String searchName = scan.next();
				String searchID = scan.next();
				if(searchName.equals("a")&&searchID.equals("a")) {
					System.out.printf("찾는 비번 : %s \n"
							+ "주민번호 : %s \n", member.getPw(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
				*/
				break;
			case "4" :
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			case "5" :
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case "6" :
				System.out.print("세금 계산 프로그램입니다.");
				System.out.println(service.getTax(member));
				break;
			}		
		}
	}
}