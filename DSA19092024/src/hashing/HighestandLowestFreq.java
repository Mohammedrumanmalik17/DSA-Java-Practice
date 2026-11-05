package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestandLowestFreq {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		HashMap<Integer,Integer>freqMap= new HashMap<>();
		
		for(int ele :arr) {
			
			freqMap.put(ele, freqMap.getOrDefault(ele, 0)+1);
		}
		
		int largestfrequency=Integer.MIN_VALUE;
		int Smallesfrequency=Integer.MAX_VALUE;
		
		
		int largefreqnum=-1;
		int smallfreqnum=-1;
		
		for(Map.Entry<Integer, Integer>entry :freqMap.entrySet()) {
			
			int num=entry.getKey();
			int freq=entry.getValue();
			
			
			if(freq>largestfrequency) {
				largestfrequency=freq;
				largefreqnum=num;
			}
			
			if(freq < Smallesfrequency) {
				Smallesfrequency=freq;
				smallfreqnum=num;
			}
		}
		
		System.out.println("Largest frequency number is "+largefreqnum+ " with frequency "+largestfrequency);
		System.out.println("Smallest frequency number is "+smallfreqnum+ " with frequency "+Smallesfrequency);
		
	}
}
