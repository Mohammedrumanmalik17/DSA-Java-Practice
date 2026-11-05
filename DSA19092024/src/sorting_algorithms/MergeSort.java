
package sorting_algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.*;



public class MergeSort {
	
	//merge sort can be performed using recursion
	//it follows divide and merge principle
	//the time complexity is O(nlogn)
	//logbase2n because if there are array of 16 elements and we have to divide and divide
	//it will take 4 steps 16->8->4->2->1
	//mathematically logbase2(16)=4
	
	
	public static void merge(int arr[],int low,int mid,int high) {
		
	     ArrayList<Integer> list=new ArrayList<>();
	
		
		int left=low;
		int right=mid+1;
		
		while(left<=mid && right<=high) {
			
			if(arr[left]<=arr[right]) {
			list.add(arr[left]);
			left++;
			}
			else {
				list.add(arr[right]);
				right++;
			}
			
		}
		
		while(left<=mid) {
			list.add(arr[left]);
			left++;
			
		}
		
		while(right<=high) {
			list.add(arr[right]);
			right++;
		}
		
		int[] temp = list.stream().mapToInt(Integer::intValue).toArray();

		
		for(int i=low;i<=high;i++) {
			arr[i]=temp[i-low];
		}
	}
	public static void mergeSort(int arr[],int low,int high) {
		if(low>=high)return;
		
		int mid=(low+high)/2;
		
		
		
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		
		merge(arr,low,mid,high);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,3,2,24};
		
		int low=0;
		int high=arr.length-1;
		
		System.out.println("before merge sort :" + Arrays.toString(arr));
		
		mergeSort(arr,low,high);
		System.out.println("After sorting :"+Arrays.toString(arr));
		
		
	}

}
