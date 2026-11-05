//package acc;
//
//public class Checkif3power {
//	public static String ispowerofthree(int num) {
//		
//		if(num<=0) {
//			return "NO";
//		}
//		while(num%3==0) {
//			num/=3;
//		}
//		return num==1?"is power of 3" :"Not a power of 3";
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		System.out.println(ispowerofthree(20));
//		System.out.println(ispowerofthree(27));
//		System.out.println(ispowerofthree(10));
//		System.out.println(ispowerofthree(81));
//	}
//
//}

//the above one was brute force approach with O(LOG N) complexity

//
//
//optimised approach is below;




package acc;

public class Checkif3power {
	public static boolean ispowerofthree(int num) {
		
		int maxnum=(int) Math.pow(3,19);
		
	return maxnum%num==0;
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(ispowerofthree(20));
//		System.out.println(ispowerofthree(27));
//		System.out.println(ispowerofthree(10));
//		System.out.println(ispowerofthree(81));
		
		if(ispowerofthree(27)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

