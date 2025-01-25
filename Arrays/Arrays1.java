import java.util.Scanner;

public class Arrays1 {

    public class ArrayInsert {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] LA = {10, 20, 30, 40, 50};
            int n = LA.length;

            System.out.println("Enter the index (K):");
            int K = scanner.nextInt();
            System.out.println("Enter the item (positive integer):");
            int ITEM = scanner.nextInt();

            if (K < 0 || K >= n) {
                System.out.println("K is out of range.");
            } else if (ITEM <= 0) {
                System.out.println("Item must be a positive integer.");
            } else if (ITEM > LA[K]) {
                System.out.println("ITEM at index " + K + " is greater than user's entered ITEM.");
            } else {

                System.out.println("Before insertion:");
                printArray(LA);

                LA[K] = ITEM;

                System.out.println("After insertion:");
                printArray(LA);
            }
            scanner.close();
        }

        private static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
