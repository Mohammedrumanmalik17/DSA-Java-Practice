package acc;

public class MaxLenSubStrwoInterrp {
	public static int maxlenofsubstr(String input) {
		
		
		int currlen=0;
		int maxlen=0;
		for(char ch:input.toCharArray()) {
			if(ch!='.') {
				currlen++;
				
			}
			else {
				maxlen =Math.max(maxlen, currlen);
				currlen=0;
			}
		}
		 maxlen=Math.max(maxlen, currlen);
		 return maxlen;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String input = "abc.aa.bbaace";
		System.out.println(maxlenofsubstr(input));
	}

}
