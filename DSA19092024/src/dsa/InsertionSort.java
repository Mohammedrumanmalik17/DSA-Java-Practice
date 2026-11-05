package dsa;

public class InsertionSort {
	
public static void printarr(int arr[] ) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	
	}
public static void main(String[] args) {
	
	//insertion sorted
	//divide the array into sorted and unsorted array sort|unsorted
	//check if unsorted array elmnt is less than sorted if yes then check next sorted elem if true then swap
	
	int arr[]= {7,8,3,1,2};
	
	for(int i=1;i<arr.length;i++) {
		
		int current=arr[i];
		int j=i-1;
		while(j>=0 &&current <arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		//placement
		arr[j+1]=current;
	}
	printarr(arr);

	
}
}
