package study02;
import java.util.Scanner;
public class OddSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int sum = 0;
		System.out.println("첫번 째 값을 입력");
		int i = scan.nextInt();
		System.out.println("두번 째 값을 입력");
		int j = scan.nextInt();
		if(i < j) {
		for(int a = i; i <= j; i++) {
			if(i%2 != 0) {
				if(j%2 == 0) {
					if(i == j-1) {
						result += i + " = ";
						}else {
						result += i + " + ";
						}
				}else if(j%2 != 0) {
					if(i == j) {
						result += i + " = ";
					}else {
					result += i + " + ";
					}
				}
			}
				sum += i;
			}
		}else if(i > j) {
			for(int a = j; j <= i; j++) {
				if(j%2 != 0) {
				if(i%2 == 0) {
					if(j == i-1) {
						result += j + " = ";
						}else {
						result += j + " + ";
						}
				}else if(i%2 != 0) {
					if(i == j) {
						result += j + " = ";
					}else {
					result += j + " + ";
					}
				}
			}
				sum += j;
			}
		}
		System.out.print(result + sum);
	}
	
}

	

	
		
		/*
		String result = "";
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				if(i == 10-1) {
					result += i +" = ";
				}else {
					result += i +" + ";
				}
			sum += i;
			}
		}
		System.out.print(result + sum);
		*/
	