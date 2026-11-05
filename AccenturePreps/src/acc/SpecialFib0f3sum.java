package acc;

public class SpecialFib0f3sum {
	public static void main(String[] args) {
		int n=7;
		
		int[]series=new int[7];
		series[0]=0;
		series[1]=1;
		series[2]=1;
		
		for(int i=3;i<n;i++) {
			series[i]=series[i-1]+series[i-2]+series[i-3];
		}
		System.out.printf("fibonacci series of %d is",n);
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print(series[i]+" ");
		}
	}
	

}
