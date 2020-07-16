package competitiveQuestions;
import java.util.Scanner;
public class LargestPositiveSubsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int maxIdx = 0, maxLen = 0, currLen = 0, currIdx = 0;
		for (int k = 0; k < num; k++)  { 
            if (arr[k] > 0) { 
                currLen++; 
                if (currLen == 1)  
                    currIdx = k;          
            } 
            else{ 
                if (currLen > maxLen)  { 
                    maxLen = currLen; 
                    maxIdx = currIdx; 
                } 
                currLen = 0; 
            } 
        } 
        if (maxLen > 0)  { 
            System.out.print( "Length " + maxLen) ;  
            System.out.print( ",starting index " + maxIdx ); 
        } 
        else
            System.out.println("No positive sequence detected.") ; 
	}
}
