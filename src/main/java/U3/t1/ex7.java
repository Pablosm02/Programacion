package U3.t1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero par comprobar si es primo");
        int num = sc.nextInt();
        System.out.println("su numero " + funcion1(num) + " es primo");
    }

    public static String funcion1(int a) {
        int t;
        int cont = a;
        boolean s = false;
        for (t = 1; t < 6; t++) {
            cont = 1;
            int i;
            s = false;
            for (i = 1; i <= a; i++) {
                cont = cont + 1;
                if (cont >= a)
                    cont = a - 1;

                if (s == false) {
                    if (a % cont == 0) {
                        s = true;
                    } else {
                        s = false;
                    }
                }
            }

        }
        if (s == false) {
            return "si";
        } else {
            return "no";
        }
    }
}
