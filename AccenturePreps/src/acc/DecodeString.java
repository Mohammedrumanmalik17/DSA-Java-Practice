package acc;

public class DecodeString {
	
	public static void decryptyString(String s) {
		
		StringBuilder output = new StringBuilder();
		int currCount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				currCount++;
			}
			else{
				if(currCount>0) {
					output.append((char)(64 +currCount));
					currCount=0;
				}
			}
			
		}
		if(currCount>0) {
			output.append((char)(64 +currCount));
			
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
//		String input="10110111011110";
		String input="1011110111011110";
		decryptyString(input);
	}

}
