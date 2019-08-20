package study04;

public class Service {
	
	public String getBmi(Member member) {
		String result = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight/(height*height/100/100);
			if(bmi > 30.0) {
				result = "고도비만";
			}else if(bmi > 25.0) {
				result = "비만";
			}else if(bmi > 23.0) {
				result = "과체중";
			}else if(bmi > 18.5) {
				result = "정상";
			}else {
				result = "저체중";
			}
			return String.format("%s님의 bmi는 %.1f이고 %s입니다.", name, bmi, result);
	}
	public String getReportCard(Member member) {
		int kor = member.getKor();
		int eng = member.getEng();
		int mat = member.getMat();
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
		
		for(int i = 0; i < menu.length; i++) {
		
			System.out.print(menu[i] + "    ");
		}
		System.out.print("\n================================\n");
		System.out.println(member.getName() + "    " +member.getKor()+ "    " +member.getEng()+ "    " +member.getMat()+ "    " 
							+ total + "    " + average + "    " + grade);
		return "";
	}
	
	public String getTax(Member member) {
		int pay = member.getPay();
		double taxRate = 9.7;
		double tax = pay * taxRate /100;
		return String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다.", pay, member.getName(), tax);
	}
}
