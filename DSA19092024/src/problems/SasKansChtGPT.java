package problems;

public class SasKansChtGPT {

    // Function to compute GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int minimumPowertoDefeat(int input1, int input2[], int scenario) {
        int l = 0;
        int r = input1 - 1;
        int mid = input1 / 2;  // Middle index
        int sum = 0;

        if (scenario == 1) { // Scenario 1: GCD for Start and End
            // Calculate GCD between start and end elements
            while (l < r) {
                sum += gcd(input2[l], input2[r]);
                l++;
                r--;
            }
        } else if (scenario == 2) { // Scenario 2: GCD for Start and Middle (and l+1 and mid+1)
            // Calculate GCD between start and middle elements
            for (int i = 0; i < mid; i++) {
                sum += gcd(input2[i], input2[mid]);  // GCD of start and middle
                if (i + 1 < mid) {
                    sum += gcd(input2[i + 1], input2[mid + 1]);  // GCD of l+1 and mid+1
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int array[] = {1, 2, 3, 4};

        // Scenario 1: Start and End
        System.out.println("Sum for Scenario 1 (Start and End): " + minimumPowertoDefeat(n, array, 1));

        // Scenario 2: Start and Middle
        System.out.println("Sum for Scenario 2 (Start and Middle): " + minimumPowertoDefeat(n, array, 2));
    }
}
