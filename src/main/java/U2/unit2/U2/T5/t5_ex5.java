package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("introduzca el segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("introduzca el tercer numero");
        int numero3 = teclado.nextInt();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("el numero mayor es " + numero1);
            }
            else {
                System.out.println("el numero mayor es " + numero3);



            }
        }
        else {
            if (numero2<numero3) {
                System.out.println("el numero mayor es " + numero3);
            }
            else {
                System.out.println("el numero mayor es " + numero2);
            }
        }
    }
}



