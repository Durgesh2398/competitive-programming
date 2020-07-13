package competitiveQuestions;

import java.util.Scanner;

public class WeightOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int option =sc.nextInt();
		int weight=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLetter(c) && option ==1) {
				weight=weight+(int)c-96;
			}
			else if(Character.isLetter(c)&& option ==0)
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				continue;
				weight=weight+(int)c-96;
			}
		}
		System.out.println(weight);
	}

}
