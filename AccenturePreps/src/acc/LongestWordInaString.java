package acc;

import java.util.*;

public class LongestWordInaString{
    public static void main(String []args){
        
     String sentence = "you  hello obtain RumanMalik";
     String [] parts = sentence.split(" ");
     
     String longestWord ="";
     for(String part:parts){
         if(part.length()>longestWord.length()){
             longestWord=part;
             
         }
     }
    System.out.println(longestWord);
     
  
     

}
}