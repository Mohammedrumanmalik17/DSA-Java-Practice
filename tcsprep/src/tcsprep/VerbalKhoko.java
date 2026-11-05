package tcsprep;
import java.util.*;

public class VerbalKhoko {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int[]numb=new int[n];
		for(int i=0;i<n;i++) {
			numb[i]=sc.nextInt();
		}
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(numb[i]==numb[0]) {
				count++;
			}
		}
	System.out.println(n-count);	
	}

}
