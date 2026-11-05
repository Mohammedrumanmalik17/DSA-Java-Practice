package acc;

public class UniqueStringBTW2STRS {
	public static String uniqueStringC(String input1,String input2) {
		StringBuilder c =new StringBuilder();
		
		if(!input1.equals(input1.toUpperCase()) ||(!input2.equals(input2.toUpperCase()))) {
			return "";
		}
		
		for(int i=0;i<input1.length();i++) {
			
			
			char ch = input1.charAt(i);
			
			if(input2.indexOf(ch)==-1) {
				c.append(ch);
			}
		}
		
		
		
		for(int j=0;j<input2.length();j++) {
			
			char ch=input2.charAt(j);
			
			if(input1.indexOf(ch)==-1) {
				c.append(ch);
			}
			
		}
		
		
	
	
		return c.toString();
	}
	
	
	
	public static void main(String[] args) {
//		String str1="ABC";
//		String str2="ABCDEFG";
		
//		String str1="ABCDEFGHIJK";
//		String str2="ABC";
		
//		String str1="abc";
//		String str2="bbcdefgh";
		
		
		String str1="abcDEFGH";
		String str2="bbcZXYefgh";
		System.out.println(uniqueStringC(str1,str2));
	}

}
