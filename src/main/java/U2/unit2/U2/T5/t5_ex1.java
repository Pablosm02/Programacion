package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex1<numerito> {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("por favor, introduzca un número");
        int numero = sc.nextInt();
        if (numero == 0) {
            System.out.println("su numero es neutro, 0");
        } else {
            if (numero < 0) {
                System.out.println("su numero es negativo");
            } else {
                System.out.println("su numero es positivo");
            }

        }
    }
}

