package acc;

public class AdjacentStones {
public static void main(String[] args) {
	int n=6;
	String stones="RRRBGR";
	char[]s=stones.toCharArray();
	int count=0;

	
	for(int i=0;i<n-1;i++) {
		if(s[i]==s[i+1]) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
//2;
 