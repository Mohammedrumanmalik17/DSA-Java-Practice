package interview;

public class MissingNumberinArray {
	
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9,11};
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		
		
		for(int i=0;i<arr.length;i++) {
			sum-=arr[i];
		}
		System.out.println("The missing number is :"+sum);
	}

}
