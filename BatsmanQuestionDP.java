package competitiveQuestions;
import java.util.*;
public class BatsmanQuestionDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n,false));
	}
	static int count(int n,boolean flag) {
		if(n==0) {
			return 1;
		}
		int sum=0;
		if(flag==false&&n>1) {
			sum=sum+count(n-1,false)+count(n-2,true);
		}
		else {
			sum=sum+count(n-1,false);
		}
		return sum;
	}

}
