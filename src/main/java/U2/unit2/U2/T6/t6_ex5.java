package U2.unit2.U2.T6;

import java.util.Scanner;

public class t6_ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el radio de su circunferencia por favor");
        double radio = teclado.nextDouble();
        System.out.println("#1. Calcular diametro" +
                "#2. calcular perimetro" +
                "#3. calcular area");
        int numero = teclado.nextInt();
        if (numero<1) {
            System.out.println("ese numero no esta entre 1 y 3");
        }
        if (numero>3) {
            System.out.println("ese numero no esta entre 1 y 3");
        }
        if (numero==1) {
            System.out.println("el diametro de su circunferencia sera de " + radio*2 + "centimetros.");
        }
        else {
            if (numero==2) {
                System.out.println("el perimetro de su circunferencia sera de " + 2*radio*3.14 + "centimetros.");
            }
            else {
                System.out.println("el area de su circunferencia sera de " + radio*radio*3.14 + "centimetros cuadrados.");
            }
        }
    }
}
