package homeWork02;
import java.util.Scanner;
/*
 * To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요.
 */
public class Ranking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			String[] players = new String[3];
			players[0] = "A";
			players[1] = "B";
			players[2] = "C";
			double[] records = new double[3];
			System.out.println("A 선수의 기록을 입력하세요 : ");
			records[0] = scan.nextDouble();
			System.out.println("B 선수의 기록을 입력하세요 : ");
			records[1] = scan.nextDouble();
			System.out.println("C 선수의 기록을 입력하세요 : ");
			records[2] = scan.nextDouble();
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
	}
}
