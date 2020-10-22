package U2.unit2.U2.T6;

import java.util.Scanner;

public class t6_ex4_1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduzca un numero");
        byte numero1 = teclado.nextByte();
        System.out.println("introduzca otro numero");
        byte numero2 = teclado.nextByte();
        int menor=0;
        if (numero1<numero2) {
            menor=numero1;
        }
        else {
            menor=numero2;
        }
        System.out.println("el menor de los dos numeros sera " + menor);

    }
}
