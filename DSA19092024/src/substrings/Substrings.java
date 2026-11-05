package substrings;

public class Substrings {
	
	public static void main(String[] args) {
		
		String s="abcd";
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				
////				for(int k=i;k<=j;k++) {
////					System.out.print(s.charAt(k));
////				}
//				System.out.println();
				System.out.println(s.substring(i,j));
				
				
			}
		}
	}

}
