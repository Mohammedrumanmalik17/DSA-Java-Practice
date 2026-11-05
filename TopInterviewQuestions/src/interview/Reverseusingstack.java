package interview;
import java.util.Stack;

public class Reverseusingstack {
	
	public static void main(String[] args) {
		
		String str = "ruman";
		
		Stack s = new Stack();
		
		for(char ele:str.toCharArray()) {
			s.push(ele);
		}
		
		for(char c:str.toCharArray()) {
			System.out.print(s.pop());
		}
		System.out.println();
		
		//reverse a number 
		System.out.println("Reversing a number");
		System.out.println();
		
		int num[]= {1,2,3,4,5};
		reverse(num);
		
	
	}
	
	public static void reverse(int number[]) {
		Stack n = new Stack();
		
		for(int num:number) {
			n.push(num);
			
		}
		for(int num:number) {
			System.out.print(n.pop());
		}
	}
	

}
