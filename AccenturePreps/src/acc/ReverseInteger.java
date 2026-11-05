package acc;


public class ReverseInteger {
    public static void main(String[] args) {
        int a = 12345;
        int reversed = reverse(a);
        System.out.println("Reversed: " + reversed);
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
        	int rem = n % 10;
            rev=rev*10+rem;// Append last digit to rev
            n = n / 10;               // Remove last digit from n
        }
        return rev;
    }
}
