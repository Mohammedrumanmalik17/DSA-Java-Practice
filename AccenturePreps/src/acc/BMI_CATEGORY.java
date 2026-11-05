package acc;
import java.util.*;
public class BMI_CATEGORY {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int weight = sc.nextInt();
		float height = sc.nextFloat();
		
		double BMI = weight / (height * height);

		
		if(BMI<18) {
		  System.out.println("0");
		}
		else if(BMI>=18 &&BMI<25) {
			  System.out.println("1");
			}
		else if(BMI>=25 &&BMI<30) {
			  System.out.println("2");
			}
		else if(BMI>=30 &&BMI<40) {
			  System.out.println("1");
			}
		else {
			  System.out.println("4");
			}
	}

}
