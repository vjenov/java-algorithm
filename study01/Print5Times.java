package study01;

import java.util.Scanner;

public class Print5Times {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("진행 1, 스톱 0");
		int flag = scan.nextInt();
		while(flag <= 2) {
			System.out.println("안녕");
			flag++;
		}
		System.out.println("while에서 빠져나옴");
		*/
		while(true){
			System.out.println("진행 1, 스톱 0");
			int flag = scan.nextInt();
			switch(flag) {
			case 0 : 
				System.out.println("시스템 종료");
				System.out.println("while문에서 빠져나옴.");
				return;
			case 1 : 
				System.out.println("시스템 진행");
				break;
			}
			System.out.println("안녕");
			/*
			if(flag == 0) {
				break;
			}else if(flag == 1) {
				System.out.println("안녕");
			}
			*/	
			}
	}
	
}
	

