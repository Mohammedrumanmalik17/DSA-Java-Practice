package interview;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	
	public static void main(String[] args) {
		String str="aabbccdddde";
		
		LinkedHashMap<Character,Integer>freqMap=new LinkedHashMap<>();
		
		for(char ele:str.toCharArray()) {
			
			freqMap.put(ele, freqMap.getOrDefault(ele,0)+1);
	
		}
		for(Map.Entry<Character, Integer>entry:freqMap.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println("First Non repeating Char :"+entry.getKey());
				break;
			}
		}
	}
	

}
