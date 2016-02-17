package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {

    public static void main (String[] args) {

        int suurus = 9;
        for (int i = 0; i < suurus; i++) {
            for (int j = 0; j < suurus; j++) {
                if (i + j < suurus && i<=j) {
                    System.out.print(" 0");
                } else if (i + j >= suurus -1 && i >= j) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }
}



