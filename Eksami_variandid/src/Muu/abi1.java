package Muu;

/**
 * Created by Taavi Tilk on 3.02.2016.
 */
public class abi1 {
    public static void main(String args[]) {

        int count = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == count) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            if (i / 9 % 2 == 0) {
                count += 1;
                //System.out.println(count);
                System.out.println(i / 9 % 2);
            } else {
                count += -1;
                System.out.println(i / 9 % 2);
            }
            System.out.println();
        }
    }
}
