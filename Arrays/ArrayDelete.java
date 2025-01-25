import java.util.Arrays;

public class ArrayDelete {
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToDelete = 2;
        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = deleteElement(arr, indexToDelete);
        System.out.println("After Deletion: " + Arrays.toString(arr));
    }
}
