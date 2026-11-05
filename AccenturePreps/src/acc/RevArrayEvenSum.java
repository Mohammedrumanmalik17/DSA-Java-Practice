package acc;

public class RevArrayEvenSum {
	public static int revEvenPosSum(int []arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int Revidx=arr.length-i-1;
			if(Revidx%2==0) {
				sum+=arr[i];
				
			}
		}
		return sum;
	}

	
	
	
	
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		System.out.println(revEvenPosSum(arr));
	}
}
