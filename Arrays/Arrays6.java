public class Arrays6 {
    public class DiagonalSum {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int leftDiagonalSum = 0;
            int rightDiagonalSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                leftDiagonalSum += matrix[i][i];
                rightDiagonalSum += matrix[i][matrix.length - 1 - i];
            }

            System.out.println("Left diagonal sum: " + leftDiagonalSum);
            System.out.println("Right diagonal sum: " + rightDiagonalSum);
        }
    }
}
