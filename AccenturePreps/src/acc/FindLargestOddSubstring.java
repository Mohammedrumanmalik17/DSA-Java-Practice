package acc;

public class FindLargestOddSubstring {
	public static String largestoddsubstr(String inp) {
		
		String largestOddSubString="";
		for(int i=inp.length();i>0;i--) {
			String substr=inp.substring(0,i);
			if(Integer.parseInt(substr)%2!=0) {
				largestOddSubString=substr;
				break;
			}
		}
		return largestOddSubString.isEmpty()?"No odd substring found":largestOddSubString;
		
	}
	
	
	
	
	public static void main(String[] args) {
//		String input="123456";
//		String input="504";
		String input="301752";
		
		String result=largestoddsubstr(input);
		System.out.println(result);
	}

}
//12345
//5
//30175

