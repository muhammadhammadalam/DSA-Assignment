public class Arrays5 {
    public class TransposeMatrix {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            System.out.println("Transposed Matrix:");
            printMatrix(transpose);
        }

        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }

}
