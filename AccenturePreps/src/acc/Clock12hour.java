package acc;
import java.text.DecimalFormat;
import java.util.*;

public class Clock12hour {
	public static void convertTo12hourformat(int hour,int mins) {
		
		String period;
		if(hour>=12) {
			period="PM";
			if(hour>12) {
				hour-=12;
			}
		}
			else {
				period="AM";
				if(hour==0) {
					hour=12;
					
				}
			}
			
		
		DecimalFormat df = new DecimalFormat("00");
		System.out.println("12 hour format :"+df.format(hour)+":"+df.format(mins)+" "+period);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour(0-23)");
		int hour =sc.nextInt();
		System.out.println("Enter minutes(0-59)");
		int min = sc.nextInt();
		
		if(hour<0||hour>23 ||min<0 ||min>59) {
			System.out.println("Invalid input");
			return;
		}
		
		convertTo12hourformat(hour,min);
	}

}
//Enter hour(0-23)
//13
//Enter minutes(0-59)
//30
//12 hour format :01:30 PM




//Enter hour(0-23)
//12
//Enter minutes(0-59)
//45
//12 hour format :12:45 PM

//
//Enter hour(0-23)
//0
//Enter minutes(0-59)
//0



//Enter hour(0-23)
//23
//Enter minutes(0-59)
//59
//12 hour format :11:59 PM




//Enter hour(0-23)
//0
//Enter minutes(0-59)
//0
//
//
////12 hour format :12:00 AM