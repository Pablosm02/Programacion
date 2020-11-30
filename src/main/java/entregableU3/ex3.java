package entregableU3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("por favor introduzca la dimension de la matriz (nxn)");
        int dimension=sc.nextInt();
        int array[][]=new int [dimension][dimension];
        int i;
        int t;
        for (i=0;i<dimension;i++){
            for (t=0;t<dimension;t++){
                array[i][t]=(int) (Math.random()*(100-200+1)+200);
            }
        }
        int h;
        int g;
        for (h=0;h<dimension;h++){
            for (g=0;g<dimension;g++) {
            System.out.println(array[g][h]);
            }
        }
    }
}
