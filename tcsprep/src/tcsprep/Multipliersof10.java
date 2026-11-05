package tcsprep;
import java.util.*;

public class Multipliersof10 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i;
    	
    	int n=sc.nextInt();
    	int numbers[]=new int [n];
    	for( i =0;i<n;i++) {
    		numbers[i]=sc.nextInt();
    	}
    	for( i=0;i<n;i++) {
    		if(numbers[i]%10!=0) {
    			System.out.format("%d",numbers[i]);
    			System.out.print(" ");
    		}
    	}
    	for(i=0;i<n;i++) {
    		if(numbers[i]%10==0) {
    			System.out.format("%d",numbers[i]);
    			System.out.print(" ");
    		}
        
 
        
    }
}
}