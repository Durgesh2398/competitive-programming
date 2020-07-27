package competitiveQuestions;

import java.util.Scanner;

public class SumOfAsciiConstonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(solution(str,0));
	}
	static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        return true;
        
        return false;
            
    }
   
   static String solution(String str, int index){
       if(index>=str.length())
            return "";
       
       char firstC = str.charAt(index);

       boolean vowel = isVowel(firstC);
       int sum = firstC;
       
       
        index=index+1;
        while(index<str.length()){
            char small = str.charAt(index);
           
            boolean smallAns = isVowel(small);
            sum+=small;
            if(vowel!=smallAns)
                break;
            
            
            
            index++;
        }
        
        return (""+sum+solution(str, index+1));
   }
}