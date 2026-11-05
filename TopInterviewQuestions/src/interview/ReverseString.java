package interview;

public class ReverseString {
	public static void reverseString(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse of "+str+ " is : "+rev);
	}
//	public static void StringBuilderrev(String S) {
//		StringBuilder reversed = new StringBuilder(S);
//		reversed=reversed.reverse();
//		System.out.println(reversed.toString());
//	}
	
	public static void main(String[] args) {
		String str="ruman";
		reverseString(str);
//		StringBuilderrev(str);
	}

}
