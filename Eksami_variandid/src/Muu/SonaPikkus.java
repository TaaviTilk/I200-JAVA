package Muu;

import java.util.ArrayList;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class SonaPikkus {

    public static void main(String[] args) {


        final ArrayList<String> input = new ArrayList<>(); {
          {
              input.add("Hello");
              input.add("Goodbye");
              input.add("Segall");
              input.add("Ty");
          }
        };

    for(String word : input) {
        System.out.println(word + " --> " + word.length());
        }
    }
}
