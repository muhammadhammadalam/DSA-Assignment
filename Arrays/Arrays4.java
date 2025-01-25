import java.util.Arrays;

public class Arrays4 {

    public class FindFiveRepeatedInB {
        public static void main(String[] args) {
            int[] B = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5};
            Arrays.sort(B);

            int[] repeated = new int[5];
            int count = 0;

            for (int i = 1; i < B.length; i++) {
                if (B[i] == B[i - 1]) {
                    boolean alreadyAdded = false;
                    for (int k = 0; k < count; k++) {
                        if (repeated[k] == B[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        repeated[count] = B[i];
                        count++;
                        if (count == 5) break;
                    }
                }
            }

            System.out.println("The first five repeated integers are:");
            for (int i = 0; i < count; i++) {
                System.out.print(repeated[i] + " ");
            }
        }
    }
}
