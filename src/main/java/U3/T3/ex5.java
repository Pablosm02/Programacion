package U3.T3;

import java.util.Scanner;

public class ex5 {
    //Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y
    // mostrar. Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las
    // dos tablas en una tercera, de forma que los 12 números sigan ordenados. Fusionar
    // significa copiar en el orden correcto para que los datos resultantes continúen
    // ordenados sin necesidad de volver a realizar una ordenación
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Introduzca los 6 primeos datos por favor:");
        int array[]=new int [6];
        for (i=0;i<=5 ;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("introduzca los 6 datos restantes:");
        int array2[]=new int [6];
        int t;
        for (t=0;t<=5;t++){
            array2[t]=sc.nextInt();
        }
        String s="";
        int m;
        int u;
        for (m=0;m<=5;m++){
            s=s+" "+array[m];
        }
        for (u=0;u<=5;u++){
            s=s+" "+array2[u];
        }

        System.out.println(s);
    }
}