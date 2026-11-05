package acc;



import java.util.*;

public class GameOf4EXPandFresher{
public static void main(String []args){
    
    Scanner sc = new Scanner(System.in);
 int exp =sc.nextInt();
 int fresh = sc.nextInt();
 
 int result =(exp+fresh)/4;
 
 if(result<=Math.min(exp,fresh)){
     
     System.out.println(result);
 }
  if(result>Math.min(exp,fresh)){
     
     System.out.println(Math.min(exp,fresh));
 }
 
 
 
}
}

//5 5 ->2;
//9 1 ->1;
//3 5 ->2
