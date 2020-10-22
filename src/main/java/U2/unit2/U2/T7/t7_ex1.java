package U2.unit2.U2.T7;

import java.util.Scanner;

public class t7_ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el primer numero (a)");
        int a= teclado.nextInt();
        System.out.println("introduzca el segundo numero (b)");
        int b= teclado.nextInt();
        int auxiliar =0;
        auxiliar=a;
        a=b;
        b=auxiliar;
        System.out.println("el numero a es " + a + " y el numero b es " + b);
    }
}
