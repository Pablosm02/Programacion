package Entregable;

import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca un numero");
        int numero=sc.nextInt();
        System.out.println("que numero quiere insertar");
        int insertar=sc.nextInt();
        System.out.println("en que posicion desea hacerlo");
        int posicion=sc.nextInt();
        String numCadena= String.valueOf(numero);
        int Longitud;
        Longitud = numCadena.length();
        if (Longitud>posicion) {
            String s1;
            String s2;
            s1=numCadena.substring(0, posicion-1);
            s2=numCadena.substring(posicion-1,Longitud);
            String numerofinal="";
            numerofinal=s1+insertar+s2;
            System.out.println(numerofinal);}
        else {
            System.out.println("error, la posicion indicada es mayor a la posibilidad");
        }




    }
}
