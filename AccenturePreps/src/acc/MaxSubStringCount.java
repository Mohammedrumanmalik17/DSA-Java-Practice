package acc;


import java.util.*;

public class MaxSubStringCount{
  
    public static int subString(String s){
      
      int []freq = new int[26];
      
      for(char c:s.toCharArray()){
          freq[c-'a']++;
      }
      int min_value = Integer.MAX_VALUE;
      
      for(int f:freq){
          if(f>0 && f<min_value){
              min_value=f;
              
          }
      }
      return min_value;
  }
  
  public static void main(String []args){
      
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int result = subString(s);
      System.out.println(result);
      
  }
}