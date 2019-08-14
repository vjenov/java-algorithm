package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			result += (i == 5) ? i+" = " : i+" + "; // 삼항연산자
			sum += 0+i;
		}
		System.out.println(result + sum);
		}
			/*
			switch(i) {
			case 5 : System.out.print(i+"=");
			break;
			default : System.out.print(i+"+");
			break;
			}
			*/
			
			 
			/*
			String result = "";
			if(i == 5) {
				result = i+"=";
			}else {
				result = i+"+";
			}
			*/
			/*
			result = (i == 5) ? i+"=" : i+"+"; // 삼항연산자
			System.out.print(result);
			*/
		
		
		/*
		for(int i = 1; i < 5; i++) {
			System.out.print(i+"+");
			}
			System.out.print(i+"=");
			*/
	}


