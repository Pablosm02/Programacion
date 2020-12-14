package Examen_funciones_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("introduzca a continuacion las dimensiones de su array");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int array[][]=new int [x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j]=(int) (Math.random() * (1000 - 100 + 1) + 100);
            }
        }

        for (int j = 0; j < x; j++) {
            System.out.println(Arrays.toString(array[j]));
        }
        for (int i = 0; i < 11; i++) {
            System.out.println((subcorteza(array)[i]));
        };
    }

    public static int[] subcorteza(int n[][]){
        int conta=0;
        int x=n.length;
        int arrayarriba[]=new int [10];
        int arrayderecha[]=new int [10];
        int arrayabajo[]=new int[10];
        int arrayfinal[]=new int[20];
        for (int cont = 0; cont < n.length-1; cont++) {
            arrayarriba[conta]=n[1][cont+1];
            conta=conta+1;
        }
        conta=0;
        for (int cont=2; cont<n[1].length-2; cont++ ){
            if (n[cont][x-1]==0){
                break;
            }
            arrayderecha[conta]=n[cont][x-1];
            conta=conta+1;
        }
        for (int i = x-2; i < 1; i--) {

        }

        return arrayfinal;
    }


}
