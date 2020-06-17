package competitiveQuestions;

import java.util.Scanner;

public class kadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		maxSubArray(arr,arr.length);
	}
	static void maxSubArray(int arr[],int n) {
		int sum=Integer.MIN_VALUE,max=0;
		for(int i=0;i<n;i++) {
			max=max+arr[i];
			if(sum<max) {
				sum=max;
			}
			if(max<0) {
				max=0;
			}
		}
		System.out.println(sum);
	}

}
