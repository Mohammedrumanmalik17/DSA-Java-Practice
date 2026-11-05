package acc;

public class SpaceDepStringEvenOdd {
	public static void main(String[] args) {
		String s1 ="he ll o w or ld";
		String s2 ="Hello World";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int S1count=0;
		int s2Count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)== ' ') {
				S1count++;
				
			}
			
		}
		System.out.println(S1count);
		for(int j=0;j<s2.length();j++) {
			if(s2.charAt(j)==' ') {
				s2Count++;
			}
			
		}
		System.out.println(s2Count);
		int result =Math.abs(S1count-s2Count);
		System.out.println(result);
		
		if(result%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
