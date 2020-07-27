package competitiveQuestions;

import java.util.Scanner;

public class SwappingFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=0;
		int num2=num;
		while(num2>0) {
			num2/=10;
			n++;
		}
        int firstDigit = num/(int)Math.pow(10,n-1);
        int lastDigit = num%10;
        num = (num%(int)Math.pow(10,n-1))+(lastDigit*(int)Math.pow(10,n-1));
        num = num/10;
        num = num*10+firstDigit;
        System.out.println(num);
		
	}

}
