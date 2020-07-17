package competitiveQuestions;

import java.util.Scanner;

public class CyclicSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int num1=sc.nextInt();
         System.out.println("Given number = " + num1);
        int sum=0;
        int sum1=0;
        while(num1!=0){
            sum=sum+(num1 % 10);
            sum1=sum1+sum;
            num1=num1/10;
        }
       
        System.out.println("Cyclic sum = " + sum1);
	}

}
