package U2.unit2.U2.T5;

import java.util.Scanner;

public class t5_ex6 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double gravedad = 9.8;
        System.out.println("introduzca el tiempo para calcular la velocidad");
        int tiempo= Teclado.nextInt();
        if (tiempo>0) {
            System.out.println("la velocidad sera de " + gravedad*tiempo);
        }
        else {
            System.out.println("tiempo incorrecto");
        }


    }
}
