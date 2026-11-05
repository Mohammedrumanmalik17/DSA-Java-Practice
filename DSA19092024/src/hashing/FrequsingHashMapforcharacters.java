package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FrequsingHashMapforcharacters {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a string :");
		
		String s=sc.nextLine();
		
		HashMap<Character,Integer>freqMap = new HashMap<>();
		
		for(char c:s.toCharArray()) {
		
		freqMap.put(c,freqMap.getOrDefault(c, 0)+1);
	}
		
		System.out.println("Enter the number of queries");
		int q=sc.nextInt();
		
		while(q>0) {
			System.out.println("Enter the " +q+ "character(s) to know their freq");
			char c =sc.next().charAt(0);
			System.out.println("The frequency of " +c+ " is = " +freqMap.getOrDefault(c, 0));
		}
	}

}
