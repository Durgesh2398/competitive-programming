package competitiveQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeRearange {

	static  int isPalinNumPossible(String str) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				list.remove((Character) str.charAt(i));
			} else {
				list.add(str.charAt(i));
			}
		}
		
		if (str.length() % 2 == 0 && list.isEmpty()|| (str.length() % 2 == 1 && list.size() == 1))
		{
			//System.out.print("2");
			return 2;
		}
		else
		{
			//System.out.print("1");
			return 1;
		}

	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		PalindromeRearange palin=new PalindromeRearange();
		if(palin.isPalinNumPossible(s)==2)
			{
				System.out.print("yes");
			}
		else {
			System.out.print("No");
		}
	}


}
