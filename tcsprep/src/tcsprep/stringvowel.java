package tcsprep;
import java.util.*;
public class stringvowel {
	public static void main(String[] args) {
		
	
	Scanner sc =  new Scanner(System.in);
	String str = sc.next();
	int n = sc.nextInt();
	int j=0;
	String res="";
	for (int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||
				str.charAt(i)=='e'||
				str.charAt(i)=='i'||
				str.charAt(i)=='o'||
				str.charAt(i)=='u') {
			res=res+str.charAt(i);
			j++;
			if(j==n) {
				break;
			}
			
		}
	}
	System.out.println(res);
	

}
}