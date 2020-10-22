package U2.unit2.U2.T7;

import java.util.Scanner;

public class t7_ex2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca su edad por favor");
        int edad=teclado.nextInt();
        System.out.println("Introduzca su nivel de estudios por favor");
        int nivel_estudios= teclado.nextInt();
        System.out.println("Introduzca sus ingresos anuales por favor");
        int ingresos=teclado.nextInt();
        boolean botella= false;
        if (edad<29) {
            if (nivel_estudios>3) {
                if (ingresos>28000) {
                    botella= true;
                }
            }
        }
        System.out.println("la variable booleana es " + botella);

    }
}
