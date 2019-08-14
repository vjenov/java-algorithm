package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			result += (i==10) ? i+" = " : i+" + ";
		}
		System.out.print(result+sum);
	}

}
