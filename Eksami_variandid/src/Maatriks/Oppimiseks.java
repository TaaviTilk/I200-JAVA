package Maatriks;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class Oppimiseks {
    public static void main(String[] args) {
        int[][] rating = {
                {4, 6, 2, 5},
                {7, 9,},
                {5, 7, 8, 6},
        };

        int count = 0;
        double sum = 0;

        for (int i = 0; i < rating.length; i++) {
            if (rating[i].length > 3) {
                sum += rating[i][3];
                count++;
                //System.out.println();
            }
            if (count > 0)
                System.out.println((double) sum / count);
        }
    }
}
