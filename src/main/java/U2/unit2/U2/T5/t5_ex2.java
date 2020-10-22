package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduzca el numero 12");
        int Numero= teclado.nextInt();
        if (Numero==12) {
            System.out.println("ha introducido el numero 12 corectamente");

        }
        else {
            System.out.println("no ha introducido el numero 12 correctamente");
        }


    }
}
