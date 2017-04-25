package zajecia4;

/**
 * @author Dominik C.
 */
public class Zadanie5 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{1, 1}, {1, 1}, {1, 1}};

        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] matrixSum = addMatrices(matrix1, matrix2);
        int[][] matrixDifference = subtractMatrices(matrix1, matrix2);
        int[][] matrixMultiplication = multiplyMatrices(matrix3, matrix4);

        showMatrix(matrixSum);
        showMatrix(matrixDifference);
        showMatrix(matrixMultiplication);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (!areMatricesSameDimension(matrix1, matrix2)) {
            System.out.println("Blad");
            return null;
        }
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        if (!areMatricesSameDimension(matrix1, matrix2)) {
            System.out.println("Blad");
            return null;
        }

        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Blad");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    private static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static boolean areMatricesSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        if (matrix1[0].length != matrix2[0].length) {
            return false;

        }

        return true;
    }
}
