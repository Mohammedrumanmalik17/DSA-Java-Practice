package interview;

public class ArrayPalincheck {
	public static void main(String[] args) {
//		int number=121;
		int number=12241;
		
		
		int rev=0;
		int temp=number;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp/=10;
		}
		System.out.println("Revsersed number:"+rev);
		if(rev==number) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
