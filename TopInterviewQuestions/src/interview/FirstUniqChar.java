package interview;

import java.util.LinkedHashMap;

public class FirstUniqChar {
	
	
	public static void main(String[] args) {
		String str="mississipim";
		
		char result =firstUniqChar(str);
		System.out.println("FIRST NON REPEATING CHAR IS : " + result);
		
		
	}
	public static char firstUniqChar(String s) {


        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();

        for(char ele:s.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
         for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
                
            }
        }
        return '\0';

        
    }

}
