package tcsprep;
import java.util.*;
public class PalindromeCheck {
	
	public static int isPalindrome(char inputStr[],int length) {
		
		if(length<=1) {
			return 0;
		}
		int l=0;
		int r=length-1;
		
		while(l<r) {
			if(inputStr[l]!=inputStr[r]) {
				return 0;
				
			}
			l++;
			r--;
		}
		return 1;
		
	}
	
public static void main(String[] args) {
	System.out.println(isPalindrome("DEED".toCharArray(), 4));
	System.out.println(isPalindrome("383".toCharArray(), 3));
	System.out.println(isPalindrome("DeED".toCharArray(), 4));
	System.out.println(isPalindrome("malayalam".toCharArray(), 9));
	
}

}
