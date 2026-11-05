package acc;

import java.util.Scanner;

public class TeamWonFootballMatch {
	public static int winningTeam(String arr[],int n) {
		int ACount=0;
		int BCount=0,winner;
		for(int i=0;i<n;i++) {
			if(arr[i].equals("TeamA")){
				ACount++;
			}
			else {
				BCount++;
			}
      
		}
		   if(ACount>BCount) {
	        	 winner=1;
	         }
	         else {
	        	  winner=2;;
	         }
		return winner;
	}
	
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n=5;
	String []arr= new String[n];
	
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextLine();
    	
    }
   System.out.println(winningTeam(arr,n));
	
}
}
//TeamA
//TeamB
//TeamA
//TeamB
//TeamB
//_____o/p:
//TeamB
