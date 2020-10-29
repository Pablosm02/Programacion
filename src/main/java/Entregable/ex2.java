package Entregable;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("introduzca un numero por favor");
        long numero=cs.nextLong();
        int longi;
        longi = (int)(Math.log10(numero)+1);
        int i;
        int contpar=0;
        int cont=0;

        for ( i=1; i<=longi; i++) {
            if (numero%2==0) {
                contpar=contpar+1;

            }
            else {
                cont=cont+1;
            }
            numero=numero/10;
        }
        System.out.println("tiene " + contpar + " numeros pares y " + cont + " numeros impares");

    }
}
