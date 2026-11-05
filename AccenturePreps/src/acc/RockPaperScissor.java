package acc;




import java.util.Scanner;
public class RockPaperScissor
{
	public static void main(String[] args) {
// 	String a = "rock";
// 	String a = "scissor";
// 	String a = "paper";
Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
		if(a.equals("rock")){
	     System.out.println("paper");
	}
	else if(a.equals("scissor")){
	 System.out.println("Rock");
	}
	else{
	    System.out.println("Scissor");
	}
	
	}
}
