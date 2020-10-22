package U2.unit2.T6;

import java.util.Scanner;

public class t6_ex4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un numero");
        byte numero1 = teclado.nextByte();
        System.out.println("introduzca otro numero");
        byte numero2 = teclado.nextByte();
        int menor = 0;
        menor = (numero2 < numero1) ? numero2 : numero1;
        System.out.println("el numero menor sera " + menor);
    }
}
