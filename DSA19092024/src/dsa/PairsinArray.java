package dsa;

public class PairsinArray {
	public static void printpairs(int array[]) {
		int countofPairs=0;
		
		for(int i=0;i<array.length;i++) {
			int curr=array[i];
			
			for(int j=i+1;j<array.length;j++) {
				
				System.out.print("(" + curr + "," +array[j] +")" );
				countofPairs++;
			}
			System.out.println();
		}
		System.out.println("Total number of pairs : "+countofPairs);
		
		//formula to count pairs  n(n-1)/2;
	}

	
	
	
	
	public static void main(String[] args) {
		int array[]= {2,4,6,8,10};
		
		printpairs(array);
	}
}
