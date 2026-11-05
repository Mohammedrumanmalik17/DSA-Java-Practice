package acc;

import java.util.*;

public class FinfNoOfPiecesOfCake{

public static int Find_No_Of_Pieces_Of_Cake(int n){

int pieces=0;


pieces=n*(n+1)/2;


return (pieces%1000000007)+1 ;

}

public static void main(String []args){
Scanner sc =new Scanner(System.in);

int n=sc.nextInt();


System.out.println( Find_No_Of_Pieces_Of_Cake(n));

 }
}