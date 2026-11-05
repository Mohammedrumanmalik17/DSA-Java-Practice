package interview;

public class ArmstrongNumberChecker {
	
	public static void main(String[] args) {
//		int n=153;
		int n=1634;
//		int n=100;
		int temp=n;
		int sum=0;
		int digits=String.valueOf(n).length();
		while(temp!=0) {
			int digit=temp%10;
			sum=(int) (sum+Math.pow(digit, digits));
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println(+n+ " is an ARMSTRONG NUMBER ");
		}
		else {
			System.out.println(+n+ " is not an ARMSTRONG NUMBER ");
		}
	}

}
