package acc;


import java.util.ArrayList;
import java.util.List;

public class CommonElementsInArray {
    public static List<Integer> commonElements(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int element = arr1[i];

            // Check if the element exists in arr2
            boolean existsInArr2 = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == element) {
                    existsInArr2 = true;
                    break; // No need to check further
                }
            }

            // Check if it's already in the common list
            if (existsInArr2 && !common.contains(element)) {
                common.add(element);
            }
        }

        return common;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        List<Integer> result = commonElements(arr1, arr2);
        System.out.println(result); // Output: [4, 5]
    }
}
