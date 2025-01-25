import java.util.Arrays;

public class ArraySum {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int totalSum = sumOfArray(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum of Array: " + totalSum);
    }
}
