package homeWork04_member;

public class MemberService {
	public String getBmi(Member member) {
		String result = "";
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
			return String.format("%s님의 bmi는 %.1f이고 %s입니다.", member.getName(), bmi, result);
	}
}
