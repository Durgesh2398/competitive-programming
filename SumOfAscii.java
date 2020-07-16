package competitiveQuestions;
import java.util.Scanner;
public class SumOfAscii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		int count[]=new int[256];
		int i; 
        for (i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ') { 
                count[(int)str.charAt(i)]++;
            }
        }
        int n = i; 
        for (i = 0; i < n; i++) {
            if (count[(int)str.charAt(i)] == 1) {
            	sum=sum+str.charAt(i);
            }
        }
		System.out.println(sum);
	}
}