package acc;
import java.util.*;

public class LenOFLOngestCommonSubstring {
	public static int PrintLenOfLongestSubstr(String s) {
		
		Set<Character>set = new HashSet<>();
		int i=0,j=0,max=0;
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max =Math.max(max, set.size());
				
			}
			else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(PrintLenOfLongestSubstr("pwwkew"));
		System.out.println(PrintLenOfLongestSubstr("cadbzabcd"));
		System.out.println(PrintLenOfLongestSubstr("abcabcbb"));
	}

}
