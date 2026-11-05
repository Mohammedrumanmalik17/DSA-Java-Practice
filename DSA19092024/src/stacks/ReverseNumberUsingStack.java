package stacks;

import java.util.Stack;

public class ReverseNumberUsingStack {
	
	public static int revnum(int num) {
		
		Stack<Integer>s = new Stack();
		
		while(num>0) {
			s.push(num%10);
			num/=10;
		}
		
		int rev=0;
		int place=1;
		
		while(!s.isEmpty()) {
			rev+=s.pop()*place;
			place*=10;
		}
		return rev;
	}
	
	
	
	
	public static void main(String[] args) {
		int num=12345;
		int result=revnum(num);
		
		System.out.println("Reversed number is : " + result);
	}

}
