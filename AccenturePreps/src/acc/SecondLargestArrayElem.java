package acc;


import java.util.*;
public class SecondLargestArrayElem
{
    
    static int secondLargestArrayElem(int []arr,int n){
        
        if(n<2){
            return -1;
        }
        int largestElement=arr[0];
        int secondLargestElement=-1;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>largestElement){
                secondLargestElement=largestElement;
                largestElement=arr[i];
            }
            else if(arr[i]>secondLargestElement &&arr[i]!=largestElement){
                secondLargestElement=arr[i];
            }
            
        }
        return secondLargestElement;

	
	
    }
	public static void main(String[] args) {
	    
	    int arr[]={9,55,2,10,54,3};
	       //int arr[]={9,9,9};
	    int n = arr.length;
	    
	    int result = secondLargestArrayElem(arr,n);
	    
	   
	        System.out.println(result);
	    

	    
	  
	    

	}
}
