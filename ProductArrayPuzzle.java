package competitiveQuestions;

import java.util.Scanner;

public class ProductArrayPuzzle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Solution(arr,arr.length);
	}
	static void Solution(int arr[],int n) {
		if(n==1) {
			System.out.println(0);
			return;
		}
		int left[]=new int[n];
		int right[]=new int[n];
		int prod[]=new int[n];
		left[0] = 1; 
        right[n - 1] = 1; 
        int i,j;
        for (i = 1; i < n; i++) { 
            left[i] = arr[i - 1] * left[i - 1];
        }
        for (j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1]; 
		}
        for (i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];   
		}
        for (i = 0; i < n; i++) {
            System.out.print(prod[i] + " ");
        }
        return;	
	}

}
