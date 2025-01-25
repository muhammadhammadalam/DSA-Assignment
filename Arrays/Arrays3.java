public class Arrays3 {
    public class FindRepeatedInAWithoutHash {
        public static void main(String[] args) {
            int[] A = {1, 2, 3, 4, 5, 3}; // Example array
            int repeated = -1;

            for (int i = 0; i < A.length; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        repeated = A[i];
                        break;
                    }
                }
                if (repeated != -1) break; // Exit outer loop if a repeat is found
            }

            if (repeated != -1) {
                System.out.println("Repeated integer: " + repeated);
            } else {
                System.out.println("No repeated integer found.");
            }
        }
    }
}