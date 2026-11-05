package acc;
import java.util.Scanner;

public class IfNumispowofN {
	public static boolean ispowerofgivennumber(int number,int powerNum) {
		
		if(number<=0||powerNum<=1) {
			return false;
		}
		
		while(number%powerNum==0) {
			number/=powerNum;
		}
		return number==1?true:false;
	}
	
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int powerNum=sc.nextInt();
		
		System.out.println(ispowerofgivennumber(number,powerNum));
		
	}

}
