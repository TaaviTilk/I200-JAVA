package Maatriks;

import java.util.Arrays;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class VeeruMaksimumideMaatriks {
    public static void main(String[] args) {
        int[] res = veeruMaxid (new int[][] {{1, 2, 6}, {4, 5, 3}});
        System.out.println(Arrays.toString(res));
    }

    private static int[] veeruMaxid(int[][] m) {
        int koigePikemMassiiv = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i].length > koigePikemMassiiv) {
                koigePikemMassiiv = m[i].length;//teame kõige pikema massiivi pikkust
            }
        }

        int[] uusMassiiv = new int[koigePikemMassiiv];

        for (int i = 0; i < uusMassiiv.length; i++) {//tsükkel, et võrdleks negatiivseid arve ka
            uusMassiiv[i] = Integer.MIN_VALUE;//võtab integeri kõige väiksema võimaliku väärtuse
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                uusMassiiv[j] = Math.max(m[i][j], uusMassiiv[j]);//võtab kaks numbrit vastu ja võrdleb omavahel kumb on suurem ja salvestab massiivi
            }
        }
        return uusMassiiv;
    }
}
