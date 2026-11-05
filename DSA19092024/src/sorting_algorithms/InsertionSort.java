package sorting_algorithms;

import java.util.Scanner;

public class InsertionSort {
	
	
	//take the element and place it in its correct position by swapping and swapping till it is possible
	//average and worst case timecomplexity O(n^2)
	
	//Best case time complexity O(n) when the array is sorted such as 1,2,3,4
	//no swap happens
	
	
	public static void Insertion_sort(int arr[],int n) {
		
		
		for(int i=0;i<=n-1;i++) {
			int j=i;
			
			while(j>0 &&arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			
			}
		}
	}
	
	public static void main(String[] args) {
		
 		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n =sc.nextInt();
		
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Insertion_sort(arr,n);
		System.out.println("After sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
