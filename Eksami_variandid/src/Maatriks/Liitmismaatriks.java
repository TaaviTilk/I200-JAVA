package Maatriks;

import java.util.Arrays;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class Liitmismaatriks {
    public static void main(String[] args) {
        int[][] res = liitmistabel (9);

    }

    private static int[][] liitmistabel(int n) {
        int[][] tulemus = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tulemus[i][j] = i + j;
            }
            System.out.println(Arrays.toString(tulemus[i])+"\t");
        }
        return tulemus;
    }
}
