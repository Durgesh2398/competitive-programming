package competitiveQuestions;

import java.util.Scanner;

public class BananaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		String str1="?";
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a'||ch[i]=='A') {
				System.out.print(str1);
				str1=str1.concat("?");
			}
			else {
				System.out.print(ch[i]);
			}
		}
	}

}


/*
public class Practice {

public static void main(String[] args)
{
 	Scanner sc=new Scanner(System.in);
    String str=sc.next();
//	String str="nahahaha";
	int k=1;
	String str1="",str2="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a')
		{
			for(int j=0;j<k;j++)
			{
				str1=str1+"?";
			}
			str2=str2+str1;
			str1="";
			k++;
		}
		else
		{
			str2=str2+str.charAt(i);
		}
	}
	
	System.out.println(str2);
}
}
*/