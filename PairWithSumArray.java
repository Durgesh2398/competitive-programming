package competitiveQuestions;

import java.util.Scanner;

public class PairWithSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		if(pairInSortedRotated(arr,n,sum)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	static boolean pairInSortedRotated(int arr[], int n, int x) { 
		int i; 
		for (i = 0; i < n - 1; i++) 
			if (arr[i] > arr[i+1]) 
				break; 
		int l = (i + 1) % n;
		int r = i; 
		while (l != r) { 
			if (arr[l] + arr[r] == x) 
				return true; 
			if (arr[l] + arr[r] < x) 
				l = (l + 1) % n; 
			else 
				r = (n + r - 1) % n; 
		} 
		return false;
	}
}