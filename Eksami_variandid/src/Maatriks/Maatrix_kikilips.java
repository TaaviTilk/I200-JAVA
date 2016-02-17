package Maatriks;

/**
 * Created by Taavi Tilk on 3.02.2016.
 */
public class Maatrix_kikilips {
    public static void main(String[] args) {
        //int count = 0;
        for (int i = 0; i <10 ; i++) {
            for (int j = i; j <9; j++) {
                if  (j == i )
                    //((i==j)||(i+j==9))
                     {
                    System.out.printf("x");
                }
                else if (i==1 || j<i){
                    System.out.printf(".");
                }else
                {
                    System.out.printf(".");
                }
               // System.out.println("-");
            }
            System.out.println();
        }
    }
}


