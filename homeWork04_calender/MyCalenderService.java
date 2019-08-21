package homeWork04_calender;

public class MyCalenderService {
	public String getEndDay(MyCalender mc) {
		String endDay = "";
		switch(mc.getMonth()) {
		case 1 : endDay = "31일";
		break;
		case 2 : endDay = "29일";
		break;
		case 3 : endDay = "31일";
		break;
		case 4 : endDay = "30일";
		break;
		case 5 : endDay = "31일";
		break;
		case 6 : endDay = "30일";
		break;
		case 7 : endDay = "31일";
		break;
		case 8 : endDay = "31일";
		break;
		case 9 : endDay = "30일";
		break;
		case 10 : endDay = "31일";
		break;
		case 11 : endDay = "30일";
		break;
		case 12 : endDay = "31일";
		break;
		default : endDay = "잘못입력하셨습니다.";
		break;
		}
		return endDay;
	}
	public String isLeapYear(MyCalender mc) {
		String leapYear = "";
		if(mc.getYear() == 0) {
			leapYear = "Wrong Type";
		}else if(mc.getYear() % 400 == 0) {
			leapYear = "윤년입니다.";
		}else if(mc.getYear() % 100 == 0) {
			leapYear = "평년입니다.";
		}else if(mc.getYear() % 4 == 0) {
			leapYear = "윤년입니다.";
		}else {
			leapYear = "평년입니다.";
		}
		return leapYear;
	}
}
