package Maatriks;

import java.util.Scanner;

/**
 * Created by Taavi Tilk on 3.02.2016.
 */
class Sticks
{
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            String st;int i,j,k,l,m,n;
            System.out.print("Enter a Name:>");
            st=in.nextLine();
            int lt=st.length();
            System.out.println();
            for(i=lt-1;i>=0;i--)
            {
                for(k=(lt-1)-i;k>0;k--)
                {
                    System.out.print(" ");
                }
                for(j=0;j<=i;j++)
                {
                    System.out.print(st.charAt(j)+" ");
                }
                System.out.println();
            }
            for(l=1;l<lt;l++)
            {
                for(n=(lt-1)-l;n>0;n--)
                {
                    System.out.print(" ");
                }
                for(m=0;m<=l;m++)
                {
                    System.out.print(st.charAt(m)+" ");
                }
                System.out.println();
            }
        }
    }