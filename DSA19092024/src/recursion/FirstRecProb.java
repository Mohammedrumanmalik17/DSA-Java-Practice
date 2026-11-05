package recursion;




//program to print 1 to  10 without loop i.e, recursion
public class FirstRecProb {
	
	public static void print(int count) {
	
		if(count==11) {
			return;
		}
		System.out.println(count);
		
			print(count+1);
	
		
	}

	
	
	
	public static void main(String[] args) {
		print(1);
	}
}
