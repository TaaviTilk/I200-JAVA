package Algoritm;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class AsendaSuuredTahed {

    public static void main(String[] args) {
        String s = "Tere, TUDENG,   tore ARVUTI sul!";
        String t = asenda(s);//Tere,-TUDENG,---tore-ARVUTI-sul!
        System.out.println(s + " > " + t);
    }

    private static String asenda(String s) {
        String asenda = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);//küsib tähe käest indeksil i ja salvestab a-sse
            if (Character.isUpperCase(a)) {
                asenda = asenda + '-';
            } else {
                asenda = asenda + a;
            }
        }
        return asenda;
    }
}