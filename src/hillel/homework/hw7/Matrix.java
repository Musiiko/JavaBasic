package hillel.homework.hw7;
/*В квадратной матрице поменять значения элементов в каждой строке,
 расположенные на главной и побочной диагоналях.*/

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Initial matrix : ");
        int size = 4;
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 10);
                System.out.printf("%4d%s",
                        matrix[i][j],
                        j == matrix[i].length - 1 ? "\n" : "");
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix[i].length - i - 1];
            matrix[i][matrix[i].length - i - 1] = temp;
        }
        System.out.println("Resulting matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d%s", matrix[i][j],
                        j == matrix[i].length - 1 ? "\n" : "");
            }
        }
    }
}
