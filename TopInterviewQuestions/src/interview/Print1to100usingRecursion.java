package interview;

public class Print1to100usingRecursion {
	public static void 	printNumbers(int n,int count) {
		
		if(count>n) {
			return;
		}
		System.out.print(count + " ");
		printNumbers(n,count+1);
		
	
	
	}
	
	public static void print(int num) {
		if(num==0) {
			return;
		}
		print(num-1);
		System.out.print(num+ " ");
	}
	
	
	public static void main(String[] args) {
		int n=10;
		printNumbers(n,1);
		System.out.println();
		int num=5;
		
		print(num);
	}

}
