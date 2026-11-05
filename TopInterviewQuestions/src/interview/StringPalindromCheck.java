package interview;

public class StringPalindromCheck {
	
	
	
	
	
	public static void main(String[] args) {
//		String str="Malayalam";
		String str="Sasken";
//		String str="Mom";
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println("Revsersed string :"+rev);
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
