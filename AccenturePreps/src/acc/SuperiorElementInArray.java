package acc;

import java.util.*;

public class SuperiorElementInArray{

public static int Find_No_Of_Superior_Element(int []arr,int n){

int count=0;
int superior= Integer.MIN_VALUE;

for(int i=n-1;i>=0;i--){

if(arr[i]>superior){
 count++;
 superior=arr[i];

}

}
return count;

}

public static void main(String []args){
Scanner sc =new Scanner(System.in);

int n=sc.nextInt();

int[] arr=new int[n];

for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}
System.out.println( Find_No_Of_Superior_Element(arr, n));

 }
}