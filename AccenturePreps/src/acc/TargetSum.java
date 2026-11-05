package acc;

public class TargetSum{
    
    public int[] twoSum(int[] num, int target) {
      
     int l=0;
     int r=num.length-1;
     
     
     while(num[l]+num[r]!=target){
         
         if(num[l]+num[r]<target){
             l++;
         }
         else{
         r--;
         }
     }
 return new int[]{l,r};
 }
        
        
        
        
 public static void  main(String []  args){
     
     int []num={2,7,11,15};
     int target=9;
     TargetSum targetsum=new TargetSum();
     
     int [] result=targetsum.twoSum(num,target);
 System.out.println("["+result[0]+","+result[1]+"]");
     
     
 }    
}