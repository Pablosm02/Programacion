package Entregable;

import java.io.OutputStream;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");
        int numero = sc.nextInt();


        int cont = 1;

        int t;
        boolean s = false;
        for (t = 1; t < 6; t++) {
            cont=1;
            int i;
            s = false;
            for (i = 1; i <= numero; i++) {
                cont = cont + 1;
                if (cont >= numero)
                    cont = numero - 1;

                if (s == false) {
                    if (numero % cont == 0) {
                        s = true;
                    } else {
                        s = false;
                    }
                }
            }
            if (s == true) {
                System.out.println(numero + " no es primo");
            }
            if (s == false) {
                System.out.println(numero + "  es primo");
            }
            numero = numero + 1;
        }


    }
}






