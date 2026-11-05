package sorting_algorithms;

import java.util.Arrays;

public class Quicksort {
	
	//Pick a pivot element and place it in its correct position in the sorted array
	//place smaller elements on the left of pivot and larger elements on the right of the pivot
	//time complexity is O(Nlogn)
	//space complexity is O(1) because it doesn't uses any extra temp array like merge-sort
	
	//It is "DIVIDE AND CONQUER" ALGORITHM
	//pivot can be any element in the array not just the first element or the last array element
	
	
	//step1: pick a pivot and place it in its correct position in the sorted array
	//step2: smaller elements on the left of pivot and greater on the right
	//step3:after recursive calls ,you will get the sorted array
	
	
	public static int findParition(int [] arr,int low,int high) {
		
		int pivot=arr[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			
			while(arr[i]<=pivot && i<=high -1) {
				i++;
			}
			
			while(arr[j]>pivot &&j>=low +1) {
				j--;
			}
			
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;
		
		return j;
	}
	public static void quickSort(int[] arr,int low,int high) {
		
		if(low<high) {
			
			int partitionIndex=findParition(arr,low,high);
			quickSort(arr,low,partitionIndex-1);
			quickSort(arr,partitionIndex+1,high);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {14,3,2,6,7,9,5};
		System.out.println("Before sorting: " +Arrays.toString(arr));
		
		quickSort(arr,0,arr.length-1);
		System.out.println("After sorting: " +Arrays.toString(arr));
	}

}
