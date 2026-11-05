package dsa;

public class BinarySearch {
	public static int BinarySearchex(int []numbers,int key) {
		
		int start=0;
		int end=numbers.length-1;
		
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			
			//comparisions
			
			if(numbers[mid]==key) {
				return mid;  //key is present at mid index;
			}
			
			if(numbers[mid]<key) {
				start=mid+1;//right half 
			}
			else {
				end=mid-1; //left half
			}
		}
		return -1;  //if key is not found;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10};
//		int key=10;
		int key=14;
		
		System.out.println(BinarySearchex(numbers,key));
	}

}
