package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduzca un numero por favor");
        int numero= teclado.nextInt();
        System.out.println("introduzca otro numero por favor");
        int numero2= teclado.nextInt();
        int contador = 0;
        if (numero % 2==0) {
            contador = (contador+1);
        }
        if (numero2 % 2==0) {
            contador = (contador+1);
        }
        System.out.println(contador + " numeros han sido pares");
    }
}
