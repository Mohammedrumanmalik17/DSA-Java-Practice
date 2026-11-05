package acc;

public class LexSmallstring {
	
	public static void lexicographSmallStr(String s1,String s2) {
		
		
		
		int i=0,j=0;
		while(i<s1.length()&& j<s2.length()) {
			
			char c1 = Character.toLowerCase(s1.charAt(i));
			char c2 = Character.toLowerCase(s2.charAt(j));
			
			if(c1>c2) {
				System.out.println(1);
				return;
			}
			else if (c1<c2) {
				System.out.println(-1);
				return;
			}
			i++;
			j++;
		}
		if(s1.length()>s2.length()) {
			System.out.println(1);
		
		}
		else if(s1.length()<s2.length()) {
			System.out.println(-1);
		
		}
		else {
			System.out.println(0);
		}
		
		
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		String s1="banana";
//		String s2="apple";
//		  1
		
//		String s1="apple";
//		String s2="apple";
//		0
		
		
		String s1="grape";
		String s2="orange";
//		-1
		
		
	lexicographSmallStr(s1,s2);
	}
}
//1//