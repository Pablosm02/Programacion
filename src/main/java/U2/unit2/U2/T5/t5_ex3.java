package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduzca un numero para comprobar si es par o impar");
        int Numero= teclado.nextInt();
        if (Numero%2 == 0) {
            System.out.println("su numero es par");
        }
        else {
            System.out.println("su numero es impar");
        }
    }
}
