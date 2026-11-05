package interview;

import java.util.HashSet;

public class SaskenTECHINTERVQUES {
	
	public static void solveusinghashset(String s) {
		
		HashSet<Character>seen=new HashSet<>();
		
		StringBuilder result=new StringBuilder();
		
		
		for(char c:s.toCharArray()) {
			
			if(seen.contains(c)) {
				result.append('-');
			}
			else{
				seen.add(c);
			
			result.append(c);
			}
		}
	System.out.println("using hashset new string :"+result.toString());
		
		
	}
	
	
	
	
public static void main(String[] args) {
	String s="Mohammed Ruman Malik";
	StringBuilder result=new StringBuilder(s);
	
	for(int i=0;i<result.length();i++) {
		for(int j=i+1;j<result.length();j++) {
			if(result.charAt(i)==result.charAt(j)) {
				result.setCharAt(j, '-');
			}
		}
	}
	System.out.println(result.toString());
	
	
	
	//using hashset
	
	solveusinghashset(s);
}





}
