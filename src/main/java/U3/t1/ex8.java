package U3.t1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un numero entero");
        int num=sc.nextInt();
        funcion1(num);
    }
    public static void funcion1(int a){
        int i;
        int cont = 1;


            for (i = 1; i <= a; i++) {
                boolean s=false;
                cont = cont + 1;
                if (cont >= a)
                    cont = a - 1;

                if (s == false) {
                    if (a % cont == 0) {
                        s = true;
                    } else {
                        s = false;
                        System.out.println(cont);
                    }
                }

            }



    }
}
