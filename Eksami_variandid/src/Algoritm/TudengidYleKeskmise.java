package Algoritm;

import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle keskmise?
 */
public class TudengidYleKeskmise {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleKeskmise(int[] ints) {

        int sum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i <ints.length; i++) {
            if (ints[i]>60)ints[i]= 60;
            //System.out.println("ints"+ints[i]);

        }

        for (int i = 0; i <ints.length; i++) {
            sum += ints [i];

            //System.out.println("summa"+sum);
        }

        average = sum/ints.length;
        //System.out.println(average);

        for (int i = 0; i <ints.length ; i++) {
            if (ints[i]>average)count++;
            //System.out.println("count-"+count);
            
        }

        return count;
    }

}
