package homeWork04_member;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = null;
		MemberService service = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료, 1. Join, 2. MyPage, 3. BMI")) {
			case "0" : System.out.println("종료");
			return;
			case "1" : 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPw(JOptionPane.showInputDialog("PassWord입력"));
				member.setName(JOptionPane.showInputDialog("Name입력"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				String height = JOptionPane.showInputDialog("키 입력");
                member.setHeight(Double.parseDouble(height));
                String weight = JOptionPane.showInputDialog("몸무게");
                member.setWeight(Double.parseDouble(weight));
				member.setBlood(JOptionPane.showInputDialog("혈액형"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, "MyPage\n" + member.toString());
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, service.getBmi(member));
				
			}
		}
	}
}