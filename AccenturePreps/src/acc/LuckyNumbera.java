package acc;

import java.util.Scanner;
public class LuckyNumbera{
   
  public static boolean isLuckyNumber(int number){
       int [] lucky_Numbers={4,7,44,47,74,477,744,474,747,777,444,77};
       for(int i=0;i<lucky_Numbers.length/lucky_Numbers[0];i++){
           
           if(number/lucky_Numbers[i]==0){
               return true;
               
           }
           
   }
   return false;
  }
   
   
   public static void  main(String []args){
       
       
       Scanner sc = new Scanner(System.in);
       
       int number =sc.nextInt();
       
       if(isLuckyNumber(number)){
          System.out.printf("%d is almost lucky",number);
           
       }
       else{
       System.out.printf("%d is not  almost lucky",number);
       
       }
          
   
   }      
   
}
//361
//361 is not  almost lucky
//
//4
//4 is almost lucky
