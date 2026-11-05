package tcsprep;
import java.util.*;

public class SumOfNumInStrings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] strnew =str.toCharArray();
		int cum_sum=0;
		int final_sum=0;
		for(int i=0;i<str.length();i++) {
			if(strnew[i]>=48 && strnew[i]<=57) {
				cum_sum=cum_sum*10+strnew[i]-'0';
				
			}
			else {
				final_sum+=cum_sum;
				cum_sum=0;
			}
		}
		final_sum+=cum_sum;
		System.out.println(final_sum);
	}

}
