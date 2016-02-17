package Maatriks;

/**
 * Created by Taavi Tilk on 5.02.2016.
 */
import java.util.Arrays;

/**
 * There are n>2 judges and each gives a mark to sportsmans performance. Two extreme marks (one highest and one lowest) are removed and artithmetical mean of remaining n-2 marks is calculated.
 Write a Java method to determine the sportsmans result.
 Do not change the array given as argument.
 * Created by User on 29.01.2016.
 */
public class Sportlane {


    public static void main (String[] args) {
        System.out.println (result (new double[]{0., 1., 2., 3., 4.}));
        // YOUR TESTS HERE
    }

    public static double result (double[] marks) {
        double[] mingi = new double[marks.length];
        for (int i = 0; i <marks.length; i++) {
            mingi[i] = marks[i];

        }

        Arrays.sort(mingi);
        double sum = 0;
        double vastus = 0;
        for (int i = 0; i <mingi.length ; i++) {
            sum += mingi[i];

        }
        vastus = sum / (mingi.length-2 );


        return vastus;  // TODO!!! YOUR PROGRAM HERE
    }

}
