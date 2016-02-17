package Maatriks;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */

import java.util.Arrays;
public class KaguNurk {
    public static void main(String[] args) {
        int[][] kaguNurk = new int[9][9];
        for (int i = 0; i < kaguNurk.length; i++) {
            for (int j = 0; j < kaguNurk.length; j++) {
                if ( i>j ){
                    kaguNurk[i][j]= kaguNurk.length-i-1;
                } else {
                    kaguNurk[i][j]= kaguNurk.length-j-1;
                }
            }
        }
        printMaatriks(kaguNurk);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}