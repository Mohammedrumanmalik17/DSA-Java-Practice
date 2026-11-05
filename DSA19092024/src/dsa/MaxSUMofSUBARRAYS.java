package dsa;
import java.util.*;

public class MaxSUMofSUBARRAYS {

	public static void main(String[] args) {
		int[]arr= {3,-4,5,4,-1,7,-8};
		
	
		int maxSum=Integer.MIN_VALUE;
		 int currSum = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			currSum+=arr[i];
			maxSum=Math.max(currSum,maxSum);
			
			if(currSum<=0) {
				currSum=0;
			}
			
		}
		System.out.println("maximum sum of subarrays is "+maxSum);

		
		
	}
	

}



