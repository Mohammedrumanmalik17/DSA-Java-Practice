package acc;
import java.util.*;

public class Checkifdividendisinarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++) {
		A[i]=sc.nextInt();
	}
	
	int Q=sc.nextInt();
	int D=sc.nextInt();
	int R=sc.nextInt();
	
	int dividend=(Q*D)+R;
	
	int ans=-1;
	for(int i=0;i<n;i++) {
		if(A[i]==dividend) {
			ans=i;
			break;
		}
	}
	System.out.println(ans);
}
}
