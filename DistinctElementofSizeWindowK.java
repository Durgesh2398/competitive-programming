package competitiveQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctElementofSizeWindowK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of inputs");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter window size");
		int k=sc.nextInt();
		Solution(arr,arr.length,k);
	}
	static void Solution(int arr[],int n,int k) {
		for(int i=0;i<n-k;i++) {
			System.out.print(countWindow(Arrays.copyOfRange(arr,i,arr.length),k));
		}
	}
	static int countWindow(int arr[],int k) {
		int dist=0;
		for(int i=0;i<k;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					break;
				}
			}
			if(j==i){
				dist++;
			}
		}
		return dist;
	}

}
