package Maatriks;

/**
 * Created by Taavi Tilk on 5.02.2016.
 */

/**
 * Write a method in Java to find the array of sums of columns of a given matrix of integers m
 * (j-th element of the answer is the sum of elements of the j-th column in the matrix).
 * Rows of m might be of different length.
 */
public class Matrix_Sum_Of_Columns {

    public static void main(String[] args) {
        int[] res = veeruSummad(new int[][]{{1, 2, 3}, {4, 5, 6}}); // {5, 7, 9}
        // YOUR TESTS HERE
    }

    public static int[] veeruSummad(int[][] m) {
        int col = m[0].length;
        System.out.println(col);
        int array[] = new int[m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < m.length; j++) {
                array[j] = array[j] + m[j][i];
            }
        }
        return array;
    }
}