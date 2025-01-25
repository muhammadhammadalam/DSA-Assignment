import java.util.Scanner;

public class Arrays2 {

    public class ArraySearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] LA = {10, 20, 30, 40, 50}; // Example array
            int n = LA.length;

            System.out.println("Enter the item to search:");
            int ITEM = sc.nextInt();

            int index = -1;
            for (int i = 0; i < n; i++) {
                if (LA[i] == ITEM) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Item not found.");
            } else {
                System.out.println("Item found at index " + index);

                if (index + 1 < n) System.out.println("Right neighbor 1: " + LA[index + 1]);
                else System.out.println("No right neighbor 1");
                if (index + 2 < n) System.out.println("Right neighbor 2: " + LA[index + 2]);
                else System.out.println("No right neighbor 2");

                if (index - 1 >= 0) System.out.println("Left neighbor 1: " + LA[index - 1]);
                else System.out.println("No left neighbor 1");
                if (index - 2 >= 0) System.out.println("Left neighbor 2: " + LA[index - 2]);
                else System.out.println("No left neighbor 2");
            }
            sc.close();
        }
    }

}
