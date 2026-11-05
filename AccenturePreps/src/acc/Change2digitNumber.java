package acc;

import java.util.*;

public class Change2digitNumber{
    
    public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
            
            
            int n = sc.nextInt();
             
            if(n>=-9 && n<=9){
                System.out.println(n);
                
            }
                 
              else if (n%2!=0){
                 System.out.println((int)Math.floor(n/2));
            }
                 
              
               else{
                 System.out.println((int)Math.ceil((n-2)/2));
          
          
               }
    }
    
    
   
}
