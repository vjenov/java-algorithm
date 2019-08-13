package homeWork01;

import java.util.Scanner;

class ID{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = new String();
        while(true) {
        System.out.println("주민번호를 -포함하여 입력하세요 : , 종료를 원하시면 x를 여덟번 누르세요");
        ssn = scan.nextLine();
        if(ssn.equals("xxxxxxxx")) {
        	break;
        }
        int num = Integer.parseInt(ssn.substring(7,8));
        String gender = "";
        switch(num) {
        	case 9 : gender = "1800 ~ 1899년에 태어난 남성";
        	break;
        	case 0 : gender = "1800 ~ 1899년에 태어난 여성";
        	break;
        	case 1 : gender = "1900 ~ 1999년에 태어난 남성";
        	break;
        	case 2 : gender = "1900 ~ 1999년에 태어난 여성";
        	break;
        	case 3 : gender = "2000 ~ 2099년에 태어난 남성";
        	break;
        	case 4 : gender = "2000 ~ 2099년에 태어난 여성";
        	break;
        	case 5 : gender = "1800 ~ 1899년에 태어난 외국인 남성";
        	break;
        	case 6 : gender = "1800 ~ 1899년에 태어난 외국인 여성";
        	break;
        	case 7 : gender = "1800 ~ 1899년에 태어난 외국인 남성";
        	break;
        	case 8 : gender = "1800 ~ 1899년에 태어난 외국인 여성";
        	break;
        	default : gender = "잘못 입력하셨습니다.";
        	break;
            }
        System.out.println(gender);
        }
    }
}
