package U2.unit2.U2.T6;

import java.util.Scanner;

public class t6_ex2 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("introduzca el numero de su numero(entre 1 y 10)");
            int numero = teclado.nextInt();

            if (numero < 0) {
                System.out.println("mes incorrecto");
            } else {
                if (numero == 1) {
                    System.out.println("uno");
                }
                if (numero == 2) {
                    System.out.println("dos");
                }
                if (numero == 3) {
                    System.out.println("tres");
                }
                if (numero == 4) {
                    System.out.println("cuatro");
                }
                if (numero == 5) {
                    System.out.println("cinco");
                }
                if (numero == 6) {
                    System.out.println("seis");
                }
                if (numero == 7) {
                    System.out.println("siete");
                }
                if (numero == 8) {
                    System.out.println("ocho");
                }
                if (numero == 9) {
                    System.out.println("nueve");
                }
                if (numero == 10) {
                    System.out.println("diez");
                }
                if (numero > 10) {
                    System.out.println("numero incorrecto");
                }
            }

        }
    }

