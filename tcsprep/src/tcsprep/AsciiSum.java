package tcsprep;



import java.util.Scanner;

public class AsciiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
       int Sum =0;
       for(int i =0;i<input.length();i++) {
    	   Sum+=(input.charAt(i));
       }


        System.out.println("The sum of ASCII values is: " + Sum);
        scanner.close();
    }
}
