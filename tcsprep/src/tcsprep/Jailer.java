package tcsprep;
import java.util.*;
public class Jailer {
	
	
	
	public static int JailerPrisonerCandies(int n,int m, int s) {
		
		int lastPrisoner=(s-1+m-1)%n+1;
		return lastPrisoner;
		
}
	public static void main(String[]args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int s =sc.nextInt();
			int result =JailerPrisonerCandies(n,m,s);
			System.out.println(result);
		}
		sc.close();
	}
	

}
