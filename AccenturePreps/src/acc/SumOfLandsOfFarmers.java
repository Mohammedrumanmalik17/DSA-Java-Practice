package acc;




public class SumOfLandsOfFarmers{
public static void main(String []args){
    int n=4;
    int sum=0;
    int land=0;
    
    
    for(int i=1;i<=n;i++){
        land=land^i;
        sum+=land;
    }



System.out.println(sum);
}
}

//int n=1 ->1
//int n=3 ->4
//int n=4 ->8