package sorting_algorithms;

import java.util.Scanner;

public class SelectionSort {
	
	
	//select the minimum array element and place it at the front of the array
	//by swapping the positions of minimumelement and element at the first index
	
	//time complexity is O(n^2)
	
	public static void selectionsort(int []arr,int n) {
		
		
		
		for(int i=0;i<=n-2;i++) {
			int min=i;
			
			for(int j=i;j<=n-1;j++) {
				
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
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
		
		selectionsort(arr,n);
		System.out.println("After sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
