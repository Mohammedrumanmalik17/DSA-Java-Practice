package acc;

import java.util.HashMap;

public class FirstDoubleOccurenceChar {
	
	public static char firstCharOccuringTwice(String str) {
		
		HashMap<Character,Integer>freqmap = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char currChar=str.charAt(i);
			
			if(freqmap.containsKey(currChar)) {
				return currChar;
			}
			else {
				freqmap.put(currChar, 1);
			}
		}
		return '\0';
	}
	
	
	
	public static void main(String[] args) {
		String s="abcba";
//		String s="abcdef";
		
		char result =firstCharOccuringTwice(s);
		if (result!='\0') {
		System.out.println(result);
	}
	}

}
