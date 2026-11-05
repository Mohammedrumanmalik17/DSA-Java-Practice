package interview;

import java.util.HashMap;
import java.util.Map;

public class FreqofEachCharacter {
	public static void printFrqofChars(String str) {
		
		HashMap<Character,Integer>freqMap= new HashMap<>();
		
		for(char ele:str.toCharArray()) {
			freqMap.put(ele, freqMap.getOrDefault(ele, 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer>entry:freqMap.entrySet()) {
			
			System.out.print("Element:"+entry.getKey()+" ");
			System.out.print("Frequency:"+entry.getValue());
			System.out.println();
			
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String str="aaaccbbbbdddddeeeee";
		
     printFrqofChars(str);
	}

}
