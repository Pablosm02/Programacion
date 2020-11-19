package U3.T3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("introduce la longitud de la clave");
        int longi=sc.nextInt();

        while (longi<0||longi>99999) {
            System.out.println("introduce la longitud de la clave(de 1 a 5 digitos)");

            longi=sc.nextInt();
        }

        int num= ((int) Math.random() * (int) (Math.pow(10,longi)-1));
        System.out.println(num);
    }
}
