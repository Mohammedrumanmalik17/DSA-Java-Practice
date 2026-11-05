package hashing;

import java.util.Scanner;

public class FrequencyofCharactersusingHashArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a String to find frequency of each character in it");
		
		String s=sc.nextLine();
		
		
		
		System.out.println("Enter the number of queries");
		int q=sc.nextInt();
		
		//main logic
		
		//create a HashArray of 26 size for lower case 
		//if the case is not specified use create hasharray of size 256
		
		///for lower case the logic is hash[s.charAt(i)-'a']++;
		///for Upper case the logic is hash[s.charAt(i)-'A']++;
		
		//for generic case ,the logic is hash[s.charAt(i)]++ ,it will automatically type
		//cast it to integer to store its #Index
		int size=26;//(size for only lowercase  or uppercase only)
//		int size=256; //for all cases(if case it not mentioned);
		
		int hash[]=new int[size];
		
		for(int i=0;i<s.length();i++) {
//			hash[s.charAt(i)-'a']++; //for lower case only
			hash[s.charAt(i)-'A']++; //for Upper case only
//			hash[s.charAt(i)]++; //for Allcases automatically typecasts to int
		}
		while(q>0) {
			System.out.println("Enter the " +q+ " character(s) whose frequency is to be known :");
			char c=sc.next().charAt(0);	
			
			
//			System.out.println("Frequency of "+c+ " is = " +hash[c-'a']);//for lowercase only
			System.out.println("Frequency of "+c+ " is = " +hash[c-'A']);//for uppercase only
//			System.out.println("Frequency of "+c+ " is = " +hash[c]);//for generic case
			q--;
			}

	}

}
