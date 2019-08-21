package homeWork04_calender;

import javax.swing.JOptionPane;

public class MyCalenderController {
	public static void main(String[] args) {
		MyCalender mc = new MyCalender();
		MyCalenderService service = new MyCalenderService();
		switch(JOptionPane.showInputDialog("1. 말일확인, 2. 윤년확인")) {
		case "1" : 
			String mon = JOptionPane.showInputDialog("달을 입력하세요 : ");
			mc.setMonth(Integer.parseInt(mon));
			JOptionPane.showMessageDialog(null, mon + "월은 " + service.getEndDay(mc) + "까지입니다.");
			break;
		case "2" :
			String age = JOptionPane.showInputDialog("년도를 입력하세요 : ");
			mc.setYear(Integer.parseInt(age));
			JOptionPane.showMessageDialog(null, age + "년은 " + service.isLeapYear(mc));
			break;
		default :
			System.out.println("Wrong Type");
		}
	}
}
