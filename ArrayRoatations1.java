package competitiveQuestions;

import java.util.Scanner;

public class ArrayRoatations1 {

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
			int temp=arr[n-1],i;
			for(i=n-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[i]=temp;
			d--;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
