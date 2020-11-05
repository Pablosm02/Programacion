package U3.t1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un 1 si desea calcular el area y un 2 si desea calcular el volumen");
        int q=sc.nextInt();
        System.out.println("introduzca el radio de la base");
        double radio=sc.nextDouble();
        System.out.println("introduzca la altura del cilindro");
        double altura=sc.nextDouble();
        if (q==1){
            System.out.println(funcion1(radio,altura));
        }
        else {
        System.out.println(funcion2(radio, altura));
        }

        }

    public static double funcion1(double a,double b){
        double area=2*3.14*a*(a+b);
        return area;
    }
    public static double funcion2(double a, double b){
        double volumen;
        volumen=3.14*(a*a)*b;

        return volumen;
    }
}
