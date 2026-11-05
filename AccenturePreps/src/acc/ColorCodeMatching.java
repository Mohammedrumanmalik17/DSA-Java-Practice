package acc;

import java.util.Scanner;
class Main{
   
   public static void  main(String []args){
       
       Scanner sc = new Scanner(System.in);
       String s =sc.nextLine();
       String t = sc.nextLine();
       
       int j=0;
       int k=1;
       
       for(int i=0;i<t.length();i++){
           if(t.charAt(i)==s.charAt(j)){
               k++;
               j++;
           }
       }
       System.out.println(k);
   }
}
//RRRBGBRBBB
//BBBRR
//3