package tcsprep;
import java.util.*;



public class FairSequence {
	public static void alternatingSequence(int a[],ArrayList<Integer>sequence,boolean flag) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
			if(flag==true) {
				sequence.add(a[i]);
				flag=false;
		                   }
		              }
			else {
				if(flag==false) {
					sequence.add(a[i]);
					flag=true;
				}
			}
			
		}
	}
	
	
	
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int n =sc.nextInt();
    	int a[]=new int[n];
    	
    	for(int i =0;i<n;i++) {
    		a[i]=sc.nextInt();
    	}
    	
    	ArrayList<Integer>sequence =new ArrayList<Integer>();
    	
    	if(a[0]>0) {
    		boolean flag=true;
    		alternatingSequence(a, sequence, flag);
    	}
    	else {
    		boolean flag=false;
    		alternatingSequence(a, sequence, flag);
    	}
		int maxSum=0;
		for(int sum:sequence) {
			maxSum+=sum;
			
		}
		System.out.println(maxSum);
   
    }
}
