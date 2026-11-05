package acc;

import java.util.Arrays;

//program to check if string 2 can be made using characters of string 1

public class CheckStrFormation {
	public static boolean checkStringFormationispossible(String s,String r) {
		
		
		char[]s1=s.toCharArray();
		char[]s2=r.toCharArray();
		Arrays.sort(s1);
//		System.out.println(s1);
		Arrays.sort(s2);
//		System.out.println(s2);
		if(Arrays.equals(s1, s2)) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
	
	public static void main(String[] args) {
		String O="listen";
		String F="silent";
		
		System.out.println(checkStringFormationispossible(O,F));
		
	}
}
