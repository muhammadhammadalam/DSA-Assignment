import java.util.Arrays;

public class ArrayInsertion {
    public static int[] insertElement(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToInsert = 2;
        int valueToInsert = 99;
        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = insertElement(arr, indexToInsert, valueToInsert);
        System.out.println("After Insertion: " + Arrays.toString(arr));
    }
}
