
public class ArraySearching {
    public static int searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i; // Return the index of the element
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int valueToSearch = 4;
        int index = searchElement(arr, valueToSearch);
        if (index != -1) {
            System.out.println("Element " + valueToSearch + " found at index " + index);
        } else {
            System.out.println("Element " + valueToSearch + " not found");
        }
    }
}
