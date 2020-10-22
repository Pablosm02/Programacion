package U2.unit2.T6;

import java.util.Scanner;

public class t6_ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el numero de su mes");
        int mes = teclado.nextInt();

        if (mes>12) {
            System.out.println("mes incorrecto");
        }
        else {
            if (mes == 1) {
                System.out.println("enero");
            }
            if (mes == 2) {
                System.out.println("febrero");
            }
            if (mes == 3) {
                System.out.println("marzo");
            }
            if (mes == 4) {
                System.out.println("abril");
            }
            if (mes == 5) {
                System.out.println("mayo");
            }
            if (mes == 6) {
                System.out.println("junio");
            }
            if (mes == 7) {
                System.out.println("julio");
            }
            if (mes == 8) {
                System.out.println("agosto");
            }
            if (mes == 9) {
                System.out.println("septiembre");
            }
            if (mes == 10) {
                System.out.println("octubre");
            }
            if (mes == 11) {
                System.out.println("noviembre");
            }
            if (mes == 12) {
                System.out.println("diciembre");
            }
        }
        if (mes<1){
            System.out.println("numero incorrecto");
        }

    }
}
