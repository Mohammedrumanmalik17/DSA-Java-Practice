package acc;
import java.util.*;
@SuppressWarnings("unused")
public class CountStepstoclimbStairs {
	static long count_no_of_steps(int dest) {
		if(dest==1||dest==2) {
			return dest;
		}
		int recursive_call_1=(int) count_no_of_steps(dest-1);
		int recursive_call_2=(int) count_no_of_steps(dest-2);
		int result =recursive_call_1+recursive_call_2;
		return result;
	}
	
	public static void main(String[] args) {
		int n=4;
		long ans =count_no_of_steps(n);
		System.out.println(ans);
		return;
	}

}
