package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        int sum=0;
        double kesk =0;
        double list = naide.length;

        for (int i = 0; i <naide.length ; i++) {
            if(naide[i]==7) {naide[i]=naide[i]*2;}
            //System.out.println(naide[i]);
        }

        for (int i = 0; i <naide.length; i++) {
            sum += naide [i];

            System.out.println("summa"+sum);
        }

        kesk = sum/list;

        System.out.println(kesk);

    }

}
