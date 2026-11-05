package acc;
import java.util.*;

public class TwoSumOptimized {
	
	static void printpairs(int Array[],int size,int targetSum) {
		
		HashSet<Integer>set=new HashSet<>();
		
		for(int element:Array) {
			int complement=targetSum-element;
			if(set.contains(complement)) {
				System.out.print("("+complement+","+element+")");
			}
			set.add(element);
		}
		
	}
	public static void main(String[] args) {
		
		
		int n=5;
		int arr[]= {1,5,7,-1,5};
		int sum=6;
		printpairs(arr,n,sum);
		
	}

}
//(1,5)(7,-1)(1,5)