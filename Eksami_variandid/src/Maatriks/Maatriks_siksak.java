package Maatriks;

/**
 * Created by Taavi Tilk on 30.01.2016.
 */
public class Maatriks_siksak {
    public static void main(String[] args) {
        int count = 0;
        int abi = 0;
        int i_max = 12;
        for (int k = 0; k < 1; k++) {
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 10; j++) {
                    if ((i == j || i == 19 - j)) {
                        System.out.printf("Z");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
