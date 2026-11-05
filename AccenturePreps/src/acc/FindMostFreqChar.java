package acc;

import java.util.HashMap;
import java.util.Map;

public class FindMostFreqChar {
	public static char findMaxCharCount(String str) {
		
		
		HashMap<Character,Integer>charCountMaP=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			charCountMaP.put(c, charCountMaP.getOrDefault(c, 0)+1);
		}
		int maxCount=0;
		char mostfreqChar=str.charAt(0);
		for(Map.Entry<Character,Integer>entry:charCountMaP.entrySet()) {
			if(entry.getValue()>maxCount) {
				mostfreqChar=entry.getKey();
				maxCount=entry.getValue();
			}
			
		}
		return mostfreqChar;
	}
	
	
	
	
	public static void main(String[] args) {
//		String str="Hello";
		String str="Sample string example";
		
		System.out.println(findMaxCharCount(str));
	}

}
