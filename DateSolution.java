package competitiveQuestions;

import java.util.*;
import java.util.Scanner;

public class DateSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int str=sc.nextInt();
		int str1=sc.nextInt();
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		solution(str,str1,a1,a2);
	}
	public static void solution(int str,int str1, int a1,int a2) {
		for(int i=str;i<=str1;i++) {
			
			System.out.println(i+":"+a1);
			a1=a1+5;
		}
	}

}
