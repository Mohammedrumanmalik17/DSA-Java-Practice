package acc;

public class CommonElebtw2strings {
	public static String commonElementsInStrings(String str1,String str2) {
		
		StringBuilder common = new StringBuilder();
		
		if(!str1.equals(str1.toUpperCase()) || !str2.equals(str2.toUpperCase())) {
			return "";
		}
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			
			if(str2.indexOf(ch)!=-1 && common.indexOf(String.valueOf(ch))==-1) {
				common.append(ch);
			}
		}
		return common.toString();
	}

	
	
	
	public static void main(String[] args) {
		String s1="ABC";
		String s2="ABCDEFGH";
		System.out.println(commonElementsInStrings(s1,s2));
	}

}
