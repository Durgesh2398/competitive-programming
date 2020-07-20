package competitiveQuestions;

import java.util.Scanner;

public class ArrayRoatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		while(d>0) {
			int temp=arr[0],i;
			for(i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[i]=temp;
			d--;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
