package competitiveQuestions;

import java.util.Scanner;
import java.util.*;
class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        for (long i = 1;; i++) {
            if (isPalindrome(num - i))
                return "" + (num - i);
            if (isPalindrome(num + i))
                return "" + (num + i);
        }
    }
    boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
    }
}
public class closestPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution obj=new Solution();
		Scanner sc =new Scanner(System.in);
		//int n=sc.nextInt();
		String str=sc.next();
		System.out.println(obj.nearestPalindromic(str));
	}
}
/*
public String nearestPalindromic(String n) {
    int order = (int) Math.pow(10, n.length()/2);
    Long ans = Long.valueOf(new String(n));
    Long noChange = mirror(ans);
    Long larger = mirror((ans/order)*order + order+1);
    Long smaller = mirror((ans/order)*order - 1 );
    if ( noChange > ans) {
        larger = (long) Math.min(noChange, larger);
    } else if ( noChange < ans) {
        smaller = (long) Math.max(noChange, smaller); 
    }       
    return String.valueOf( ans - smaller <= larger - ans ? smaller :larger) ;
}
Long mirror(Long ans) {
    char[] a = String.valueOf(ans).toCharArray();
    int i = 0;
    int j = a.length-1;
    while (i < j) {
        a[j--] = a[i++];
    }
    return Long.valueOf(new String(a));
}


*/