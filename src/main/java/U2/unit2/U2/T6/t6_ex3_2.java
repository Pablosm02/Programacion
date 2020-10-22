package U2.unit2.U2.T6;

import java.util.Scanner;

public class t6_ex3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int par = 0;
        System.out.println("introduzca un numero");
        int numero = teclado.nextInt();
       par=(numero%2==0) ? 1 : 0 ;
       System.out.println("la variable par es igual a " + par);
    }
}
