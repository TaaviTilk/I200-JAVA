package Maatriks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Prindi konsooli 27x27 maatriks, kus on t�idetud eesti t�hestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class Maatriks_sudoku {
    public static void main(String[] args) {
        ArrayList<String> tahestik = new ArrayList<>();
        Collections.addAll(tahestik,"A","B","C","D","E");
        int pikkus = tahestik.size();

        for (int i = 0; i < pikkus; i++) { //annab rea
            for (int a = 0; a < pikkus; a++) { //annab veeru
                int indeks = i + a; // Arraylisti indeks
                //System.out.println("indeks: "+ indeks);
                if (indeks >= pikkus) {  //kui number on �le Arraylisti pikkuse, siis lahtuab pikkuse, j�uab tagasi algusesse
                    indeks = indeks - pikkus;
                }
                System.out.print(tahestik.get(indeks) + " "); //V�tab arraylistist indeksil oleva t�he
            }
            System.out.println(); //Vahetab rida, iga rida uuele reale
        }
    }
}