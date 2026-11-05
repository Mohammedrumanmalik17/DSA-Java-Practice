package problems;

public class SaskenProb {
	
	public static int minimumPowertoDefeat(int input1,int input2[]) {
		
		int l=0;
		int r=input1-1;
		int  mid=input1/2;
		int sum=0;
		while(l<r) {
			int a=input2[l];
			int b=input2[r];
			while(b!=0) {
				int temp=b;
				b=a%b;
				a=temp;
				
			}
			sum+=a;
			l++;
			r--;
		}
		
		
		return sum;
	}
	


	
	
	
	
	public static void main(String[] args) {
		int n=4;
		int array[]= {1,2,3,4};
		
		System.out.println(minimumPowertoDefeat( n, array));
	}
}



//
//example 1 :
//	N=4;
//    array= {1,2,3,4}
//    sum=2;(considering Gcds of start and end and moving forward in the array)
//    
//    
//
//
//example  2 :
//	N=4;
//    array= {1,2,3,4}
//    sum=4;(considering Gcds of start and Middle and moving forward in the array)
//    
    
    
