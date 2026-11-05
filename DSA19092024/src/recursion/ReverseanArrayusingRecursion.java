package recursion;

import java.util.Arrays;

public class ReverseanArrayusingRecursion {
	
	
	public static void main(String[] args) {
		
		int n=5;
		int arr[]= {1,2,3,4,5};

		System.out.println("Original Array : "+Arrays.toString(arr));
		 reversearray(0,arr,n);
		 System.out.println("Reversed Array : " +Arrays.toString(arr));
	}
	
	public static void reversearray(int i,int []arr,int n) {
		
		
		if(i>=n/2) {
			return;
		}
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
	
		reversearray(i+1, arr, n);
	}
	


}
