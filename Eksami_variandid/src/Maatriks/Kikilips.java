package Maatriks;

import java.util.Arrays;

public class Kikilips {
    public static void main(String[] args) {
        String[][] maatriks = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 9 && i - j >= 0) {
                    maatriks[i][j] = "0";
                } else if (i + j >= 8 && i - j <= 0) {
                    maatriks[i][j] = "0";
                } else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }
}
