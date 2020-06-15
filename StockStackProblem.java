package competitiveQuestions;

import java.util.Scanner;

public class StockStackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int span[]=new int[n];
		span[0]=1;
		for(int i=0;i<n;i++) {
			span[i]=1;
			for(int j=i-1;(j>=0)&&(arr[i]>=arr[j]);j--) {
				span[i]++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(span[i]+" ");
		}
	}
}