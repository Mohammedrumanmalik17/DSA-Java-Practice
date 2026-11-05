package dsa;

public class BubbleSort {
	
	public static void printarr(int arr[] ) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	
	}

	public static void main(String[] args) {
		//bubble sort implementation;
		//loop over the array to find the largest element between 2 and then swap each other;
		
		int arr[]= {7,8,3,1,2};
		
		//time complexity(0(n^2)) not really used ;
		
		for(int i=0;i<arr.length-i;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		printarr(arr);
	}
}
