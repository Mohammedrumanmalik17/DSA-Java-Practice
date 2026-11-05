package acc;

import java.util.Scanner;

public class TaskCompletionMinTime {
	public static int findminimumtime(int n,int m,int tasks[]) {
		
		int ans=0;
		int currPosition=1;
		
		for(int i=0;i<m;i++) {
			int diff=tasks[i]-currPosition;
		
			
			if(diff>=0) {
				ans+=diff;
			}
			else {
				ans+=(n+diff);
			}
			currPosition=tasks[i];
		}
		return ans;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=4;//no of houses to visit
		int m=3;//no of task to do
		int tasks[]=new int[m];
		for(int i=0;i<m;i++) {
			tasks[i]=sc.nextInt();
		}
		System.out.println(findminimumtime(n,m,tasks));
				
	}

}
//3
//2
//3
//6

