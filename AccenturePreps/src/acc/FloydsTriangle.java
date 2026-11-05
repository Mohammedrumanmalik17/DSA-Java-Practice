package acc;

public class FloydsTriangle {
	public static void main(String[] args) {
		
		int n=5;
		int var=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				var++;
				System.out.print(var+" ");
			}
			System.out.println();
		}
	}

}
