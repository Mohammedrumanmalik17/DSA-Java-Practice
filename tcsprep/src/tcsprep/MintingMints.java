package tcsprep;
import java.util.*;

public class MintingMints {
public static void main(String[] args) {
	
	Scanner Sc = new Scanner(System.in);
	int mint = Sc.nextInt();
	int len = Sc.nextInt();
	
	int sum=mint,prev;
	for(int i=1;i<len;i++) {
		prev = sum-1;
		sum=sum+prev;
	}
	System.out.println("NO OF MINTS I HAVE : " +sum);
	
}
}
