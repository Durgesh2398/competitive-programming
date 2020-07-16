package competitiveQuestions;

import java.util.Scanner;

public class SumOfAscii2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		for(int j=0;j<str.length();j++) {
			sum=sum+str.charAt(j);	
		}
		System.out.println(sum);
	}

}
