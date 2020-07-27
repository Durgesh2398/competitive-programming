package competitiveQuestions;

import java.util.Scanner;

public class NambiarNumberEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(nambiarNumber(str, 0));
	}
	static String nambiarNumber(String str, int i) { 
        if (i >= str.length()) 
            return ""; 
        int firstDigit = (str.charAt(i) - '0'); 
        int digitParity = firstDigit % 2; 
        int sumDigits = 0; 
        while (i < str.length()) { 
            sumDigits += (str.charAt(i) - '0'); 
            int sumParity = sumDigits % 2; 
            if (digitParity != sumParity) { 
                break; 
            } 
            i++; 
        } 
        return ("" + sumDigits + nambiarNumber(str, i + 1)); 
    } 

}
