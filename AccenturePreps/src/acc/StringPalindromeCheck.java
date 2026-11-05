package acc;

public class StringPalindromeCheck {
	
	static boolean isPalindrome(String word) {
		int len = word.length();
		
		for(int i=0;i<len/2;i++) {
			if(word.charAt(i)!=word.charAt(len-i-1)){
				return false;
				
				
			}
		}
		return true;
	}
public static void main(String[] args) {
	
	
	
//	String str="madam";
	String str="mom";
//	String str="rUMAN";
	if(isPalindrome(str)) {
		System.out.println("Is a Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
}
}
