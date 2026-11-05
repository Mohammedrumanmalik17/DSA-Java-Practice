package acc;
import java.util.*;
public class CheckIFSUMIS1HOUR {
public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	
	int n =sc.nextInt();
	int []arr = new int [n];
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int ans =0;
	int mod =(int)(1e9+7);
	
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			
			int temp=(arr[i]%60+arr[j]%60);
			if(temp%60==0) {
				ans++;
				ans=ans%mod;
			  
			}
		}
	}
	System.out.println(ans);
}
}
//4
//1 59 30 30
//2

//
//1
//60
//0


//the above was bruteforce solution






