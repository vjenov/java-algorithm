package study03;

import java.util.Scanner;

public class Student {
// 1. BMI 2. Ranking 3. HowMuch 4. ReportCard  
	public String getBmi(String name, double height, double weight) {
		String fat = "";
		double bmi = weight/(height*height/100/100);
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
		return String.format("%s의 bmi는 %s입니다.", name, fat);
		}
	public String getRank(double[] records) {
		String[] players = {"A", "B", "C"};
		if(records[0] > records[1] && records[1] > records[2]) {
			System.out.print("1등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n2등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n3등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n");
		}else if(records[0] > records[1] && records[1] < records[2]) {
			if(records[0] > records[2]) {
				System.out.print("1등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n2등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n3등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n");
			}else {
				System.out.print("1등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n2등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n3등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n");
			}
		}else if(records[0] < records[1] && records[1] < records[2]) {
			System.out.print("1등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n2등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n3등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n");
		}else if(records[0] < records[1] && records[1] > records[2]) {
			if(records[0] > records[2]) {
				System.out.print("1등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n2등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n3등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n");
			}else {
				System.out.print("1등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n2등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n3등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n");
			}
		}
		return "";
	}
	public String howMuch(int price, int many) {
			int total = price * many;
			int dc = total/10;
			int last = total - dc;
			return String.format("총 금액은  %d 입니다.\n비싸요, 10프로 깎아주세요.\n 그럼 %d 원만 주세요.", total, last);
	}
	public String getReportCard(String sName, int kor, int eng, int mat) {
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
			result[0] = sName;
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
		return "";
	}
}
