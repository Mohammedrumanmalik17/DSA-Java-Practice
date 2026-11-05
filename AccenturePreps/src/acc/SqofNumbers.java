package acc;

public class SqofNumbers {
public static int PrintSquaresofelemofNumber(int n) {
	
    StringBuilder result=new StringBuilder();
	
	while(n>0) {
		int rem=n%10;
		int sqValue =rem*rem;
		result.insert(0, sqValue);
	   
	  
		n/=10;
		
	}
	return Integer.parseInt(result.toString());
	
}
	
	
	
	
	public static void main(String[] args) {
		int num=79;
		
		System.out.println(PrintSquaresofelemofNumber(num));
	}
}
