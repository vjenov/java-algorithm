package homeWork03;

import java.util.Scanner;

public class Student {
	public String getArithCalc(int tool, int a, int b) {
			int result = 0;
			String resultString = "";
			switch(tool) {
			case 1 : result = a + b;
			break;
			case 2 : result = a - b;
			break;
			case 3 : result = a * b;
			break;
			case 4 : resultString = a / b + "[" + a % b + "]";
			break;
			default : resultString = "wrong type";
			break;
			}
			if(tool == 1 || tool == 2 || tool ==3) {
				System.out.println(result);
			}else {
				System.out.println(resultString);
			}
			return "";
	}
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
	public String howMuch(int price, int many) {
		int total = price * many;
		int dc = total/10;
		int last = total - dc;
		return String.format("총 금액은  %d 입니다.\n비싸요, 10프로 깎아주세요.\n 그럼 %d 원만 주세요.", total, last);
	}
	public String join(String menu[], String info[]) {
		for(int i = 0; i < info.length; i++) {
			System.out.print(menu[i]);
			System.out.println(info[i]);
			}
		return "";
	}
	/*
	 * To. 개발자님
	연도를 넣으면 윤년인지 아닌지를 판단하는 프로그램이 필요합니다.
	입력창에 2000 이라고 넣으면 2000년은 윤년입니다. 이렇게 출력하는 어플 말입니다.
	로직은 아래와 같다고 하니 참조하시구요. 부탁드립니다.
	연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
	그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
	다시 이 값이 100으로 나눠 떨어지면 평년이다.
	평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
	예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
	 */
	public String getLeapYear(int year) {
			if(year % 400 == 0) {
				System.out.println("윤년입니다.");
			}else if(year % 100 == 0) {
				System.out.println("평년입니다.");
			}else if(year % 4 == 0) {
				System.out.println("윤년입니다.");
			}else {
				System.out.println("평년입니다.");
			}
			return "";
	}
	public String getMonthEndDay(int mon) {
			String eval = "";
			switch(mon) {
			case 1 : eval = "1월은 31일 까지입니다.";
			break;
			case 2 : eval = "2월은 28일 까지입니다.";
			break;
			case 3 : eval = "3월은 31일 까지입니다.";
			break;
			case 4 : eval = "4월은 28일 까지입니다.";
			break;
			case 5 : eval = "5월은 31일 까지입니다.";
			break;
			case 6 : eval = "6월은 30일 까지입니다.";
			break;
			case 7 : eval = "7월은 31일 까지입니다.";
			break;
			case 8 : eval = "8월은 31일 까지입니다.";
			break;
			case 9 : eval = "9월은 30일 까지입니다.";
			break;
			case 10 : eval = "10월은 31일 까지입니다.";
			break;
			case 11 : eval = "11월은 30일 까지입니다.";
			break;
			case 12 : eval = "12월은 31일 까지입니다.";
			break;
			default : eval = "Wrong Type";
			break;
			}
			return String.format(eval);
		}
	public String passOrFail(String name, int kor, int eng, int mat) {
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
		result[0] = name;
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
	public String getReportCard(String name, int kor, int eng, int mat) {
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
		result[0] = name;
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
	public String getScoreCalc(int[] list) {
		int average = 0;
		int sum = 0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
			if(list[i] == -1) {
				sum = sum + 1;
				average = sum / i;
				System.out.print("현재까지의 누적값은 ");
				for(int j = 0; j < i; j++) {
					System.out.print(list[j]);
					if(j < i - 1) {
						System.out.print(" + ");
					}else {
						System.out.print(" = " + sum + "이고, 평균은 " + average + "입니다. (소수점이하는 절삭)");
					}
				}
					break;
				}
		}
		return "";
	}
	public String getTax(String name, int pay) {
		double taxRate = 9.7;
		double tax = pay * taxRate /100;
		return String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다.", pay, name, tax);
		}
	public String getTimeCalc(int sec) {
		int hour = sec/60/60;
		int min = (sec/60)%60;
		return String.format("%d시간 %d분 %d초", hour, min, sec%60);
	}

}
