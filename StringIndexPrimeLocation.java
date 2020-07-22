package competitiveQuestions;

import java.util.Scanner;

public class StringIndexPrimeLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		prime_index(input); 
	}
	static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) return false; 
      
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    } 
      
    // Function to print  
    // character at prime index 
    static void prime_index(String input) 
    { 
        int n = input.length(); 
      
        // Loop to check if  
        // index prime or not 
        for (int i = 2; i <= n; i++)  
            if (isPrime(i))  
  
                System.out.print 
                (input.charAt(i - 1));          
    } 

}
