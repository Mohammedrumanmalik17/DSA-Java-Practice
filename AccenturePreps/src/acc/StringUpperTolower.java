package acc;


public class StringUpperTolower{
    public static void main(String []args){
        
        String s="AbCdEfG";
        String newStr ="";
        int lc=0;
        int Uc=0;
        for(int i=s.length()-1;i>=0;i--){
            
            if(Character.isLowerCase(s.charAt(i))){
                lc++;
            }
            else{
                Uc++;
            }
            
           
        }
         if(Uc>lc){
             newStr=s.toUpperCase();
                
            }
            else{
                newStr = s.toLowerCase();
            }
            
        System.out.println(newStr);
     
        
    }
}