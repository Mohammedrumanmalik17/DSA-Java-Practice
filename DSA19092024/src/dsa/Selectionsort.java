package dsa;

public class Selectionsort {
public static void printarr(int arr[] ) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	
	}

	
	
	public static void main(String[] args) {
		
		int arr[]= {7,8,3,1,2};
		
		//selection sort
		//time complexity=O(n^2)
		
		//iterate over the array elements by conisdering the first array index and the smallest and 
		
		//then check the if next element is smaller than the smallestindex if yes then swap each other;
		
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			
			
		}
		printarr(arr);
	}
}
