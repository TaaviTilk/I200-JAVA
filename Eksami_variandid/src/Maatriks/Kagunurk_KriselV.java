package Maatriks;

/**
 * Created by Taavi Tilk on 3.02.2016.
 */
public class Kagunurk_KriselV{
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + Math.max(i, j));
            }
            System.out.println();
        }
    }
}
