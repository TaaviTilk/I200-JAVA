package Maatriks;

/**
 * Created by Taavi Tilk on 4.02.2016.
 */
public class Oppimiseks2 {


    public static void main(String[] args) {
        int tabel[][]= new int[5][5];
        int i,j,k=1;

        for(i=0;i<tabel.length;i++) {
            for(j=0;j<tabel[i].length;j++) {
                tabel[i][j]= i*k;
                //System.out.println("k"+k);
                k++;
            }
        }

        for(int[] row : tabel) {
            printRow(row);
        }
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
}

