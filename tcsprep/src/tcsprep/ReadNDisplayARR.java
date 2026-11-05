package tcsprep;
import java.util.*;

public class ReadNDisplayARR {
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int numbers[] = new int[size];
	        int i;

	        for (i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }
	        System.out.printf("ARRAY ELEMENTS ARE : ");
	        for (i = 0; i < size; i++) {
	            System.out.print(numbers[i]+" ");
	        }
	}

}
