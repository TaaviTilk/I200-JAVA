package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {


    public static void main(String[] args) {
        //String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        //ArrayList<String> sonad = new ArrayList<String>();
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3


        int sum = 0;
        double kesk = 0;
        double list = naide.length;
        int count = 0;
        //int word = naide[i].length();

        for (int i = 0; i <naide.length; i++) {
            sum += naide[i].length();
            System.out.println(naide[i].length());
            //kesk = sum/naide.length;
            //ystem.out.println(sum+"ja kesk-"+kesk);

        }

        kesk = sum/list;
        System.out.println(kesk);

        for (int i = 0; i < list ; i++) {
            if (naide[i].length()>kesk)count++;
        }
        System.out.println(count);
    }
}
